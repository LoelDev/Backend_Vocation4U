package com.technostart.vocation4u;

import com.technostart.vocation4u.repositories.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Vocation4uApplicationTests {

	@Autowired
	ArticleRepository aRepo;

	@Test
	void contextLoads() {
	}

}
