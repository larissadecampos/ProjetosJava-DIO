package com.dio.springboottest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

@WebMvcTest //para fazer as requisições REST no Spring
@ExtendWith(SpringExtension.class) //para utilizar o JunitJupiter
public class TestIntController {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void testInt() throws Exception {
		RequestBuilder requisicao = get("/test");
		MvcResult resultado = mvc.perform(requisicao).andReturn();
		assertEquals("Bem-vinde, DIO", resultado.getResponse().getContentAsString());
	}
	
	@Test
	public void testIntComArgumento() throws Exception {
		mvc.perform(get("/test?nome=Lari"))
			.andExpect(content().string("Bem-vinde, Lari"));
	}

}
