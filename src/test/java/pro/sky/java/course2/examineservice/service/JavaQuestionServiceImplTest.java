package pro.sky.java.course2.examineservice.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.examineservice.domain.Question;
import pro.sky.java.course2.examineservice.exception.AlreadyQuestionException;

import static org.junit.jupiter.api.Assertions.*;

public class JavaQuestionServiceImplTest {
    private Question questionOne;
    private Question questionDuplicate;
    private Question questionTwo;

    QuestionService questionService = new JavaQuestionService();

    @BeforeEach
    void setUp() {
        questionOne = new Question("one_question", "one_answer");
        questionDuplicate = new Question("one_question", "one_answer");
        questionTwo = new Question("two_question", "two_answer");
    }

    @Test
    void add() {
        questionService.add(questionOne);
        assertThrows(AlreadyQuestionException.class, () -> questionService.add(questionDuplicate));
    }

    @Test
    void remove() {
        Question actual = questionService.add(questionOne);
        Question expected = questionService.remove(questionDuplicate);
        assertEquals(expected, actual);
    }

    @Test
    void getAll() {
        questionService.add(questionOne);
        questionService.add(questionTwo);

        int actual = questionService.getAll().size();
        int expected = 2;

        assertEquals(expected, actual);
    }
}