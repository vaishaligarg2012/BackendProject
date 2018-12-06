package com.backend.ConfigHiber;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class SessionFactoryProvider {
	private static SessionFactory sf;
	static {
		Configuration cfg=new Configuration();
		cfg.configure(); //will read the hibernate.cfg.xml file
		sf=cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory(){
		return sf;
	}
	
}
