package edu.icet.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
@CrossOrigin(origins = "http://localhost:5173")
public class ItemController {

    @GetMapping("/name")
    public String getItem() {
        return "glasses";
    }
}
