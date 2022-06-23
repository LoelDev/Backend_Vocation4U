package com.technostart.vocation4u;

import com.technostart.vocation4u.models.Article;
import com.technostart.vocation4u.repositories.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Vocation4uApplicationTests {

	@Autowired
	ArticleRepository aRepo;

	@Test
	public void testArticleCreate(){
		Article a = new Article();
		a.setId(1L);
		a.setSpecialistId(1);
		a.setTitle("ejemplo de titulo1");
		a.setDescription("ejemplo de descripcion");
		a.setImageUrl("ejemplo de imagen");
		a.setUrl("ejemplo de url");
		aRepo.save(a);

		assertNotNull(aRepo.findById(1L).get());
	}

	private void assertNotNull(Article a) {}
}
