public interface IVehicle {
	int getPassengers();
	int getFuelcap();
	int getMpg();
	void setPassengers(int p);
	void setFuelcap(int f);
	void setMpg(int m);
	int range();
	double fuelneeded(int n);
}