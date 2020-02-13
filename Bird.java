public abstract class Bird {
  // instance variables• They have string callsign, bool canSwim, int mealsEaten.
  protected String callsign;
  protected boolean canSwim = false;
  protected int mealsEaten;

  // This is abstract method• Birds have abstract methods for fly, chirp, swim,
  // and eat.
  public abstract void fly();

  public abstract void chirp();

  public abstract void eat();

  public abstract void swim();

  // Bird has a constructor that initializes
  public Bird(String callsign, int mealsEaten) {
    this.callsign = callsign;
    this.mealsEaten = mealsEaten;
  }

  public Bird() {
    callsign = "";
    mealsEaten = 0;
  }

  // getters for abstract class
  public String getCallsign() {
    return callsign;
  }

  public boolean GetanSwim() {
    return canSwim;
  }

  public int getMealsEaten() {
    return mealsEaten;
  }

  // setters for abstract class
  public void setCallsign(String newCallsign) {
    this.callsign = newCallsign;
  }

  public void setMealsEaten(int newMealsEaten) {
    this.mealsEaten = newMealsEaten;
  }

  public void setCanSwim(boolean newCanSwim) {
    this.canSwim = newCanSwim;
  }

}