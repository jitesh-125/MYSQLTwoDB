package com.sumit.playjava;
//8082

//Steps: playProCode Video 

//1. Create 2 database and datasources
//2. Create two packages for different entity and repository files 
//3. Create controllers and services
//4. Create config files for saperate dbs
//5. Execute and test


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiDatasourcePocApplication {

	public static void main(String[] args) {
		System.out.println("This Is My MultiDatabases Projects....");
		SpringApplication.run(MultiDatasourcePocApplication.class, args);
	}

}
