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
    private final int[] numbers = {1, 8, 15, 22, 29, 36, 43, 50, 57, 64};
    private int randomIndex;
    private int lineNumber;

    public int getLineNumber() {
        return lineNumber;
    }

    public Question() {

    }

    private int randomNumberGenerator() {
        Random rng = new Random();
        randomIndex = rng.nextInt(numbers.length);
        return numbers[randomIndex];
    }

    public String print(String difficultyLevel) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(difficultyLevel + ".txt"));
        String line;
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

    public String getCorrectAnswer(String difficultyLevel) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(difficultyLevel + ".txt"));
        String line;
        int currentLineNumber = 0;
        while ((line = in.readLine()) != null) {
            currentLineNumber++;
            if (currentLineNumber == numbers[randomIndex]+5) {
                in.close();
                return line;
            }
        }
        in.close();
        return null;
    }
}

