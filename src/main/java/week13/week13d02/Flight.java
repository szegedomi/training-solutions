package week13.week13d02;

import java.time.LocalTime;

public class Flight {

    private String id;
    private FlightType flightType;
    private String city;
    private LocalTime timeOfFlight;

    public Flight(String id, FlightType flightType, String city, LocalTime timeOfFlight) {
        this.id = id;
        this.flightType = flightType;
        this.city = city;
        this.timeOfFlight = timeOfFlight;
    }

    public String getId() {
        return id;
    }

    public FlightType getFlightType() {
        return flightType;
    }

    public String getCity() {
        return city;
    }

    public LocalTime getTimeOfFlight() {
        return timeOfFlight;
    }
}
