package com.sapient.message.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sapient.dao.MessageDAO;
import com.sapient.entity.Message;
import com.sapient.interfaces.IMessageDAO;

public class MessageTest {

	private Message m = null;
	private IMessageDAO  dao = null;
	
	@Before
	public void setUp() {
		m = new Message();
		dao = new MessageDAO(); 

		m.setmId(103);
		m.setSenderId(124);
		m.setRecevrId(123);
		m.setMessage("cya");
		m.setIsAccepted("N");
		
	}
	
	
	@Test
	public void messagePostTest() {
		// expecting vs actuals 
		assertEquals(true, dao.saveMessage(m));
	}

	
	
	@Test
	public void messageGetAllTest() {
		assertEquals(3, dao.getAllMessages().size());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
