package com.youtube.learnings.HibernateWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		//get Student class
//		Student student=(Student)session.get(Student.class,2);
		Student student=(Student)session.load(Student.class,2);
		Address address=(Address)session.get(Address.class,1);
		System.out.println(address.getStreet()+" : "+address.getCity());
		Address address1=(Address)session.get(Address.class,2);
		System.out.println(address1.getStreet()+" : "+address1.getCity());
		System.out.println(address);
		System.out.println(address.getStreet()+" : "+address.getCity());
		System.out.println(student);
		session.close();
		factory.close();
	}
}
