package com.nyu.IntrotoJava.finalProject.OneRoomChatApp.controllers;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nyu.IntrotoJava.finalProject.OneRoomChatApp.models.Chats;
import com.nyu.IntrotoJava.finalProject.OneRoomChatApp.response.AllChatsResponse;
import com.nyu.IntrotoJava.finalProject.OneRoomChatApp.services.ChatServiceImpl;


@RestController
@RequestMapping("/chats")
public class ChatsController {
	
	@Autowired
	ChatServiceImpl chatService;
	
	@GetMapping(path = "")
	public ResponseEntity<Object> findAllUser() {
		List<AllChatsResponse> response = new ArrayList<AllChatsResponse>();
		List<Chats> allChats = chatService.findAllChats();
		for(Chats chat : allChats) {
			AllChatsResponse oldChat = new AllChatsResponse();
			oldChat.setMessageText(chat.getMessageText());
			oldChat.setMsgDate(chat.getMessageDate());
			oldChat.setMsgId(chat.getId());
			oldChat.setUserId(chat.getUser().getUserId());
			oldChat.setUsername(chat.getUser().getUsername());
			response.add(oldChat);
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

}
