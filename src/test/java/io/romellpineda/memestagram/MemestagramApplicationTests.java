//package io.romellpineda.memestagram;
//
//import io.romellpineda.memestagram.controllers.ApplicationUserController;
//import org.junit.jupiter.api.Test;
////import org.assertj.core.api.Assertions.assertThat;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.hamcrest.Matchers.*;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.servlet.MockMvc;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//class MemestagramApplicationTests {
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Autowired
//	private ApplicationUserController applicationUserController;
//
//	@Value("${a}")
//	private String endpointUrl;
//	@Value("${bucketName}")
//	private String bucketName;
//	@Value("${accessKey}")
//	private String accessKey;
//	@Value("${secretKey}")
//	private String secretKey;
//
//	@Test
//	void contextLoads() {
//	}
//
//	@Test
//	public void shouldHaveAGoodHomePage() throws Exception {
//		this.mockMvc.perform(get("/"))
//				.andDo(print())
//				.andExpect(status().isOk())
//				.andExpect(content().string(containsString("<h1>Welcome to MemeCage!</h1>")));
//	}
//
//
//
//
//
//
//
//
//}
//No tests? like at all???