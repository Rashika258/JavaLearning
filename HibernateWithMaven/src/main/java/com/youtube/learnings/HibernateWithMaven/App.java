package com.youtube.learnings.HibernateWithMaven;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
    	System.out.println("Project started....");
		//sessionfactory is interface and used as connection, to implement it Configuration() class is used
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		//creating student
		Student st=new Student();
		st.setId(2);
		st.setName("varsha");
		st.setCity("Bangalore");
		System.out.println(st);
		//creating object of address class
		Address ad=new Address();
		ad.setStreet("street 1");
		ad.setCity("Bangalore");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(1234.456);
		//reading image
		FileInputStream fis=new FileInputStream("src/main/java/org1.jpg");
		byte[] data=new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);
		//to save all the details
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(st);
		session.save(ad);
		//to see physical changes in database do commit
		tx.commit();
		session.close();
		System.out.println("Closed .....");
		System.out.println(factory);
		System.out.println(factory.isClosed());
    }
}
