package com.sapient.client;

import com.sapient.dao.MessageDAO;
import com.sapient.entity.Message;
import com.sapient.interfaces.IMessageDAO;

public class App {
	public static void main(String[] args) {
		Message m = new Message(); 
		m.setmId(101);
		m.setSenderId(123);
		m.setRecevrId(333);
		m.setMessage("Hello How Are You");
		m.setIsAccepted("Y");
		
		IMessageDAO dao = new MessageDAO(); 
		
		System.out.println(dao.saveMessage(m) ? "Inserted":"Not Inserted");  
		
	}
}