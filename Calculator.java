public class Calculator {

	private String name;
	private double errorConstant;
	
	public Calculator(String name) {
		this.name = name;
		this.errorConstant = Math.random();
	}
	
	public double add(Double a, Double b) {
		double calculation = a + b;

		calculation = addQuantomError(calculation);
		
		return calculation;
	}

	
	public double subtract(Double a, Double b) {
		double calculation = a - b;

		calculation = addQuantomError(calculation);
		
		return calculation;
	}

  public double generateRandomNo() {
		
		return (Math.random() * 10);
	}
	
	private double addQuantomError(double calculation) {
		if (Math.random() < this.errorConstant) {
			calculation = calculation + Math.random();
		}
		return calculation;
	}

	public String getName() {
		return name;
	}

	private double crystalCalculation() {
		
		int numOfPairs = 10;
		int successNo = 0;
		double successRate = 0;

		System.out.println("Calculator " + this.name + ":");
		for (int i = 0; i < numOfPairs; i++) {
			double firstNum = this.generateRandomNo();
			double secondNum = this.generateRandomNo();
			double calculation = this.add(firstNum, secondNum);
			double quantamCalculation = this.addQuantomError(calculation);
			String calulationAccuracy = "";

			if (quantamCalculation == calculation) {
				calulationAccuracy = "(correct)";
				successNo++;
			} else {
				calulationAccuracy = "(error)";
			}
			
			System.out.printf("%08.5f + %08.5f = %08.5f %5s %-1s%n", firstNum, secondNum, quantamCalculation, " ", calulationAccuracy);
		}

		successRate = (double)successNo / numOfPairs;

		System.out.println(this.name + " Success rate: " + successRate + "\n");

		return successRate;		
	}

	public static void main(String[] args) {
    Calculator crystal1 = new Calculator("Crystal 1");   
    Calculator crystal2 = new Calculator("Crystal 2");    
 
		// what happens if the success rate is even for both crystals?
		String betterCrystal = (crystal1.crystalCalculation() > crystal2.crystalCalculation()) ? crystal1.name : crystal2.name;

		System.out.println(betterCrystal + " is better");
	}

}
