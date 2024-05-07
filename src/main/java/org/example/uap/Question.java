/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.uap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;

/**
 * @author User
 */
public class Question {
    private String questionText;
    private String[] options;
    private String correctAnswer;
    private int lineNumber;

    public int getLineNumber() {
        return lineNumber;
    }

    public Question() {

    }

    private int randomNumberGenerator() {
        int[] numbers = {1, 8, 15, 22, 29, 36, 43, 50, 57, 64};
        Random rng = new Random();
        int randomIndex = rng.nextInt(numbers.length);
        return numbers[randomIndex];
    }

    public String print(String difficultyLevel) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(difficultyLevel + ".txt"));
        String line = null;
        lineNumber = randomNumberGenerator();
        int currentLineNumber = 0;
        while ((line = in.readLine()) != null) {
            currentLineNumber++;
            if (currentLineNumber == lineNumber) {
                in.close();
                return line;
            }
        }
        in.close();
        return null;
    }
}

