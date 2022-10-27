package com.bridgelabz.CensusAnalyser.Day_30_Cab_Invoice_Generator;

public class InvoiceSummury {

    public int numOfRides;
    public double totalFare;
    public double avgFare;

    public InvoiceSummury(int numOfRides, double totalFare) {
        this.numOfRides = numOfRides;
        this.totalFare = totalFare;
        this.avgFare = this.totalFare / this.numOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        InvoiceSummury that = (InvoiceSummury) o;
        return (numOfRides == that.numOfRides) && Double.compare(that.totalFare, totalFare) == 0
                && Double.compare(that.avgFare, avgFare) == 0;
    }
}