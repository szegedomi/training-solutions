package exam03.travelagency;

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void bookPassenger(Passenger passenger){
        if(this.passengers.size() < boat.getMaxPassengers()){
            this.passengers.add(passenger);
        }
        else{
            throw new IllegalArgumentException("Overbooking! Booking is not possible!");
        }
    }

    public double getPriceForPassenger(Passenger passenger){
        return this.basicPrice * passenger.getCruiseClass().getFactor();
    }

    public Passenger findPassengerByName(String name){
        for(Passenger passenger : passengers){
            if(passenger.getName().equals(name)){
                return passenger;
            }
        }
        return null;
    }

    public List<String> getPassengerNamesOrdered(){
        List<String> result = new ArrayList<>();
        for(Passenger passenger : passengers){
            result.add(passenger.getName());
        }
        Collections.sort(result);
        return result;
    }

    public double sumAllBookingsCharged(){
        double result = 0;
        for(Passenger passenger : passengers){
            result += passenger.getCruiseClass().getFactor() * this.basicPrice;
        }
        return result;
    }

    public Map<CruiseClass, Integer> countPassengerByClass(){
        Map<CruiseClass, Integer> result = new HashMap<>();
        for(CruiseClass cc : CruiseClass.values()){
            result.put(cc, 0);
        }
        for(Passenger passenger : passengers){
            result.put(passenger.getCruiseClass(), result.get(passenger.getCruiseClass())+1);
        }
        return result;
    }

}
