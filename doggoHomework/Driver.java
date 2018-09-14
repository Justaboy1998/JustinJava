package doggoHomework;

public class Driver {

	public static void main(String[] args) {
		//tester class
		
		Doggo example = new Doggo('f', 2, 4, 2.6, 17.4, true);
		
			Doggo.numberDoggos++;
			
		Doggo Bandit = new Doggo('m', 1, 4, 0, 0, true);
		
			Doggo.numberDoggos++;
			
		Doggo Cerberus = new Doggo('m', 1, 4, 17.6, 340.8, false);
		
			Doggo.numberDoggos++;
			
		Doggo HipHop = new Doggo('m',0, 4, 1.4, 14.4, false );
		
			Doggo.numberDoggos++;
			
		Doggo defaultDoggo = new Doggo();
		
			Doggo.numberDoggos++;

			
			
//for example//
			System.out.println("example\n gender : " +example.getGender()+ "\n" + "number of tails: " + example.getTails() + "\n" + "number of legs: " + example.getLegs() + "\n" + "height: " + example.getHeight() + "\n" + "is spayed or not: " + example.getSpayed() + "\n");
//for Bandit//
			System.out.println("Bandit\n gender : " +Bandit.getGender()+ "\n" + "number of tails: " + Bandit.getTails() + "\n" + "number of legs: " + Bandit.getLegs() + "\n" + "height: " + Bandit.getHeight() + "\n" + "is spayed or not: " + Bandit.getSpayed() + "\n");
//for Cerberus//
			System.out.println("Cerberus\n gender : " +Cerberus.getGender()+ "\n" + "number of tails: " + Cerberus.getTails() + "\n" + "number of legs: " + Cerberus.getLegs() + "\n" + "height: " + Cerberus.getHeight() + "\n" + "is spayed or not: " + Cerberus.getSpayed() + "\n");
//for Hiphop//
			System.out.println("HipHop\n gender : " +HipHop.getGender()+ "\n" + "number of tails: " + HipHop.getTails() + "\n" + "number of legs: " + HipHop.getLegs() + "\n" + "height: " + HipHop.getHeight() + "\n" + "is spayed or not: " + HipHop.getSpayed() + "\n");
//for defaultDoggo//
			System.out.println("default\n gender : " +defaultDoggo.getGender()+ "\n" + "number of tails: " + defaultDoggo.getTails() + "\n" + "number of legs: " + defaultDoggo.getLegs() + "\n" + "height: " + defaultDoggo.getHeight() + "\n" + "is spayed or not: " + defaultDoggo.getSpayed() + "\n");
			
		
			System.out.println(Doggo.numberDoggos);
	}

}
