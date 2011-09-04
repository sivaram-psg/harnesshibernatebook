package com.oreilly.hh.data;
import com.oreilly.hh.data.Track;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
 import org.hibernate.cfg.Configuration;
 
 import java.sql.Time;
import java.util.Date;
 
 public class CreateTest
 {
	 public static void main(String args[]) throws Exception
	 {
		 Configuration config= new Configuration();
		 config.configure();
		 
		 
		 SessionFactory sef = config.buildSessionFactory();
		 Session sess= sef.openSession();
		 
		 Transaction tx = null;
		 try
		 {
		  
			 tx=sess.beginTransaction();
		  Track track=new Track("indian Trance","vol2/track2.mp3",Time.valueOf("00:03:30"),new Date(),(short)0);
		  sess.save(track);
		  track=new Track("Video filled the radio star","vol2/track3.mp3",Time.valueOf("00:03:34"),new Date(),(short)1);
		  sess.save(track);
		  tx.commit();
		 }
		 catch(Exception exc)
		 {
			 if(tx!=null)
			 {
				 //something went wrong rollback
				 tx.rollback();
			 }
			 throw new Exception("Transaction failed",exc);
			 
		 }
		 finally
		 {
			 sess.close();
		 }
		 sef.close();
	 }
 }