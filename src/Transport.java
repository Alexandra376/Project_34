interface Transport {
    double fuelСonsumption();
}
class Car implements Transport {
    int distance;
    double fuelСonsumption;
    public Car(int distance, double fuelСonsumption) {
        this.distance = distance;
        this.fuelСonsumption = fuelСonsumption;
    }
    public double fuelСonsumption() {
        return distance / fuelСonsumption;
    }
}
class Airplane implements Transport {
    int distance;
    double fuelСonsumption;
    public Airplane(int distance, double fuelСonsumption) {
        this.distance = distance;
        this.fuelСonsumption = fuelСonsumption;
    }
    public double fuelСonsumption() {
        return distance / fuelСonsumption;
    }
}
