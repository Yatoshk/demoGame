package com.example.demoGame;

import com.example.demoGame.entity.Player;
import com.example.demoGame.repository.ApplyDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DemoGameApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplyDataSource.class, args);
		//SpringApplication.run(DemoGameApplication.class, args);
		ApplyDataSource db = new ApplyDataSource();
		//db.addPlayer("qwer", "34", "rat");
		//db.testListAll();

	}

}
