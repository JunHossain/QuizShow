/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.uap;

import java.util.List;

/**
 *
 * @author User
 */
public class Question {
    private String questionText;
    private String[] options;
    private String correctAnswer;

    public Question(String questionText, List<String> options, String correctAnswer) {
        this.questionText = questionText;
        this.options = (String[]) options.toArray();
        this.correctAnswer = correctAnswer;
    }
}

