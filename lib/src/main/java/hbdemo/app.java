package hbdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class app {

	public static void main(String[] args) throws Exception{

		laptop l1 = new laptop();
		laptop l2 = new laptop();
		l1.setLid(101);
		l1.setLname("hp");
		l2.setLid(102);
		l2.setLname("dell");
		student s1= new student();
		s1.setRollno(1);
		s1.setName("ritesh");
		s1.setMarks(87);
		l1.setS1(s1);
		l2.setS1(s1);
		//s1.getL1().add(l1);
		//l1.getS1().add(s1);
		Configuration config = new Configuration().configure().addAnnotatedClass(student.class).addAnnotatedClass(laptop.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(s1);
		session.save(l1);
		session.save(l2);
		/*laptop l2 = session.get(laptop.class, 101);
		System.out.println(l2.getLname());
		laptop l3 = session.get(laptop.class, 101);
		System.out.println(l3.getLname());*/
		tx.commit();
		session.close();
		sessionFactory.close();
		
	}

}