package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapClient {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("com/mapping/hibernate.cfg.xml");

		// creating session factory object

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		// Creating question
		Question question1 = new Question();
		question1.setQuestionId(1212);
		question1.setQuestion("What is java ?");

		// Creating answer
		Answer answer1 = new Answer();
		answer1.setAnswerId(177);
		answer1.setAnswer("Java is programing language");

		question1.setAnswer(answer1);

		// -----------------------------------------------------------------------------------
		// Creating 2nd question answer
		Question question2 = new Question();
		question2.setQuestionId(1213);
		question2.setQuestion("What is functional interface  ?");

		// Creating answer
		Answer answer2 = new Answer();
		answer2.setAnswerId(1244);
		answer2.setAnswer("A interface which have only one abstract method .");

		question2.setAnswer(answer2);

		// ---------------------------------------------------------------------------
		// -----------------------------------------------------------------------------------
		// Creating 2nd question answer
		Question question3 = new Question();
		question3.setQuestionId(1214);
		question3.setQuestion("What is inheritance ?");

		// Creating answer
		Answer answer3 = new Answer();
		answer3.setAnswerId(1246);
		answer3.setAnswer("The process of acquaring property from parent to child is called inheritance.");
		question3.setAnswer(answer3);

		// ---------------------------------------------------------------------------

		// session
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(question1);
		session.save(question2);
		session.save(question3);
		session.save(answer1);
		session.save(answer2);
		session.save(answer3);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
