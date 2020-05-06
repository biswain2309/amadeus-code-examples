package examples.media.files;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightDate;
import com.amadeus.resources.Location;

public class AirportCitySearch {

  public static void main(String[] args) throws ResponseException {

    Amadeus amadeus = Amadeus
        .builder("YOUR_API_ID","YOUR_API_SECRET")
        .build();

    // Airport & City Search (autocomplete)
    // Find all the cities and airports starting by the keyword 'LON'
    Location[] locations = amadeus.referenceData.locations.get(Params
      .with("keyword", "LON")
      .and("subType", Locations.ANY));

    System.out.println(locations);
  }
}
