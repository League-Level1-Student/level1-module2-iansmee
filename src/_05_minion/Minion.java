package _05_minion;

public class Minion {

	
	
	String name; 
	int eyes; 
	String color; 
	String master;
	
	public Minion(String name, int eyes, String color, String master) {
		this.name=name;
		this.eyes=eyes;
		this.color=color;
		this.master=master;
		
	}
	
	String getName() {
		return name;
	
	}
void setName(String name) {
	this.name=name;
}
int getEyes() {
	return eyes;
}
void setEyes(int eyes) {
	this.eyes=eyes;
}
String getColor() {
	return color;
}
void setColor(String color) {
	this.color=color;
}
String getMaster() {
	return master;
}
void setMaster(String master) {
	this.master=master;
}






}
