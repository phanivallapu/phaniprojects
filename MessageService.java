package com.phani.services;

import java.util.ArrayList;
import java.util.List;

import com.phani.model.Message;

public class MessageService {
   List<Message> msgList= new ArrayList<Message>();
   
     public MessageService(){
    	msgList.add(new Message(1,"hello","phani"));
    	msgList.add(new Message(2,"bolo","vallapu"));
     }
   
     public List<Message> getAllMessages(){
    	return msgList; 
     }
     public Message getMessageById(String id){
    	 for(Message m: msgList){
    		 if(m.getId()== Integer.parseInt(id))
    			 return m;
    	 }
    	 return null;
     }
     public Message writeNewMessage(Message m){
    	 msgList.add(m);
    	 return m;
     }
}
