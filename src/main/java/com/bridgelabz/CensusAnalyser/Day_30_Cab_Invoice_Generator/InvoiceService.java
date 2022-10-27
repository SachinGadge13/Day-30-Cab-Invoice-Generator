package com.bridgelabz.CensusAnalyser.Day_30_Cab_Invoice_Generator;

public class InvoiceService {
    private RideRepository rideRepository;

    public InvoiceService() {
        this.rideRepository = new RideRepository();
    }

    public double calculateFare(Ride ride) {
        return Math.max(ride.rideCategory.minFare,
                ride.getDistance() * ride.rideCategory.costPerKm + ride.getTime() * ride.rideCategory.costPerTime);
    }

    public InvoiceSummury calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += calculateFare(ride);
        }
        return new InvoiceSummury(rides.length, totalFare);
    }

    public void addRides(String userId, Ride[] ride) {
        rideRepository.addRide(userId, ride);
    }

    public InvoiceSummury getInvoiceSummary(String userId) {
        return this.calculateFare(rideRepository.getRides(userId));
    }
}