package week13.week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FlightStat {

    private List<Flight> flights = new ArrayList<>();

    public List<Flight> getFlights() {
        return flights;
    }

    public void readFromFile(Path file) {
        try (BufferedReader br = Files.newBufferedReader(file)){

            String line;
            String[] lineData;
            int hour;
            int minute;
            while((line=br.readLine()) != null){
                lineData = line.split(" ", 4);
                hour = Integer.parseInt(lineData[3].split(":")[0]);
                minute = Integer.parseInt(lineData[3].split(":")[1]);
                flights.add(new Flight(lineData[0], FlightType.valueOf(lineData[1].toUpperCase()), lineData[2], LocalTime.of(hour, minute)));
            }

        }catch(IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }

    }

    public FlightType departOrArrive(){
        int depart= 0;
        int arrive = 0;
        for(Flight flight : flights){
            if(flight.getFlightType().equals(FlightType.DEPARTURE)){
                depart++;
            }
            else if(flight.getFlightType().equals(FlightType.ARRIVAL)){
                arrive++;
            }
        }
        return arrive > depart ? FlightType.ARRIVAL : FlightType.DEPARTURE;
    }

    public Flight findFlightByID(String id){
        for(Flight flight : flights){
            if(flight.getId().equals(id)){
                return flight;
            }
        }
        return null;
    }

    public List<Flight> findInAndOrForCity(String city, FlightType ft){
        List<Flight> result = new ArrayList<>();
        for(Flight flight : flights){
            if(flight.getCity().equals(city) && flight.getFlightType().equals(ft)){
                result.add(flight);
            }
        }
        return result;
    }

    public Flight earliestDeparture(){
        Flight earliestFlight = null;
        LocalTime earliest = LocalTime.of(23,59);
        for (Flight flight : flights){
            if(flight.getFlightType() == FlightType.DEPARTURE){
                if(flight.getTimeOfFlight().isBefore(earliest)){
                    earliest = flight.getTimeOfFlight();
                    earliestFlight = flight;
                }
            }
        }
        return earliestFlight;
    }


    public static void main(String[] args) {

        Path file = Path.of("src/main/resources/cities.txt");

        FlightStat fs = new FlightStat();

        fs.readFromFile(file);
        System.out.println(fs.getFlights().size());

        System.out.println(fs.departOrArrive().toString());

    }


}
