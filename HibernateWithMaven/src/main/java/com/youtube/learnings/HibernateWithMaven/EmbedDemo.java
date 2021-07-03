package com.youtube.learnings.HibernateWithMaven;

import javax.persistence.Embeddable;

import org.hibernate.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//embeddable is used to add new columns in existing table or entity


public class EmbedDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
		Student s1=new Student();
		s1.setId(5);
		s1.setName("Kavana");
		s1.setCity("Delhi");
		
		Certificate certificate1=new Certificate();
		certificate1.setCourse("Android");
		certificate1.setDuration("2 months");
		
		s1.setCerti(certificate1);
		
		Student s2=new Student();
		s2.setId(6);
		s2.setName("Kirthan");
		s2.setCity("Delhi");
		
		Certificate certificate2=new Certificate();
		certificate2.setCourse("Web");
		certificate2.setDuration("2 months");
		
		s2.setCerti(certificate2);
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
		//object save
		s.save(s1);
		s.save(s2);
		tx.commit();
		s.close();
		factory.close();
		
		
	}
}
