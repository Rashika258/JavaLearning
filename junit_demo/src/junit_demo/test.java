package junit_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class test {
	Calculator c;
	@BeforeEach
	void setup() {
		c=new Calculator();
	}
	@Test
	void test() {
//		Calculator c=new Calculator();
		assertEquals(5,c.add(2,3));
	}
	@Test
	void areatest() {
//		Calculator c=new Calculator();
		assertEquals(314.7, c.area(10));
	}
	@AfterAll
	static void display
}
