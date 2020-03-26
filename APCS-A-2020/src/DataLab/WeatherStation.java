package DataLab;
/*
 Represents information about a NWS weather station
*/

import core.data.DataSource;

public class WeatherStation {
   private String name;
   private String id;
   private String state;
   private double lat;
   private double lng;
   
   WeatherStation(String name, String id, String state, double lat, double lng) {
      this.name = name;
      this.id = id;
      this.lat = lat;
      this.lng = lng;
      this.state = state;   
   }
   
   /* Produce the id of this station */
   public String getId() { 
      return id;
   }
   
   /* Produce the name of this station */
   public String getName() { 
      return name;
   }
   
   public double getLat() {
	   return lat;
   }
   
   public Observation currentWeather() {
	   DataSource ds1 = DataSource.connect("http://weather.gov/xml/current_obs/" + id + ".xml"); 
	   Observation ob1 = ds1.fetch(Observation.class, "weather", "temp_f", "wind_degrees");
	   return ob1;
   }
   
   /* Determine if this weather station is located in the given state */
   public boolean isLocatedInState(String st) {
      return this.state.equals(st);
   }
   
}