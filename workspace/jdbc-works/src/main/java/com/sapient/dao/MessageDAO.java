package com.sapient.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.sapient.entity.Message;
import com.sapient.interfaces.IMessageDAO;
import com.sapient.utils.GetConnection;

public class MessageDAO  implements IMessageDAO{

	public boolean saveMessage(Message message) {
		String sql ="insert into message values(?,?,?,?,?)";
		
		
		try {
			PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, message.getmId());
			ps.setInt(2, message.getSenderId());
			ps.setInt(3, message.getRecevrId());
			ps.setString(4, message.getMessage());
			ps.setString(5, message.getIsAccepted());
			
			
			return ps.executeUpdate() >0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	public Message getMessage(int mId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Message> getAllMessages() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
