public class Penguin extends Bird {

    //Penguin has a constructor that initializes 
    public Penguin(String callsign, int mealsEaten) {

        super(callsign, mealsEaten);
        canSwim = true;
    }
    //emptyconstructor 
    public Penguin() {}

    //void Method section 
    @Override
    public void fly() {
        System.out.println("\nPenguins cannot fly");
    }

    @Override
    public void chirp() {
        System.out.println("\nPenguin Chirping!");
    }

    //Override drive to increase the speed by one each time.
    @Override
    public void eat() {

        //increases the penguins food by 3 when 
        if (mealsEaten <= 0 || mealsEaten >= 1)
            mealsEaten += 3;
        System.out.println("\nYou just feed the Penguins 3");
        return;
    }

    @Override
    public void swim() {
        System.out.println("\nSwimming Penguin!!\n");
    } //void Method ends

    //toString method
    public String toString() {
        String toReturn = "Penguin:" + "\n";
        toReturn += "Meals Eaten: " + mealsEaten + "\n";
        toReturn += "Can Swim: " + super.canSwim + "\n";
        toReturn += "Callsign: " + super.callsign + "\n";
        return toReturn; //we create a string a then build it up before returning it.
    }

    //equal method used for tap dancing bird mainly
    public boolean equals(Object o) {
        if (!(o instanceof Penguin)) {
            return false;
        } else {
            Penguin Penguin = (Penguin) o;

            if (Penguin.callsign == callsign && Penguin.mealsEaten == mealsEaten) {

                return true;
            }
        }
        return false;
    }
    
    //method used to remove all by call sign
    public boolean equalsCall(Object o) {
        if (!(o instanceof Penguin)) {
            return false;
        } else {
            Penguin Penguin = (Penguin) o;

            if (Penguin.callsign == callsign && Penguin.mealsEaten == mealsEaten) {

                return true;
            }
        }
        return false;
    }



}