package youtube.learnings.HibernateDemo;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee e1=new Employee();
        e1.setEid(2);
        e1.setEname("rashmita");
        e1.setEage(20);
        //using default configuration file so nothing is passed inside configure if name is changed then changed name as followed
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf=con.buildSessionFactory(sr);
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        //to fetch data from databasr
        e1=(Employee)session.get(Employee.class,1);
        //        session.save(e1);
        tx.commit();
        System.out.println(e1);
    }
}
