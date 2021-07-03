package youtube.learnings;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Project started....");
		//sessionfactory is interface and used as connection, to implement it Configuration() class is used
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		System.out.println(factory);
		System.out.println(factory.isClosed());
	}

}
