package pro.sky.java.course2.examineservice.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.java.course2.examineservice.domain.Question;
import pro.sky.java.course2.examineservice.service.ExaminerService;

import java.util.Collection;

@RestController
public class ExaminerController {

    private final ExaminerService service;

    public ExaminerController(ExaminerService service) {
        this.service = service;
    }

    @GetMapping("/exam/get/{amount}")
    public Collection<Question> getQuestion(@PathVariable int amount) {
        return service.getQuestion(amount);
    }
}
