# One Room Chat App

This project aims to develop a real-time multi-user chat application with a single chat room that allows users to communicate with each other. The application will have a React-based front-end, a Java Spring Boot back-end with a PostgreSQL database and Kafka as streams processing component.

## Demo

The demo video can be found at the root of this project

## Features

- User registration and authentication
- Dashboard for multiple users to login into a single chat room
- Send and receive messages in real-time in the chat room using web sockets
- PostgreSQL database to store user details and chat messages
- Kafka server for queueing messages into the database
- React front-end with robust UI/UX
- Spring Boot REST APIs for front-end to interact with backend
  
## Tech Stack

- Java Spring Boot
- React
- PostgreSQL
- Kafka
- Docker

## Architecture

![java-final-project-architecture](https://github.com/palakkeni5/one-room-chat-app/assets/42136520/fc157211-fdce-490f-8588-041fdae1fa1a)


The application follows a layered architecture with the following components:

- **Frontend**: React frontend with login, signup and chat dashboard pages. Chat dashboard uses web sockets for real-time communication.
- **Backend**: Java Spring Boot application with REST APIs and web socket server. The first spring server acts as producer for Kafka and connects to DB for fetch operations. The second backend server is also a Java Spring Boot app and will act as a consumer to consume from the kafka stream. The main purpose of this server is to perform CRUD operation in the database.  
- **Kafka**: Message queue for reliability and scalability.
- **Database**: PostgreSQL database to store user and chat data.

## Getting Started

## Prerequisites

- Docker
- Docker Compose

## Installation 

Clone the repo

```bash
https://github.com/palakkeni5/one-room-chat-app.git
```

- Directly use containers (for windows or linux (non-ARM based systems))
  ```bash
  cd oneRoomChat-x86
  docker compose up -d
  ```
- Directly use containers (for MACs (ARM based systems eg. Mac M1,Mac M2))
  ```bash
  cd oneRoomChat-ARM
  docker compose up -d
  ```
- Create containers locally and run
  ```bash
  cd oneRoomChat
  docker compose up -d
  ```
  
## Usage

- Register a new user account
- Login using registered credentials
- Chat with other logged in users in realtime

## Contributors

- [Palak Pramod Keni](https://github.com/palakkeni5)
- [Jerry Liu](https://github.com/jLiucoder)
