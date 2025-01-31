package com.example.springdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}


/*


Linux:
curl -X POST http://localhost:8080/v1/users \
     -H "Content-Type: application/json" \
     -d '{"name": "John Doe", "email": "john@example.com"}'

Windows:
curl -X POST http://localhost:8080/v1/users -H "Content-Type: application/json" -d "{\"name\": \"John Doe\", \"email\": \john@example.com\}"

curl -X GET http://localhost:8080/v1/users
curl -X GET http://localhost:8080/v1/users/1
curl -X GET http://localhost:8080/v1/users/email?email=john@example.com
curl -X GET http://localhost:8080/v1/users/email\?email\=john@example.com

curl -X DELETE http://localhost:8080/v1/users/1

*/