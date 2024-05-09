/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.uap;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
    private Boolean lockedIn = false;
    Question question = new Question();

    public GameStage() {

    }

    public GameStage(String playerName, String difficultyLevel) throws IOException, FontFormatException {
        initComponents();
        this.playerName = playerName;
        this.difficultyLevel = difficultyLevel;
        questionLabel.setText(question.print(difficultyLevel));
        playerNameLabel.setText("Player: " + playerName);
        loadOptions(difficultyLevel);
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
        answerValidityLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        playerNameLabel.setText("player");

        nextButton.setBackground(new java.awt.Color(0, 204, 153));
        nextButton.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        nextButton.setForeground(new java.awt.Color(51, 51, 51));
        nextButton.setText("NEXT");
        nextButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(0, 204, 153));
        resetButton.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        resetButton.setForeground(new java.awt.Color(51, 51, 51));
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
        optionAButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                optionAButtonStateChanged(evt);
            }
        });
        optionAButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optionAButtonMouseClicked(evt);
            }
        });
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

        lockButton.setBackground(new java.awt.Color(98, 221, 180));
        lockButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lockButton.setText("Lock");
        lockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockButtonActionPerformed(evt);
            }
        });

        answerValidityLabel.setBackground(new java.awt.Color(51, 255, 51));
        answerValidityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/2316.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(963, 963, 963)
                .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(optionAButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(lockButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(842, 842, 842)
                .addComponent(optionBButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(optionCButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(537, 537, 537)
                .addComponent(answerValidityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(850, 850, 850)
                .addComponent(optionDButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(1110, 1110, 1110)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(playerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(optionAButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201)
                .addComponent(lockButton)
                .addGap(32, 32, 32)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(optionBButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(481, 481, 481)
                .addComponent(optionCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(635, 635, 635)
                .addComponent(answerValidityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(optionDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(650, 650, 650)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(playerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionCButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_optionCButtonActionPerformed
        if (optionCButton.isSelected()) {
            selectedButton = optionCButton;
        }
    }// GEN-LAST:event_optionCButtonActionPerformed

    private void lockButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {// GEN-FIRST:event_lockButtonActionPerformed
        lockButton.setEnabled(false);
        nextButton.setEnabled(true);
        totalQuestionsAsked++;
        System.out.println(selectedButton.getText());
        System.out.println(question.getCorrectAnswer(difficultyLevel));
        if (Objects.equals(selectedButton.getText(), question.getCorrectAnswer(difficultyLevel))) {
            correctAnswers++;
        }
        scoreLabel.setText("Score: " + correctAnswers + "/" + totalQuestionsAsked + "/" + NUMBER_OF_TOTAL_QUESTIONS);
        answerConfirmationLabel();

    }// GEN-LAST:event_lockButtonActionPerformed

    private void answerConfirmationLabel() throws IOException {
        if (Objects.equals(selectedButton.getText(), question.getCorrectAnswer(difficultyLevel))) {
            answerValidityLabel.setText("Correct Answer");
            answerValidityLabel.setFont(new Font("Gabriola", Font.PLAIN, 45));
            answerValidityLabel.setForeground(new java.awt.Color(51, 255, 51));
        } else {
            answerValidityLabel.setText("Wrong Answer");
            answerValidityLabel.setFont(new Font("Gabriola", Font.PLAIN, 45));
            answerValidityLabel.setForeground(new java.awt.Color(255, 0, 51));
        }
    }

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_resetButtonActionPerformed
        this.dispose();
        new Difficulty(this.playerName).setVisible(true);
    }// GEN-LAST:event_resetButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nextButtonActionPerformed
        try {
            questionLabel.setText(question.print(difficultyLevel));
            loadOptions(difficultyLevel);
            optionsButtonGroup.clearSelection();
            nextButton.setEnabled(false);
            lockButton.setEnabled(true);
            answerValidityLabel.setText("");
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
    private javax.swing.JLabel answerValidityLabel;
    private javax.swing.JLabel jLabel1;
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
