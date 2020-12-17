package com.company;

import java.util.HashMap;

public class MultipleChoice extends Question{
    //List<String> possibleAnswer;
    HashMap<String, String> possibleAnswer;
    String  correctAnswer;
//    public MultipleChoice() {
//
//    }

    public MultipleChoice(String question, int userAnswer, int correctAnswer) {
        super(question, userAnswer, correctAnswer);
    }

    public void displayAnswers(){

    }

    public boolean isAnswerCorrect(String guess){

    }
}


