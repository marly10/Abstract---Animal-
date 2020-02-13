public class HummingBird extends Bird {

	//instance variables
	protected String HummingBirdName;


	//HummingBird has a constructor that initializes 
	public HummingBird(String HummingBirdName, int mealsEaten, String callsign) {

		super(callsign, mealsEaten);
		this.HummingBirdName = HummingBirdName;
	}


	//HummingBird has a constructor that initializes  default
	public HummingBird() {

		super();
		HummingBirdName = "";
	}
   
	//getter
	public String getHummingBirdName() {
		return HummingBirdName;
	}
	//setter
	public String setHummingBirdName() {
		return HummingBirdName;
	}

	//methods from the abstract class Bird'
	@Override
	public void fly() {
		System.out.println(HummingBirdName + " " + "is flying high!!!");
	}

	@Override
	public void chirp() {
		System.out.println(HummingBirdName + " " + "chirps!");

	}

	@Override
	public void swim() {
		System.out.println("\nHummingBirds cannot swim");
	}
	@Override
	public void eat() {

		if (mealsEaten <= 0 || mealsEaten >= 1)
			mealsEaten++;
		System.out.println("\nYou just feed the HummingBirds 1");
		return;
	}
	//methods from the abstract class Bird'
	//toString method
	public String toString() {
		String toReturn = "Name: " + HummingBirdName + "\n";
		toReturn += "Meals Eaten: " + mealsEaten + "\n";
		toReturn += "Can Swim: " + super.canSwim + "\n";
		toReturn += "Callsign: " + super.callsign + "\n";
		return toReturn; //we create a string a then build it up before returning it.
	}

//method used to remove all by call sign
    public boolean equalsCall(Object o) {

        if (!(o instanceof Penguin)) {
            return false;
        } else {
            HummingBird HummingBird = (HummingBird) o;

            if ( HummingBird.HummingBirdName == HummingBirdName && HummingBird.mealsEaten == mealsEaten && HummingBird.callsign == callsign) {

                return true;
            }
        }
        return false;
    }


}