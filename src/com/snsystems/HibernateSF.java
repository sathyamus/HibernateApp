package com.snsystems;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSF {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		// "hibernate.cfg.xml"
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		 SessionFactory sessionFactory = configuration.buildSessionFactory();
		 Session session = sessionFactory.openSession();
//		 session.createQuery("");

	}

}
