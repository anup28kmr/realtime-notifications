package com.ak.notification.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {

  @MessageMapping("/notification")
  @SendTo("/topic/notification")
  public String sendMessage(String notification) {
    System.out.println("Notification received: " + notification);
    return notification;
  }
}
