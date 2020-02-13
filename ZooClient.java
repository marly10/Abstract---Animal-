/*
Ricky McKenzie
Lab3 - CSC 1054
*/

import java.io.*;
import java.util.*;

public class ZooClient {

  public static void main(String[] args) {

    //penguin Arraylist     //HummingBird Arraylist
    ArrayList < Bird > animalInZoo = new ArrayList < Bird > ();

    Penguin birdPenguin = new Penguin();

    //scanner keyboard 
    Scanner keyboard = new Scanner(System.in);

    //provide menu of services
    String list = "Which option do you wish to select?\n";
    list += "\n0 - eat\n1 - chirp\n2 - tap dance penguins\n3 - add new bird\n4 - fly\n5 - swim";
    list += "\n6 - remove based on callsign\n7 - print\n8 - quit.";
    System.out.println(list);

    String switchValue = keyboard.next();

    String addAnimal;

//
    HummingBird zooHPlace = new HummingBird("empty data", 0, "empty data");
    Penguin ZooPPlace = new Penguin("empty data", 0);

    //reads the entered string. Then selects the case to run based on user input
    while (!switchValue.equals("8") || !switchValue.equals("q")) {


      switch (switchValue) {

        //case Feed all animals with eat.
        case "0":
          for (int i = 0; i < animalInZoo.size(); i++) {

            if (!(animalInZoo.get(i).equals(ZooPPlace) || animalInZoo.get(i).equals(zooHPlace)))
              animalInZoo.get(i).eat();
          }
          break;

          //case Have all the birds chirp.
        case "1":
        
          for (int i = 0; i < animalInZoo.size(); i++) {

            if (!(animalInZoo.get(i).equals(ZooPPlace) || animalInZoo.get(i).equals(zooHPlace)))
              animalInZoo.get(i).chirp();
              
          }

          break;


          //case Have all penguins tapDance.
        case "2":
        
          for (int i = 0; i < animalInZoo.size(); i++) {
            Bird p = animalInZoo.get(i);

            if (p instanceof Penguin) {
            if (!(animalInZoo.get(i).equals(ZooPPlace) || animalInZoo.get(i).equals(zooHPlace)))
                System.out.println("Tap Dancing Penguins!");
                
            }
          }//end for loop
          break;

          //case Add a new penguin or hummingbird.
        case "3":

          //Do while loop to test and insures the data being entered in an Int only!
          do {

            System.out.print("Which would you like to add? (p = penguin and h = hummingbird) ");

            while (keyboard.hasNextInt()) {

              keyboard.next();

              System.out.print("Please enter an Strings to add animals ");

            }
            //adds file
            addAnimal = keyboard.next();


          } while ((addAnimal.equals("P")) || (addAnimal.equals("H")));

          String addAnimalUppers = addAnimal.toUpperCase();

          //if penguin is the bird ti be added then we do the following
          if (addAnimalUppers.equals("P")) {

            System.out.println("Enter in a callsign and the number of meals previously eaten.");
            
            //values for input
            String pCallSign = keyboard.next();
            int pMeal = keyboard.nextInt();

             //add input to arrayList of birds
            Penguin zooPen = new Penguin(pCallSign, pMeal);
            
            //add input to arrayList of birds
            animalInZoo.add(zooPen);

          }

          if (addAnimalUppers.equals("H")) {

            System.out.println("Enter in a name, callsign, and the number of meals previously eaten");

            //inputs fields into class item
            String hName = keyboard.next();
            String hCallSign = keyboard.next();
            int hMeal = keyboard.nextInt();

            HummingBird zooHum = new HummingBird(hName, hMeal, hCallSign);
            animalInZoo.add(zooHum);
          }
          
          break;

          //case Fly all birds. (You must properly deal with the exception here.)
        case "4":  
          for (int i = 0; i < animalInZoo.size(); i++) 
          {

            if (!(animalInZoo.get(i).equals(ZooPPlace)))
              animalInZoo.get(i).fly();
          } //end for loop 
          
          break;

          //case five. Swimming critters o	Swim all birds.   
        case "5":
          for (int i = 0; i < animalInZoo.size(); i++) 
          {

            if (!(animalInZoo.get(i).equals(ZooPPlace)))
              animalInZoo.get(i).swim();
          }//end for loop
          
          break;
          
          //	Remove all birds, which have a specific callsign.
        case "6":
        
        //test if the array has data. If not it moves on 
        if (animalInZoo.size() <= 0)
        {
            System.out.println("file empty add critters");
            break;
            }
            
        
            System.out.println("Callsign to remove");
            String removeCallSign = keyboard.next();
            
            for (int i = 0; i < animalInZoo.size(); i++) 
            {
            
            if (animalInZoo.get(i).equals(removeCallSign));
                if (animalInZoo.get(i) instanceof Penguin) 
              
                  animalInZoo.set(i, ZooPPlace);
               else
                  animalInZoo.set(i, zooHPlace);
            
                
             }//end for loop
          break; 

        case "7":
          for (int i = 0; i < animalInZoo.size(); i++) {
              System.out.println(animalInZoo.get(i));
              
              
          }//end for loop
          break;
          
//exits case
        case "8":
        case "quit":
          System.out.println("Bye Bye!");
          System.exit(0);
          break;

      } //switch end

      //provide menu of services
      System.out.println();
      list = "Which option do you wish to select?\n";
      list += "\n0 - eat\n1 - chirp\n2 - tap dance penguins\n3 - add new bird\n4 - fly\n5 - swim";
      list += "\n6 - remove based on callsign\n7 - print\n8 - quit.";
      System.out.println(list);

      switchValue = keyboard.next();

    }

  }
}