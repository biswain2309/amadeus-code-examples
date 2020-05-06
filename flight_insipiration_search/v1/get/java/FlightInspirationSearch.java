package examples.media.files;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightDestination;

public class FlightInpirationSearch {

  public static void main(String[] args) throws ResponseException {

    Amadeus amadeus = Amadeus
        .builder("YOUR_API_ID","YOUR_API_SECRET")
        .build();
    FlightDestination[] flightDestinations = amadeus.shopping.flightDestinations.get(Params
    .with("origin", "MAD"));

    System.out.println(flightDestinations);
  }
}