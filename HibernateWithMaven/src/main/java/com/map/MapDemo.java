package com.map;


import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating question
		Question q1=new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("What is Java?");
		
		//creating answer
		Answer a1=new Answer();
		a1.setAnswerId(343);
		a1.setAnswer("Java is programming language");
		a1.setQuestion(q1);
		
		//assigning answer to question
		q1.setAnswer(a1);
		
		//creating question
				Question q2=new Question();
				q2.setQuestionId(1213);
				q2.setQuestion("What is Collection?");
				
				//creating answer
				Answer a2=new Answer();
				a2.setAnswerId(344);
				a2.setAnswer("API to work with objects in java");
				a2.setQuestion(q2);
				//assigning answer to question
				q2.setAnswer(a2);
		//session
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		//save
		s.save(q1);
		s.save(q2);
		s.save(a1);
		s.save(a2);
		tx.commit();
		
		Question newQ=(Question)s.get(Question.class, 1212);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());
		s.close();
		factory.close();
		
	}
}
