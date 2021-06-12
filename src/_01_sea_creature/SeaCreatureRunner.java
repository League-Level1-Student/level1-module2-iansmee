package _01_sea_creature;

public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature spongebob = new SeaCreature("spongebob");
	spongebob.eat();
	System.out.println(spongebob.getName());
	SeaCreature patrick = new SeaCreature("patrick");
	patrick.eat();
	System.out.println(patrick.getName());
	SeaCreature squidward = new SeaCreature("squidward");
	squidward.eat();
	System.out.println(squidward.getName());
}
}
