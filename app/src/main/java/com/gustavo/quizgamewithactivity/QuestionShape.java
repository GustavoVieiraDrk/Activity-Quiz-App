package com.gustavo.quizgamewithactivity;

public class QuestionShape {

    private String question, a, b, c, d;
    private int correctAns;

    public QuestionShape(String question, String a, String b, String c, String d, int correctAns) {
        this.question = question;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.correctAns = correctAns;
    }

    public String getQuestion() {
        return question;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }

    public int getCorrectAns() {
        return correctAns;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void setD(String d) {
        this.d = d;
    }

    public void setCorrectAns(int correctAns) {
        this.correctAns = correctAns;
    }
}
