package com.example.hellospring;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloSpringApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void greetingShown() {
		String bannerString=HelloSpringApplication.getBanner();
		assertTrue(bannerString.contains("Hello to Google Cloud!"));
		}
}