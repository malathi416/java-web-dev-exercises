package org.launchcode.java.studios.quiz;


import java.util.ArrayList;

public class MultipleChoice extends Question {
    public ArrayList<String> choices;
    public MultipleChoice(int questionNumber,String question){
        super(questionNumber,question);
    }
}
