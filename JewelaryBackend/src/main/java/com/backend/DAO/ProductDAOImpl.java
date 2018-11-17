package com.backend.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.backend.ConfigHiber.SessionFactoryProvider;
import com.backend.Model.Category;
import com.backend.Model.Product;

public class ProductDAOImpl implements ProductDAO{
	SessionFactory sf=SessionFactoryProvider.getSessionFactory();

	public boolean addProduct(Product p) {
		// TODO Auto-generated method stub
		Session session= sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(p);
		tx.commit();
		session.close();
		return true;
		
	}

	public List<Product> viewAllProduct() {
		// TODO Auto-generated method stub
		 List<Product> list = new ArrayList<Product>();
	       
			// TODO Auto-generated method stub
			Session session=sf.openSession();
			Transaction tx = session.getTransaction();
	         tx.begin();
		    list =session.createQuery("from Product").list();

		    tx.commit();
		    System.out.println("check"+list);
	        return list;

	}

}
