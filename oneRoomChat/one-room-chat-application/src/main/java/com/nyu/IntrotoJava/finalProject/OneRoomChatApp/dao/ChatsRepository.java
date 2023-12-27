package com.nyu.IntrotoJava.finalProject.OneRoomChatApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nyu.IntrotoJava.finalProject.OneRoomChatApp.models.Chats;

public interface ChatsRepository extends JpaRepository<Chats, Long> {

	public List<Chats> findAllByOrderByMessageDateAsc();
}
