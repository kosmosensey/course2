package pro.sky.java.course2.examineservice.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.examineservice.domain.Question;
import pro.sky.java.course2.examineservice.exception.InvalidQuestionException;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questions;

    public ExaminerServiceImpl(QuestionService questions) {
        this.questions = questions;
    }

    @Override
    public Collection<Question> getQuestion(int amount) {
        Set<Question> questionList = new HashSet<>();

        if (amount > questions.getAll().size()) {
            throw new InvalidQuestionException();
        }
        while (questionList.size() < amount) {
            questionList.add(questions.getRandomQuestion());
        }
        return Collections.unmodifiableCollection(questionList);
    }
}
