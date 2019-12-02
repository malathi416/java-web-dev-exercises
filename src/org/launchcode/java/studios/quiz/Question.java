package org.launchcode.java.studios.quiz;

public class Question {
    protected int questionNumber ;
    protected String questionPrompt;
    protected String answers;

    public Question(int questionNumber,String question){
        this.questionNumber = questionNumber;
        this.questionPrompt = question;
    }
    public void displayQuestionPrompt(){

    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public String getQuestion() {
        return questionPrompt;
    }
}
