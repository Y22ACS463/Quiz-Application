package com.quizapplication;

public class QuizApplication {
public static void main(String[] args) {
	Quiz quiz = new Quiz();
	Question q1 = new Question(1,
		    "Which language is used for Android development?",
		    new String[]{"Java", "HTML", "CSS", "SQL"},
		    1
		);
	Question q2 = new Question(2,
		    "Which of the following is not a programming language?",
		    new String[]{"Java", "Python", "HTML", "C"},
		    3
		);

		Question q3 = new Question(3,
		    "Which keyword is used to create an object in Java?",
		    new String[]{"class", "new", "static", "void"},
		    2
		);

		Question q4 = new Question(4,
		    "Which collection allows duplicate elements?",
		    new String[]{"HashSet", "ArrayList", "TreeSet", "None"},
		    2
		);

		Question q5 = new Question(5,
		    "Which method is the entry point of a Java program?",
		    new String[]{"start()", "run()", "main()", "execute()"},
		    3
		);
	quiz.addQuestion(q1);
	quiz.addQuestion(q2);
	quiz.addQuestion(q3);
	quiz.addQuestion(q4);
	quiz.addQuestion(q5);
	quiz.startQuiz();
}
}
