package DataLab;
import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

import core.data.DataSource;

public class humidrunner {
	 public static void main(String[] args) {
		 DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
	     ArrayList<humid> allStations = ds.fetchList(humid.class, "station/station_name", "station/state","station/station_id");
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the state abbreviation to find the the humidity at all stations: ");
	     String state = sc.next();
	     for (humid hs: allStations) {
	    	 if (hs.getState().equals(state)) {
	    		 String id = hs.getId();
	    		 DataSource ds1 = DataSource.connect("http://weather.gov/xml/current_obs/" + id + ".xml").load();
	    		 humid hs1 = ds1.fetch(humid.class,"station_id","relative_humidity");
	    		 hs.setHumidity(hs1.getHumidity());
	    		 System.out.println(hs);
	    	 }
	     }
	 }
}