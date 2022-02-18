// Harsh Shakya - Pokemon Game
package PokemonAdventureGame;
import java.util.Scanner;

public class PokemonAdventureGame {

    //method for charmander
    public static void Charmander()
    {
    
        System.out.println("* You chose Charmander *");
        System.out.println("* Charmander, the Lizard Pokémon. Charmander's health");
        System.out.println(" can be gauged by the fire on the tip of its tail, which burns ");
        System.out.println("intensely when it's in good health. *");
        System.out.println("----------------------------------------------------------------");
        System.out.println(" ");
    
    }
    //method for squirtle
    public static void Squirtle()
    {
        
        System.out.println("* You chose Squirtle *");
        System.out.println("* This Tiny Turtle Pokémon draws its long neck into its shell to *");
        System.out.println("* launch incredible water attacks with amazing range and accuracy. The *");
        System.out.println("* blasts can be quite powerful. *");
        System.out.println("----------------------------------------------------------------");
        System.out.println(" ");
        
    }
    //method for bulbasaur
    public static void Bulbasaur()
    {
        
        System.out.println("* You chose Bulbasaur *");
        System.out.println("The Seed Pokémon. A young Bulbasaur uses the nutrients from its ");
        System.out.println("seed for the energy it needs to grow.");
        System.out.println("----------------------------------------------------------------");
        System.out.println(" ");
        
    }
    //method for health
    public static int Health(int n1, int n2)
    {
     
        int health;
        health = n1 - n2;
        
        return (health);
    }
    //method for damage taken
    public static int Damage(int n1, int n2)
    {
        
        int wHealth;
        wHealth = n1 - n2;
        
        return (wHealth);
        
    }
    
    public static void main(String[] args) {
        
    //scanner class
    Scanner keyedInput = new Scanner (System.in);
    
    //dialog
    System.out.println("Welcome to the world of Pokemon");
    System.out.println("In this world, humans and Pokemon coexist in harmony.");
    System.out.println("-----------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("* You wake up to the sound of your alarm *");
    System.out.println("* You need to go to the lab today *");
    System.out.println("------------------------------------------");
    System.out.println(" ");
    //integer for choice
    int choice = 0;
    //pick if you want to sleep or get up
    System.out.println("1. Sleep in");
    System.out.println("2. Get up");
    System.out.println("---------------");
    System.out.print("Pick an option: ");
    
    choice = keyedInput.nextInt();
    //if choice is 1
    if (choice == 1)
    {
        
        System.out.println("* You wake up to the sound of yelling *");
        System.out.println(" ");
        System.out.println(" 'WAKE UP BEFORE YOUR TOO LATE FOR THE LAB' ");
        System.out.println(" ");
        System.out.println("* You realize your late and you get up and get ready to go to the lab *");
        
    }
    //if choice is 2
    if (choice == 2)
    {
        
        System.out.println("* You get up and get ready to go to the lab to meet the Professor *");
        System.out.println("-------------------------------------------------------------------");
        System.out.println(" ");
        
    }
    //dialog
    System.out.println("* Your on your way to the lab to meet the professor when you here screaming coming from the nearby tall grass *");
    System.out.println("* You slowly walk to the grass to see whats happening *");
    System.out.println("---------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    System.out.println("* You see the Professor being attacked by a wild Pokemon! *");
    System.out.println("-----------------------------------------------------------");
    System.out.println(" ");
    System.out.println("Professor: Go check my bag there are 3 pokeball's in there. Pick one and help!!");
    System.out.println("-------------------------------------------------------------------------------");
    System.out.println(" ");
    //variable for pokemon choice
    int pChoice = 0;
    //dialog
    System.out.println("* You run to the bag and check them using your PokeDex *");
    System.out.println("--------------------------------------------------------");
    //choosing pokemon
    System.out.println("1. Charmander");
    System.out.println("2. Squirtle");
    System.out.println("3. Bulbasaur");
    System.out.println(" ");
    System.out.println("* Choose one *");
    pChoice = keyedInput.nextInt();
    //declaring variables
    String pokemon = null;
    int pHealth = 0;
    int pAttack1 = 0;
    int pAttack2 = 0;
    int pAttack3 = 0;
    boolean run = true;
    int wildHealth = 20;
    int wildAttack = 6;
    int aChoice = 0;
    int rChoice = 0;
    
    //if pChoice is 1
    if (pChoice == 1)
    {
        //declaring variables
        pokemon = "Charmander";
        pHealth = 25;
        pAttack1 = 13;
        pAttack2 = 12;
        pAttack3 = 11;
        
        System.out.println("");
        //returning charmander method
        Charmander();
        
    }
    //if pChoice is 2
    if (pChoice == 2)
    {
        //declaring variables
        pokemon = "Squirtle";
        pHealth = 25;
        pAttack1 = 10;
        pAttack2 = 9;
        pAttack3 = 8;
        
        System.out.println(" ");
        //returning squirtle method
        Squirtle();
        
    }
    //if pChoice = 3
    if (pChoice == 3)
    {
        //declaring variables
        pokemon = "Bulbasaur";
        pHealth = 25;
        pAttack1 = 7;
        pAttack2 = 8;
        pAttack3 = 7;
        
        System.out.println(" ");
        //returning bulbasaur method
        Bulbasaur();
        
    }
    //dialog
    System.out.println("* You release " + pokemon + " to battle the pokemon and help the professor *");
        
    
        
    System.out.println("'Go " + pokemon + "! '");
    System.out.println(" ");
    
    System.out.println("* A WILD EKANS HAS APPEARED *");
    System.out.println("-----------------------------");
    System.out.println(" ");
    //declaring variable
    String wildPoke = "Ekans";
    
    //main while loop
    while(run)
    {
        
        
        //while loop for the opposing pokemon health
        while (wildHealth > 0)
        {
            //menu
            System.out.println("Choose an attack:");
            System.out.println("");
            System.out.println("1. Tackle");
            System.out.println("2. Scratch");
            System.out.println("3. Growl");
            System.out.println("Choose: ");
            aChoice = keyedInput.nextInt();
            //if choice is 1
            if (aChoice == 1)
            {
                //return damage method
                wildHealth = Damage(wildHealth, pAttack1);
                System.out.println("* " + wildPoke + " took 13 damage! *");
                System.out.println("* " + wildPoke + " health: " + wildHealth + " *");
            
                System.out.println("");
                System.out.println("* The wild " + wildPoke + " attacked! *");
                System.out.println("* " + pokemon + " took damage 5 damage! *");
                //return health subroutine
                pHealth = Health(pHealth, wildAttack);
                System.out.println(pokemon + " Health: " + pHealth);
                //if statement for when health is < 1
                if(pHealth < 1)
                {
                    //break statement
                    System.out.println(pokemon + " took too much damage!");
                    break;
                    
                }
            
            }
            //if choice is 2
            if (aChoice == 2)
            {
                //return damage method
                wildHealth = Damage(wildHealth, pAttack2);
                System.out.println("* " + wildPoke + " took 12 damage! *");
                System.out.println("* " + wildPoke + " health: " + wildHealth + " *");
                
                System.out.println("");
                System.out.println("* The wild " + wildPoke + " attacked! *");
                System.out.println("* " + pokemon + " took damage 5 damage! *");
                //return health method
                pHealth = Health(pHealth, wildAttack);
                System.out.println(pokemon + " Health: " + pHealth);
                //if statement for when health is < 1
                if(pHealth < 1)
                {
                    //break statement
                    System.out.println(pokemon + " took too much damage!");
                    break;
                    
                }
                
            }
            //if choice is 3
            if (aChoice == 3)
            {
                //return damage method
                wildHealth = Damage(wildHealth, pAttack3);
                System.out.println("* " + wildPoke + " took 11 damage! *");
                System.out.println("* " + wildPoke + " health: " + wildHealth + " *");
                
                System.out.println("");
                System.out.println("* The wild " + wildPoke + " attacked! *");
                System.out.println("* " + pokemon + " took damage 5 damage! *");
                //return health method
                pHealth = Health(pHealth, wildAttack);
                System.out.println(pokemon + " Health: " + pHealth);
                //if pHealth is < 1
                if(pHealth < 1)
                {
                    //break statement
                    System.out.println(pokemon + " took too much damage!");
                    break;
                    
                }
                
            }
        
       
            
        }
        //if statement for when pHealth is < 1
        if(pHealth < 1)
        {
            //break statement
            System.out.println("*You black out and wake up in your bed*");
            break;
        }
        //if statement for when wildHealth < 1
        if(wildHealth < 1)
        {
            System.out.println("* YOU HAVE DEFEATED EKANS *");
        }
        
        //dialog
        System.out.println("");
        System.out.println("Professor: 'Thank you so much for saving me!'");
        System.out.println("Professor: 'You will be able to keep that pokemon with you for the rest of your battles.'");
        System.out.println("Professor: 'Make sure to take care of it!'");
        System.out.println("");
        System.out.println("Professor: 'Here is a gift for saving my life.'");
        System.out.println("");
        System.out.println("* Professor hands you a precious stone *");
        System.out.println("");
        System.out.println("Professor: 'This stone is very rare and has the ability to empower all pokemon that hold");
        System.out.println("this item and have a powerful bond with their trainer.'");
        System.out.println("");
        System.out.println("* You decide to take the long way home so you can spend some more time with your pokemon *");
        System.out.println("");
        
        
        
        System.out.println("* At the end of the road there is a fork in the road *");
        System.out.println("* Choose road 1 or 2 *");
        System.out.println("Enter your choice: ");
        rChoice = keyedInput.nextInt();
        //wild pokemon 2's variables
        String wildPoke2 = "Toxicroak";
        int wildAttack2 = 8;
        int wildHealth2 = 25;
        //if route choice is 1
        if (rChoice == 1)
        {
            //dialog
            System.out.println("* You walk into the forest *");
            System.out.println("* You get an uneasy feeling as you walk down the dark road *");
            System.out.println("Thief: 'I see that you have a rare stone ....... I WANT IT!'");
            System.out.println("");
            System.out.println("* Thief sent out Toxicroak *");
            System.out.println("");
            System.out.println("'Go " + pokemon + "!'");
            //pokemon is healed to full health
            pHealth = 25;
        //while loop for wildHealth2
        while (wildHealth2 > 0)
        {
            //menu
            System.out.println("Choose an attack:");
            System.out.println("");
            System.out.println("1. Ember");
            System.out.println("2. Scratch");
            System.out.println("3. Tackle");
            System.out.println("Choose: ");
            aChoice = keyedInput.nextInt();
            //if attack choice is 1
            if (aChoice == 1)
            {
                //return damage method
                wildHealth2 = Damage(wildHealth2, pAttack1);
                System.out.println("* " + wildPoke2 + " took 13 damage! *");
                System.out.println("* " + wildPoke2 + " health: " + wildHealth2 + " *");
            
                System.out.println("");
                System.out.println("* The wild " + wildPoke2 + " attacked! *");
                System.out.println("* " + pokemon + " took damage 5 damage! *");
                pHealth = Health(pHealth, wildAttack2);
                System.out.println(pokemon + " Health: " + pHealth);
                
                if(pHealth < 1)
                {
                    
                    System.out.println(pokemon + " took too much damage!");
                    break;
                    
                }
            
            }
            
            if (aChoice == 2)
            {
                 
                wildHealth2 = Damage(wildHealth2, pAttack2);
                System.out.println("* " + wildPoke2 + " took 12 damage! *");
                System.out.println("* " + wildPoke2 + " health: " + wildHealth2 + " *");
                
                System.out.println("");
                System.out.println("* The wild " + wildPoke2 + " attacked! *");
                System.out.println("* " + pokemon + " took damage 5 damage! *");
                pHealth = Health(pHealth, wildAttack2);
                System.out.println(pokemon + " Health: " + pHealth);
                
                if(pHealth < 1)
                {
                    
                    System.out.println(pokemon + " took too much damage!");
                    break;
                }
            }
            
            if (aChoice == 3)
            {
                
                wildHealth2 = Damage(wildHealth2, pAttack3);
                System.out.println("* " + wildPoke2 + " took 11 damage! *");
                System.out.println("* " + wildPoke2 + " health: " + wildHealth2 + " *");
                
                System.out.println("");
                System.out.println("* The wild " + wildPoke2 + " attacked! *");
                System.out.println("* " + pokemon + " took damage 5 damage! *");
                pHealth = Health(pHealth, wildAttack2);
                System.out.println(pokemon + " Health: " + pHealth);
                
                if(pHealth < 1)
                {
                    
                    System.out.println(pokemon + " took too much damage!");
                    break;
                }
            }
        }
        if(pHealth < 1)
        {
            System.out.println("*You black out and wake up in your bed*");
            break;
        }
        
        if(wildHealth2 < 1)
                {
                    System.out.println("* You have defeated the thief *");
                    System.out.println("* Congratulations! *");
                    break;
                }
        
        }
        
        
        
        if (rChoice == 2)
        {
            pHealth = 25;
            
            System.out.println("* You walk down the long narrow path by the river towards your house *");
            System.out.println("* As your about reach your house you here someone yelling in the distance *");
            System.out.println("You: 'I think it's coming from the pokemon center");
            System.out.println("* You head to the pokemon center where you meet Red, your rival *");
            System.out.println("Red: 'Funny seeing you here'");
            System.out.println("Red: 'I see you've recieved your pokemon from the preofessor aswell.");
            System.out.println("You: 'Let's have a battle!");
            System.out.println(" ");
            System.out.println("*red sent out Pikachu*");
        
            String wildPoke3 = "Pikachu";
            int wildAttack3 = 9;
            int wildHealth3 = 25;
            
            while (wildHealth3 > 0)
        {
            
            System.out.println("Choose an attack:");
            System.out.println("");
            System.out.println("1. Tackle");
            System.out.println("2. Scratch");
            System.out.println("3. Growl");
            System.out.println("Choose: ");
            aChoice = keyedInput.nextInt();
            
            if (aChoice == 1)
            {
                
                wildHealth3 = Damage(wildHealth3, pAttack1);
                System.out.println("* " + wildPoke3 + " took 13 damage! *");
                System.out.println("* " + wildPoke3 + " health: " + wildHealth3 + " *");
            
                System.out.println("");
                System.out.println("* The wild " + wildPoke3 + " attacked! *");
                System.out.println("* " + pokemon + " took damage 5 damage! *");
                pHealth = Health(pHealth, wildAttack3);
                System.out.println(pokemon + " Health: " + pHealth);
                
                if(pHealth < 1)
                {
                    
                    System.out.println(pokemon + " took too much damage!");
                    break;
                    
                }
                
            }
            
            if (aChoice == 2)
            {
                
                wildHealth3 = Damage(wildHealth3, pAttack2);
                System.out.println("* " + wildPoke3 + " took 12 damage! *");
                System.out.println("* " + wildPoke3 + " health: " + wildHealth3 + " *");
                
                System.out.println("");
                System.out.println("* The wild " + wildPoke3 + " attacked! *");
                System.out.println("* " + pokemon + " took damage 5 damage! *");
                pHealth = Health(pHealth, wildAttack3);
                System.out.println(pokemon + " Health: " + pHealth);
                
                if(pHealth < 1)
                {
                    
                    System.out.println(pokemon + " took too much damage!");
                    break;
                }
                
            }
            
            if (aChoice == 3)
            {
                
                wildHealth3 = Damage(wildHealth3, pAttack3);
                System.out.println("* " + wildPoke3 + " took 11 damage! *");
                System.out.println("* " + wildPoke3 + " health: " + wildHealth3 + " *");
                
                System.out.println("");
                System.out.println("* The wild " + wildPoke3 + " attacked! *");
                System.out.println("* " + pokemon + " took damage 5 damage! *");
                pHealth = Health(pHealth, wildAttack3);
                System.out.println(pokemon + " Health: " + pHealth);
                
                if(pHealth < 1)
                {
                    
                    System.out.println("");
                    System.out.println(pokemon + " took too much damage!");
                    break;
                }
                
                
            }
        }
            if(pHealth < 1)
        {
            System.out.println("");
            System.out.println("*You black out and wake up in your bed*");
            break;
        }
            
            if(wildHealth3 < 1)
                {
                    System.out.println("");
                    System.out.println("* You beat Red! *");
                    System.out.println("* Congratulations! *");
                    break;
                }
            
        }
            
            
            
            
        }
        System.out.println("");
        System.out.println("$$ THANKS FOR PLAYING! $$");
        
        
        
        
        
        
        
        
        
        
    
    
    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
