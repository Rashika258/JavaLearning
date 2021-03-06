package youtube.learnings.junitDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator  {
	Calculator c=null;
//	CalcularorService service=new CalcularorService() {
//		public int add(int i, int j) {
//			return 0;
//		}
//	};
//	
	@Mock
	CalculatorService service;
	@Rule public MockitoRule rule=MockitoJunit.rule();
//	=Mockito.add(CalculatorService.class);
	
	@Before
	public void setUp() {
		c=new Calculator(service);
	}
	@Test
	public void testAdd() {
		when(service.add(2, 3)).thenReturn(5);
		assertEquals(5,c.perform(2, 3));
		verify(service).add(2,3);
	}
}
