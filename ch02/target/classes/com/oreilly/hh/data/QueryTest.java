package com.oreilly.hh.data;



import java.sql.Time;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryTest
{
	public static void main(String args[]) throws Exception
	{
		Configuration config= new Configuration();
		 config.configure();
		 
		 
		 SessionFactory sef = config.buildSessionFactory();
		 Session sess= sef.openSession();
		QueryTest queryTest=new QueryTest();
		
		try
		{
			
			List<Track> lsttrack=queryTest.tracksNoLongerThan(Time.valueOf("00:03:34"),sess);
			for(Track track:lsttrack)
			{
				System.out.println("Track Tile:"+track.getTitle());
				System.out.println("Track Playtime:"+track.getPlayTime());
			}
			lsttrack=queryTest.getTracksContainingFilePath("vol2",sess);
			for(Track track:lsttrack)
			{
				System.out.println("Track Tile:"+track.getTitle());
				System.out.println("Track Playtime:"+track.getPlayTime());
			}
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
		finally
		{
			sess.close();
		}
		sef.close();
		
	}

	private List<Track> getTracksContainingFilePath(String fielpath, Session sess) {
		// TODO Auto-generated method stub
		Query query=sess.createQuery("from Track as track where track.filePath='%?%'");
		query.setParameter(0,fielpath,Hibernate.STRING);
		return null;
	}

	private  List<Track> tracksNoLongerThan(Time length, Session session) {
		// TODO Auto-generated method stub
		Query query=session.createQuery("from Track as track where track.playTime<=?");
		query.setParameter(0, length,Hibernate.TIME);
		return query.list();
		
	}
}