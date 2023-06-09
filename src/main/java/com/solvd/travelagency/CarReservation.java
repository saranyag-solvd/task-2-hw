package com.solvd.travelagency;

import com.solvd.travelagency.enums.CarType;
import com.solvd.travelagency.exceptions.DriverException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class CarReservation extends Reservation {
    private CarType carType;
    private List<Customer> drivers;
    private String carDetails;

    public CarReservation(String reservationId, String status, Date fromDate, Date toDate, double amount, CarType carType, String carDetails) {
        super(reservationId, status, fromDate, toDate, amount);
        this.carType = carType;
        this.drivers = new ArrayList<>();
        this.carDetails = carDetails;
    }

    public CarType getCarType() {
        return this.carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public List<Customer> getDrivers() {
        return this.drivers;
    }

    public void setDrivers(List<Customer> drivers) {
        this.drivers = drivers;
    }

    public String getCarDetails() {
        return this.carDetails;
    }

    public void setCarDetails(String carDetails) {
        this.carDetails = carDetails;
    }

    @Override
    public void createReservation() {
        super.setStatus(Status.CONFIRMED);
        System.out.println("Car reservation created");
    }

    @Override
    public void viewReservation() {
        System.out.println("Car Reservation Details:");
        System.out.println(super.toString());
        System.out.println(this);
    }

    public void updateCarType(CarType carType) {
        this.setCarType(carType);
        System.out.println("Car type updated");
    }

    @Override
    public void cancelReservation() {
        this.setStatus(Status.CANCELLED);
        System.out.println("car reservation cancelled");
    }

    public void addDriver(Customer driver) {
        this.drivers.add(driver);
        System.out.println("Car Driver Added");
    }

    public void removeDriver(Customer driver) throws DriverException {
        if (driver == null || !this.drivers.contains(driver)) {
            throw new DriverException("Invalid Driver");
        }
        this.drivers.remove(driver);
        System.out.println("Car Driver Removed");
    }

    @Override
    public String toString() {
        return "CarReservation{" +
                "carType='" + carType + '\'' +
                ", drivers=" + drivers +
                ", carDetails='" + carDetails + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarReservation that = (CarReservation) o;
        return Objects.equals(getCarType(), that.getCarType()) && Objects.equals(getReservationId(), that.getReservationId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarType(), getReservationId());
    }
}
