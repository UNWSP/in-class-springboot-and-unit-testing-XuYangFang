package SpringUnit;
import static org.juint.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests{
	
	@Test
	void contextLoads() {
		
	}
	@Test
	void testGetContent() {
		Greeting greeting = new Greeting(1, "Test");
		asserEquals("Test", greeting.getContent());
				
	}
}
