package com.quizapplication;

public class Question {
	    private int questionId;
	    private String questionText;
	    private String[] options;
	    private int correctAnswer;
	    public Question(int questionId, String questionText, String[] options, int correctAnswer) {
	        this.questionId = questionId;
	        this.questionText = questionText;
	        this.options = options;
	        this.correctAnswer = correctAnswer;
	    }

	    public int getQuestionId() {
	        return questionId;
	    }

	    public String getQuestionText() {
	        return questionText;
	    }

	    public String[] getOptions() {
	        return options;
	    }

	    public int getCorrectAnswer() {
	        return correctAnswer;
	    }
	}

