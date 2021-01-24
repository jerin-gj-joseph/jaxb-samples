package com.jerin.jaxb.main;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.jerin.jaxb.model.Attribute;
import com.jerin.jaxb.model.SecurePass;
import com.jerin.jaxb.model.Site;
import com.jerin.jaxb.model.User;

public class JAXBTestMain {

	public static void main(String[] args) {
		
		JAXBTestMain jaxbMain = new JAXBTestMain();
		
		jaxbMain.writeXML();
		
		jaxbMain.readXML();
		
		
		

	}
	
	private void readXML() {
		
		try {
			File outputFile = new File("SecurePass.xml");
			JAXBContext context = JAXBContext.newInstance(SecurePass.class);
			Unmarshaller marshaller = context.createUnmarshaller();
			Object o = marshaller.unmarshal(outputFile);
			SecurePass sp = (SecurePass)o;
			System.out.println("sp: "+sp);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	
	private void writeXML() {
		try {
			
			SecurePass sp = new SecurePass();
			sp.setUsers(getUsers());
			
			
			File outputFile = new File("SecurePass.xml");
			System.out.println("File Name: "+outputFile.getAbsolutePath());
			JAXBContext context = JAXBContext.newInstance(SecurePass.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			marshaller.marshal(sp, outputFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private  List<User> getUsers(){
		
		List<User> userList = new ArrayList<>();
		User jerin = new User("Jerin", "Joseph", "jerinj",  "jerinPass", "jerinPassPhrase");
		jerin.addSites(getTestSites());

		User john = new User("John", "Smith", "johns",  "johnPass", "johnPassPhrase");
		john.addSites(getTestSites());
		john.setLastFailedAttempt(new Date());
		
		User demo = new User("Demo", "User", "demo",  "demo", "demo");
		demo.addSites(getTestSites());
		demo.setLastFailedAttempt(new Date());

		userList.add(jerin);
		userList.add(john);
		userList.add(demo);

		return userList;
	}
	
	private List<Site> getTestSites(){
		
		List<Site> siteList = new ArrayList<>();
		siteList.add(new Site("Amazon", "amzUser", "amzPass"));
		siteList.add(new Site("Yahoo", "yahUser", "yahPass"));
		siteList.add(new Site("Gmail", "gmlUser", "gmlPass"));
		siteList.add(new Site("Outlook", "outUser", "outPass"));
		siteList.add(new Site("BOA", "boaUser", "boaPass"));
		return addAttributes(siteList);
		
	}
	
	
	private List<Site> addAttributes(List<Site> siteList){
		
		for(Site site: siteList) {
			site.getAttributeList().add(new Attribute("ATM PIN", "1122"));
			site.getAttributeList().add(new Attribute("Customer Care No", "888-232-8757"));
			site.getAttributeList().add(new Attribute("Pass Phrase", "Spell it out!"));
		}

		return siteList;
	}

}
