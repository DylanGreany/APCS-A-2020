package DataLab;
public class humid {
	private String stationId;
	private String humidity;
	private String name;
	private String state;
	public humid(String i, String h) {
		stationId = i;
		humidity = h;
	}
	public humid (String n, String s, String i) {
		stationId = i;
		name = n;
		state = s;
	}
	public void setName(String n) {
		name = n;
	}
	public void setId(String i) {
		stationId = i;
	}
	public void setState(String s) {
		state = s;
	}
	public void setHumidity(String h) {
		humidity = h;
	}
	public String getName() {
		return name;
	}
	public String getState() {
		return state;
	}
	public String getId() {
		return stationId;
	}
	public String getHumidity() {
		return humidity;
	}
	public String toString() {
		return "Station " + name + " in state "+state+"has a humidity of: " + humidity + "%";
	}
}