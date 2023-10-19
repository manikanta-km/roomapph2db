package com.geekster.Room.APP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RoomAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomAppApplication.class, args);
	}

}
// SpringData JPA (Jakarta Persistence API) this dependency consist of annotations which helps us to connect to databases like h2 or mysql
// h2 driver dependency is used for connecting to h2 database
//