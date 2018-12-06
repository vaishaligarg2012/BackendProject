package com.backend.DAO;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.backend.ConfigHiber.SessionFactoryProvider;
import com.backend.Model.Category;
import com.backend.Model.Users;

public class CategoryDAOImpl implements CategoryDAO{
	SessionFactory sf=SessionFactoryProvider.getSessionFactory();
   
    
    //Can we create constructor for OpenSession() for not open in all method??
	
	 
	public boolean addCategory(Category cad) {
		// TODO Auto-generated method stub
		
		try {
			Session session=sf.openSession();
			//Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			session.save(cad);
			tx.commit();
			session.close();
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public List<Category> getAllCategory() {
		 List<Category> list = new ArrayList<Category>();
	       
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tx = session.getTransaction();
         tx.begin();
	    list =session.createQuery("from Category").list();

	    tx.commit();
	    System.out.println("check"+list);
        return list;
	}

}
