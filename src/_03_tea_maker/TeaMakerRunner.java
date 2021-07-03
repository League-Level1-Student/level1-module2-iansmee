package _03_tea_maker;

public class TeaMakerRunner {
public static void main(String[] args) {
	TeaBag teabag = new TeaBag(TeaBag.CHAMOMILE);
	
	Kettle kettle = new Kettle();
	
	Cup cup = new Cup();
	
	TeaMaker maker = new TeaMaker();
	
	
	kettle.boil();
	teabag.getFlavor();
	cup.makeTea(teabag, kettle.getWater());
	

}
}
