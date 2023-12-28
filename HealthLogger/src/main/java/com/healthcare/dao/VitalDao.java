package com.healthcare.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.healthcare.entity.Vital;
import com.healthcare.resource.SessionFactoryResource;

public class VitalDao {

	public int storeVital(Vital vital) {
		try {
			SessionFactory sf = SessionFactoryResource.getSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
				session.save(vital);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}

}
