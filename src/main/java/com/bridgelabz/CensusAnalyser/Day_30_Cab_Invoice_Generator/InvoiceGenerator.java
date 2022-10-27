package com.bridgelabz.CensusAnalyser.Day_30_Cab_Invoice_Generator;

public class InvoiceGenerator {

    private static final int COST_PER_TIME = 1;
    private static final double COST_PER_KM = 10;
    private static final double MINIMUM_FARE = 5;

    public double calculateFare(double distance, int time) {

        return Math.max(MINIMUM_FARE, distance * COST_PER_KM + time * COST_PER_TIME);
    }

}