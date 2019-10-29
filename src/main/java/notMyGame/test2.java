package notMyGame;

import java.util.Scanner;
import java.util.Random;




class JavaPractice1 {
    static int BaseEXP;
    static String PlayableCharacterName;





    public static void main(String[] args) {
        //System objects
        Scanner in;
        in = new Scanner(System.in);
        Random rand ;
        rand = new Random();
        int PlayerLevel = 1;
        int GP = 1;



        //Player Variables


        int health = 300;
        int attackDamage = 50;
        int numHealthPotions = 3;
        int healthPotionHealAmount = 50;
        int healthPotionDropChance = 20;

        String[] enemies = {"Elf", "Dwarf", "Halfling", "Man", "Giant", "Goblin", "Orc"};
        int maxEnemyHealth = 250;
        int enemyAttackDamage = 30;
        int expGain = 1;
        int GainGP = rand.nextInt(40);
        expGain = expGain += rand.nextInt(40);

        boolean running = true;

        System.out.println(" Welcome Back Comrades... ");
        System.out.println("\t>> What is your name?");
        PlayableCharacterName = in.nextLine();
        System.out.println(">> Its time to start your journey " + PlayableCharacterName + "...");

        GAME:
        while(running) {

            System.out.println("--------------------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " Has Appeared! #\n");

            while(enemyHealth > 0) {
                System.out.println("\t Your HP " + health);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\t What would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink Potion");
                System.out.println("\t3. Flee");

                String input = in.nextLine();
                if(input.equals("1")) {
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;

                    System.out.println("\t> You hit the " + enemy + " for " + damageDealt + " damage ");
                    System.out.println("\t> You were hit for " + damageTaken + " in response ");

                    if(health < 1) {
                        System.out.println(" You have recieved a killing blow! ");
                        break;
                    }
                }
                else if(input.equals("2")) {
                    if(numHealthPotions > 0) {
                        health += healthPotionHealAmount;
                        numHealthPotions--;
                        System.out.println("\t You drink a Health Potion, you are healed for " + healthPotionHealAmount + "."
                                + "\n\t> You now have" + health + " HP "
                                + "\n\t> You have " + numHealthPotions + " Health potions left.\n ");
                    }
                    else {
                        System.out.println("\t> You have no Health Potions left! Defeat some enemies for a chance to get more!");
                    }
                }
                else if(input.equals("3")) {
                    System.out.println("\t> You successfully escaped from " + enemy + " ! ");
                    continue GAME;
                }
                else {
                    System.out.println("\t Invalid Action");
                }

            }
            if (health < 1){
                System.out.println (" You iz Dedded, Well done you Muppet....");
                break;
            }
            System.out.println("--------------------------------------------");
            System.out.println(" # " + enemy + " was defeated!! #");
            System.out.println(" # You have" + health + " HP left. #");
            BaseEXP += expGain;
            System.out.println("# You have gained " + expGain + "EXP" +
                    "\n You now have " + BaseEXP + "EXP!" );

            if (BaseEXP >= 60) {
                PlayerLevel += 1;

                if (BaseEXP >= 90) {
                    PlayerLevel += 1;
                }
            }
            System.out.println("You have gained a level!");
            System.out.println("You are now Level " + PlayerLevel + "!");

            GP = GP += GainGP;

            System.out.println("You have gained " + GainGP + " GP from " + enemy);
            System.out.println("You now have " + GP + "GP.");


            if (rand.nextInt(100) < healthPotionDropChance) {
                numHealthPotions++;
                System.out.println("You found a Health Potion from corpse of " + enemy + "#" );
                System.out.println("You now have " + numHealthPotions + "Health Potions left. #");

                System.out.println("--------------------------------------------");
                System.out.println("What would you like to do now?");
                System.out.println("1. Continue Battling");
                System.out.println("2. Leave ");
                System.out.println("3. Shop");
            }
            String input = in.nextLine();


            while(!input.equals("1") && (!input.equals("2") && (input.equals("3")))) {
                System.out.println("Invalid");
                input = in.nextLine();
            }

            if(input.equals ("1")) {
                System.out.println("Hi Ho, Hi Ho, Adventuring we goooo!!!!");
            }
            else if(input.equals ("2"))  {
                System.out.println("Live to fight another day...");
                break;
            }




        }

        System.out.println("###############");
        System.out.println("Thank you come again!!");
        System.out.println("###############");
    }}
