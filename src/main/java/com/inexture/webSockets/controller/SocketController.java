package com.inexture.webSockets.controller;

import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.inexture.webSockets.model.LatLongModel;
import com.inexture.webSockets.model.UserResponse;
import com.inexture.webSockets.services.LatLongService;

@Controller
public class SocketController {
	
	 private static final Logger logger = LoggerFactory.getLogger(SocketController.class);
	
	@Autowired LatLongService latLongService;

	@MessageMapping("/user")
    @SendTo("/topic/user")
    public UserResponse getUser(LatLongModel latLong) {
		logger.info("Enterred api for socket request-response");
		latLong.setCurrentTime(new Date());
		latLong.setLatLongId(UUID.randomUUID());
		logger.info("Provide  values are "+ latLong.toString());
		latLongService.saveLatLong(latLong);
		logger.info("Values saved in db");
        return new UserResponse("your latitude is " + latLong.getLatitude() + "and longitude is "+ latLong.getLongitude());
    }
}
