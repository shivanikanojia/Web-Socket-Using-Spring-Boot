# Getting Started
## What is Web Socket?
WebSocket is a protocol, providing two way communication channels over a single TCP connection. WebSocket overcomes limitations with HTTP to allow for low latency communications between a user and a web service.
For more details on web sockets with spring visit : https://docs.spring.io/spring/docs/5.0.0.BUILD-SNAPSHOT/spring-framework-reference/html/websocket.html

## About Project
This project gives us the glimpse of how web sockets are implemented in spring boot and to certain level explains the socket connection at javascript as well. In this project STOMP messaging is used with Spring to create an interactive web application.
Here server will accept a message carrying a latitude and longitude values. In response, it will push a values into a queue that the client is subscribed to and saves those values. On the other hand there is a schedular running ever 3 seconds until the connection is lost.
### Reference Documentation
For detailed reference, please visit : https://spring.io/guides/gs/messaging-stomp-websocket/


