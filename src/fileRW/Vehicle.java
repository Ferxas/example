package fileRW;

final class Vehicle {
	protected String brand = "Volvo";
	
	public void honk() {
		System.out.println("Tuuuun!");
	}
}

class Car extends Vehicle {
	private String modelName = "Mustang";
	public static void main(String[] args) {
		
		Car micoche = new Car();
		
		micoche.honk();
		
		System.out.println(micoche.brand + " " + micoche.modelName);
	}
}



		



