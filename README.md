# Rock-Paper-Scissors-Application
This is the rest API application. You can play the Rock Paper Scissors game with the computer as a player.

## Tech Stack
- Java
- Spring Framework
- Spring Boot
- Lambok
- Swagger Ui

## Modules
- Play module

## Features
- Easy to assess route
- All test cases using JUnit
- Swagger UI
- The player will get a proper response(computer choice and final result) from the application
- The player will get a proper error message if an error or exception occurs

## Snaps:

- Player choice paper and auto-generated computer choice rock then the Player won here

![game1](https://user-images.githubusercontent.com/76080960/229773203-ee0cfe0e-08e8-4c31-987a-361e3c4fe0e3.png)

- Player choice rock and auto-generated computer choice paper then the Computer won here

![game3](https://user-images.githubusercontent.com/76080960/229773605-1683c065-12bb-4e36-ba94-0fd31339e462.png)

- Player choice scissors and auto-generated computer choice scissors then game tie

![game4](https://user-images.githubusercontent.com/76080960/229774119-2a63b3f3-6d50-42f1-bafa-000a8e6a65b4.png)


## Installation and Run

#changing the server port
- server.port=8888

#Whether a "NoHandlerFoundException" should be thrown if no Handler was found to process a request.
- spring.mvc.throw-exception-if-no-handler-found=true
- spring.web.resources.add-mappings=false

## API Root and Endpoint

```
https://localhost:8888/
```

```
http://localhost:8888/swagger-ui/index.html
```
