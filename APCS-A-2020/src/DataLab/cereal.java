package DataLab;

//which cereal is best for low carbs and high protein
import java.util.ArrayList;
public class cereal {
	private String name;
	private int carbs, protein;
	public cereal (String n, int c, int p) {
		name = n;
		carbs = c;
		protein = p;
	}
	public cereal () {
		
	}
	//set methods
	public void setCarbs(int c) {
		carbs = c;
	}
	public void setName(String n) {
		name = n;
	}
	public void setProtein(int p) {
		protein = p;
	}
	//get methods
	public int getCarbs() {
		return carbs;
	}
	public String getName() {
		return name;
	}
	public int getProtein() {
		return protein;
	}
	//to string
	public String toString() {
		return this.name +" which has " + this.carbs + " grams of carbs and " + protein +" grams of protein.";
	}
}