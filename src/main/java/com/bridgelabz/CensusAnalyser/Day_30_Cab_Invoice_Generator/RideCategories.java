package com.bridgelabz.CensusAnalyser.Day_30_Cab_Invoice_Generator;

public enum RideCategories {
    NORMAL_RIDE(10.0, 1, 5.0), PREMIUM_RIDE(15.0, 2, 20.0);

    public final double costPerKm;
    public final int costPerTime;
    public final double minFare;

    private RideCategories(double costPerKm, int costPerTime, double minFare) {
        this.costPerKm = costPerKm;
        this.costPerTime = costPerTime;
        this.minFare = minFare;
    }

    public double calculateFare(Ride ride) {
        return Math.max((ride.getDistance() * costPerKm) + (ride.getTime() * costPerTime), minFare);
    }
}