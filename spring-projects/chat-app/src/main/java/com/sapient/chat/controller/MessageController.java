package com.sapient.chat.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.chat.dao.MessageDAO;
import com.sapient.chat.entity.Message;
import com.sapient.chat.interfaces.IMessageDAO;


// http://localhsot:8080/health 
// http://localhost:8080/api/message - GET 
//http://localhost:8080/api/message/101 - GET
//http://localhost:8080/api/message/102 - GET
//http://localhost:8080/api/message - POST 

@RestController
@RequestMapping("/api")
public class MessageController {

	private IMessageDAO dao = new MessageDAO(); 
	
	@GetMapping("/health")
	public String health() {
		return "Chat Service is UP... "; 
	}
	
	@GetMapping("/message")
	public List<Message> getAllMessage() {
		return dao.getAllMessages();
	}
	
	@GetMapping("/message/{mId}")
	public Message getMessage( @PathVariable int mId) {
		return dao.getMessage(mId); 
	}
	
	@PostMapping("/message")
	public String insertMessage(@RequestBody Message message) {
		return dao.saveMessage(message) ?"Inserted":"Not Inserted"; 
	}
	
	
}













