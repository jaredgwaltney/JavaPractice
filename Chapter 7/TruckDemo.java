/*
 Try This 7-1
*/

class Vehicle {
	private int passengers;
	private int fuelcap;
	private int mpg;
	
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	int getPassengers() {
		return passengers;
	}
	
	int getFuelcap() {
		return fuelcap;
	}
	
	int getMpg() {
		return mpg;
	}
	
	void setPassengers(int p) {
		passengers = p;
	}
	
	void setFuelcap(int f) {
		fuelcap = f;
	}
	
	void setMpg(int m) {
		mpg = m;
	}
	
	int range() {
		return (fuelcap * mpg);
	}
	
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}

class Truck extends Vehicle {
	private int cargoCap;
	
	Truck(int p, int f, int m, int c) {
		super(p, f, m);

		cargoCap = c; 
	}
	
	int getCargocap() {
		return cargoCap;
	}
	
	void setCargocap(int c) {
		cargoCap = c;
	}
}

class TruckDemo {
	public static void main(String args[]) {
		Truck semi = new Truck(2, 200, 7, 44000);
		Truck pickup = new Truck(3, 28, 15, 2000);
				
		double gallons;
		int dist = 252;
				
		gallons = semi.fuelneeded(dist);
		System.out.println("Semi can carry " + semi.getCargocap() + " pounds.");
		System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.");
		
		gallons = pickup.fuelneeded(dist);
		System.out.println("Pickup can carry " + pickup.getCargocap() + " pounds.");
		System.out.println("To go " + dist + " miles pickup needs " + gallons + " gallons of fuel.");
	}
}