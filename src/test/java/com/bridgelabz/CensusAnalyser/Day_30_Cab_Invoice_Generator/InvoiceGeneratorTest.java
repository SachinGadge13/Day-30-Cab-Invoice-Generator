package com.bridgelabz.CensusAnalyser.Day_30_Cab_Invoice_Generator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InvoiceGeneratorTest {
    InvoiceGenerator invoiceGenerator;

    @Before
    public void init() {
        invoiceGenerator = new InvoiceGenerator();
    }

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        double distance = 1.0;
        int time = 10;
        double fare = invoiceGenerator.calculateFare(distance, time);
        assertEquals(20, fare, 0.0);
    }

    @Test
    public void givenDistanceAndTime_WhenTotalFareLessThan10_ShouldReturnMinimumFare() {
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        assertEquals(5, fare, 0.0);
    }

    @Test
    public void givenMultipleRidesShouldReturnTotalFare() {
        Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1) };
        double fare = invoiceGenerator.calculateFare(rides);
        assertEquals(30, fare, 0.0);
    }

    @Test
    public void givenMultipleRidesShouldReturnRideSummary() {
        Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1) };
        InvoiceSummury summary = invoiceGenerator.getInvoiceSummary(rides);
        InvoiceSummury expectedSummary = new InvoiceSummury(2, 30.0);
        assertEquals(expectedSummary, summary);
    }
}