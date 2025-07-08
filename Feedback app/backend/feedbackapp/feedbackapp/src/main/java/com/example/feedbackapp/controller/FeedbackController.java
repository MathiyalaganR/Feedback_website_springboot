package com.example.feedbackapp.controller;

import com.example.feedbackapp.model.Feedback;
import com.example.feedbackapp.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @PostMapping("/feedback")
    public Feedback submitFeedback(@RequestBody Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @GetMapping("/feedback")
    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }
}
