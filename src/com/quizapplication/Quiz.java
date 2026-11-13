package com.quizapplication;
import java.util.ArrayList;
import java.util.Scanner;
public class Quiz {
	private ArrayList<Question> questions = new ArrayList<>();
	public void addQuestion(Question q) {
	    questions.add(q);
	}
	public void displayQuestions() {
	    for (Question q : questions) {
	        System.out.println(q.getQuestionId() + ". " + q.getQuestionText());
	        String[] options = q.getOptions();
	        for (int i = 0; i < options.length; i++) {
	            System.out.println((i + 1) + ". " + options[i]);

	        }
	    }
	}
	public void startQuiz() {
	    Scanner sc = new Scanner(System.in);
	    int score = 0;
	    for (Question q : questions) {
	        System.out.println(q.getQuestionId() + ". " + q.getQuestionText());
	        String[] options = q.getOptions();
	        for (int i = 0; i < options.length; i++) {
	            System.out.println((i + 1) + ". " + options[i]);
	        }
	        System.out.println("Enter your answer (1-4):");
	        int answer = sc.nextInt();
	        if (answer == q.getCorrectAnswer()) {
	            System.out.println("Correct answer!");
	            score++;
	        } else {
	            System.out.println("Wrong answer!");
	        }
	    }

	    System.out.println("Your final score: " + score + "/" + questions.size());
	}
}
