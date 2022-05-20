# Courses micro service
- [Courses micro service](#courses-micro-service)
  - [Introduction](#introduction)
  - [Technologies used](#technologies-used)
    - [Eureka Server](#eureka-server)
    - [Eureka Client](#eureka-client)
    - [Eureka Zuul gateway](#eureka-zuul-gateway)
    - [Api requests](#api-requests)
      - [course Model](#course-model)
      - [List Courses](#list-courses)
      - [Create Course](#create-course)
      - [Update Course](#update-course)
      - [Delete Course](#delete-course)


## Introduction
this is the course micro service of this app,it registers the course made by students to which course. I made this micro service for our class project while learning micro services and how to configure an eureka server and the micro services that will register into it


## Technologies used
### Eureka Server
The Eureka server is in this [repository](https://github.com/JsNerds-E-learning/EurekaServer) we used a spring boot project with spring cloud and [Netflix eureka](https://github.com/Netflix/eureka) as dependencies
### Eureka Client
This micro service is a Spring app that registers in the eureka server with the [spring-cloud-starter-netflix-eureka-client](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-client) dependecy 
### Eureka Zuul gateway
The gateway is in the [Zuul-Gateway repository](https://github.com/JsNerds-E-learning/Zuul-Gateway)
like the server we created the gateway with spring boot and netflix zuul as dependencies


### Api requests
#### course Model
    course : {
        subject : String,
        description : String,
        language : String,
        teacher_id : int
    }
#### List Courses
<hr>
to list all the courses you need to:
<ul>
    <li>use this path: /courses</li>
    <li>use the <strong>GET</strong>  method</li>
</ul>

#### Create Course 
<hr>  
to create a new course you need to:
<ul>
<li>use this path: /courses</li>
    <li>use the <strong>POST</strong>  method</li>
    <li>add a json in the request body with the added course</li>
</ul>

#### Update Course
<hr>
to update a course yout need to:
<ul>
    <li>use this path:/courses/:id (":id" = the Id of the old course)</li>
    <li>use the <strong>PUT</strong> method</li>
    <li>add a json in the request body with the new course</li>
</ul>

#### Delete Course
<hr>
to delete a course you need to: 
<ul>
    <li>use this path: /courses/:id (":id" = the Id of the course to delete)</li>
    <li>use the <strong>DELETE</strong>  method</li>
</ul>