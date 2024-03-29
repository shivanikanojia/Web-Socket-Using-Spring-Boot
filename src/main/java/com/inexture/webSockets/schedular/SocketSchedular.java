package com.inexture.webSockets.schedular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.inexture.webSockets.model.UserResponse;

@EnableScheduling
@Configuration
public class SocketSchedular {

	@Autowired
	SimpMessagingTemplate template;

	/**
	 * Scheduler for sending values when socket connectio is open
	 */
	@Scheduled(fixedDelay = 3000)
	public void sendAdhocMessages() {
		template.convertAndSend("/topic/user", new UserResponse("Fixed Delay Scheduler"));
	}
}
