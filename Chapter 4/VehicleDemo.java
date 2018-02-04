/*
 VehicleDemo.java
*/

class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
	
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	int range() {
		return (fuelcap * mpg);
	}
	
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}

class VehicleDemo {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportscar = new Vehicle(2, 14, 12);
		
		double gallons;
		int dist = 252;
		
/* 		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
 */		
		gallons = minivan.fuelneeded(dist);
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + minivan.range() + ".  To travel " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
		gallons = sportscar.fuelneeded(dist);
		System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + sportscar.range() + ".  To travel " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
	}
}