/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.uap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Objects;
import javax.swing.*;

/**
 * @author User
 */
public class GameStage extends javax.swing.JFrame {

    /**
     * Creates new form GameStage
     */
    private final int NUMBER_OF_TOTAL_QUESTIONS = 5;
    private int totalQuestionsAsked = 0;
    private int correctAnswers = 0;
    private String playerName;
    private String difficultyLevel;
    JRadioButton selectedButton;
    Question question = new Question();

    public GameStage() {

    }

    public GameStage(String playerName, String difficultyLevel) throws IOException {
        initComponents();
        this.playerName = playerName;
        this.difficultyLevel = difficultyLevel;
        questionLabel.setText(question.print(difficultyLevel));
        playerNameLabel.setText("Player: " + playerName);
        loadOptions(difficultyLevel);
        nextButton.setEnabled(false);
    }

    public void loadOptions(String difficultyLevel) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(difficultyLevel + ".txt"));
        String line;
        int currentLineNumber = 0;
        int lineNumber = question.getLineNumber();
        while ((line = in.readLine()) != null) {
            currentLineNumber++;
            if (currentLineNumber == lineNumber + 1) {

                optionAButton.setText(line);
            } else if (currentLineNumber == lineNumber + 2) {

                optionBButton.setText(line);
            } else if (currentLineNumber == lineNumber + 3) {

                optionCButton.setText(line);
            } else if (currentLineNumber == lineNumber + 4) {

                optionDButton.setText(line);
            }
        }
        in.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionsButtonGroup = new javax.swing.ButtonGroup();
        playerNameLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        questionLabel = new javax.swing.JLabel();
        optionBButton = new javax.swing.JRadioButton();
        optionCButton = new javax.swing.JRadioButton();
        optionAButton = new javax.swing.JRadioButton();
        optionDButton = new javax.swing.JRadioButton();
        scoreLabel = new javax.swing.JLabel();
        lockButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        playerNameLabel.setText("player");

        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        questionLabel.setFont(new java.awt.Font("Oxanium SemiBold", 1, 24)); // NOI18N
        questionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionLabel.setText("question");

        optionsButtonGroup.add(optionBButton);
        optionBButton.setText("jRadioButton1");
        optionBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionBButtonActionPerformed(evt);
            }
        });

        optionsButtonGroup.add(optionCButton);
        optionCButton.setText("jRadioButton1");
        optionCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionCButtonActionPerformed(evt);
            }
        });

        optionsButtonGroup.add(optionAButton);
        optionAButton.setText("jRadioButton1");
        optionAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionAButtonActionPerformed(evt);
            }
        });

        optionsButtonGroup.add(optionDButton);
        optionDButton.setText("jRadioButton1");
        optionDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionDButtonActionPerformed(evt);
            }
        });

        scoreLabel.setText("Score: ");

        lockButton.setBackground(new java.awt.Color(255, 255, 102));
        lockButton.setText("Lock");
        lockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    lockButtonActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(193, 193, 193)
                                                        .addComponent(playerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(110, 110, 110)
                                                        .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(314, 314, 314)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lockButton)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(optionAButton)
                                                                        .addComponent(optionCButton))
                                                                .addGap(445, 445, 445)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(optionBButton)
                                                                        .addComponent(optionDButton))))))
                                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(playerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(optionBButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(optionAButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(optionDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(optionCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(85, 85, 85)
                                                .addComponent(lockButton)
                                                .addGap(0, 150, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionCButtonActionPerformed
        if (optionCButton.isSelected()) {
            selectedButton = optionCButton;
        }
    }//GEN-LAST:event_optionCButtonActionPerformed

    private void lockButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_lockButtonActionPerformed
        lockButton.setEnabled(false);
        nextButton.setEnabled(true);
        totalQuestionsAsked++;
        System.out.println(selectedButton.getText());
        System.out.println(question.getCorrectAnswer(difficultyLevel));
        if (Objects.equals(selectedButton.getText(), question.getCorrectAnswer(difficultyLevel))) {
            correctAnswers++;
        }
        scoreLabel.setText("Score: " + correctAnswers + "/" + totalQuestionsAsked + "/" + NUMBER_OF_TOTAL_QUESTIONS);

    }//GEN-LAST:event_lockButtonActionPerformed


    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_resetButtonActionPerformed
        this.dispose();
        new Difficulty(this.playerName).setVisible(true);
    }// GEN-LAST:event_resetButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nextButtonActionPerformed
        try {
            questionLabel.setText(question.print(difficultyLevel));
            nextButton.setEnabled(false);
            loadOptions(difficultyLevel);
            optionsButtonGroup.clearSelection();
            lockButton.setEnabled(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }// GEN-LAST:event_nextButtonActionPerformed

    private void optionBButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_optionBButtonActionPerformed
        if (optionBButton.isSelected()) {
            selectedButton = optionBButton;
        }
    }// GEN-LAST:event_optionBButtonActionPerformed

    private void optionDButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_optionDButtonActionPerformed
        if (optionDButton.isSelected()) {
            selectedButton = optionDButton;
        }
    }// GEN-LAST:event_optionDButtonActionPerformed

    private void optionAButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_optionAButtonActionPerformed
        if (optionAButton.isSelected()) {
            selectedButton = optionAButton;
        }
    }// GEN-LAST:event_optionAButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameStage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameStage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameStage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameStage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameStage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton lockButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JRadioButton optionAButton;
    private javax.swing.JRadioButton optionBButton;
    private javax.swing.JRadioButton optionCButton;
    private javax.swing.JRadioButton optionDButton;
    private javax.swing.ButtonGroup optionsButtonGroup;
    private javax.swing.JLabel playerNameLabel;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel scoreLabel;
    // End of variables declaration//GEN-END:variables
}
