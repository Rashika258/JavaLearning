package youtube.learnings.junitDemo;

public class Calculator {
	
	CalculatorService service;
	

	public Calculator(CalculatorService service) {
		// TODO Auto-generated constructor stub
		this.service=service;
	}
	public int perform(int a, int b ) {
		return service.add(a, b);
	}
}
