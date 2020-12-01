package mypack.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class ConnectionProvider {
	
	public static SessionFactory factory;
	
	public static SessionFactory getFactory() {
		
		if(factory==null) {
			
			
			
			StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("/mypack/resource/hibernate.cfg.xml").build(); 
			
			 Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
			 
			factory=meta.buildSessionFactory();
			 
			
			
		}
		
		return factory;
		
	}
	
	public static void getcloseFactory() {
		
		if(factory.isOpen()) {
			
			factory.close();
		}
		
		
	}

}
