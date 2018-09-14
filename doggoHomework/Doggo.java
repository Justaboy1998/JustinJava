package doggoHomework;

public class Doggo {
	public static int numberDoggos;
	private char gender;
	private int tails;
	private int legs;
	private double height;//measured in feet.inches//
	private double weight;//measured in pounds//
	private boolean spayed;

public Doggo() {//default constructor//
	numberDoggos++;
	gender = 'u';
	tails = 0;
	legs= 0;
	height= 0;
	weight= 0;
	spayed = false;
	
}
public Doggo(char g, int t, int l, double h, double w, boolean f) {
	numberDoggos++;
	gender = g;
	tails = t;
	legs = l;
	height = h;
	weight = w;
	spayed = f;
}
//Getters//

public char getGender() {
	return gender;
}
public int getTails() {
	return tails;
}
public int getLegs() {
	return legs;
}
public double getHeight() {
	return height;
}
public double getWeight() {
	return weight;
	
}
public boolean getSpayed() {
	return false;
}
//setters//

public void setGender( char g) {
	gender = g;
	Character.toLowerCase(g);
	if(gender == 'u') {
		if(g == 'm' || g == 'f') {
			gender = 'g';
		}else {
			System.out.println("Not a valid setting for gender");
		}
	}else {
		System.out.println("gender for this doggo is set too" + gender);
	}
}

public void setTailCount(int t) {
	tails = t;	
}

public void setLegCount(int l) {
	legs = l;
}

public void setHeight(double h) {
	height = h;
}
public void setWeight(double w) {
	weight = w;
}
public void setSpayed(boolean f) {
	spayed = f;
}
}