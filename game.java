import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        //Input the player name
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name + "!\n");
        //Banner and Rules of the game
        System.out.println();
        System.out.println("<=============== Welcome to Loniantech Word Guessing game ===============>");
        System.out.println();

        System.out.println("These are the rules for the game");
        System.out.println();
        System.out.println("You, as a player, have to pick what category you want to guess ");
        System.out.println("You can only take a hint in 2 times by typing \"Give me a hint\" ");
        System.out.println("Keep in mind that you only have three times to guess the word ");
        System.out.println("If you runs out number of guess, then it's GAME OVER!");
        System.out.println();
        System.out.println("Good luck " + name + "!!\n");
        //Array of categories of guess
            String[] Categories = {"Country", "Tech Companies", "Tv shows", "Games", "Animals"};
            System.out.println();
            //data type boolean if the user are currently playing
		boolean user_con = true;
		//the variable that store the input in picking the player category
        String userchose;


        while (user_con) {
            System.out.println();
            System.out.println("Options: ");
		    System.out.println();
		    //Print all categories 
            for (String x:Categories) {
                System.out.println(x);
            }
            //display pick a category to pick a player a category of guess
                System.out.println();
            System.out.print("Pick a Category: ");
            userchose = input.nextLine();
            System.out.println();
            String Word = "";
            String Hint1 = "";
            String Hint2 = "";
            String play = "";
            for (String z : Categories){
                //assigning a word in each category
                //assigning hints in each word
               if (z.equalsIgnoreCase(userchose)){
                   switch (z) {
                       case "Country" -> {
                           Word = "Thailand";
                           Hint1 = "It is a country in Asia";
                           Hint2 = "Located at the center of mainland Southeast Asia \n and known for a Tv show of Girl from Nowhere";
                       }
                       case "Tech Companies" -> {
                           Word = "Amazon";
                           Hint1 = "It is where people shop online";
                           Hint2 = "It is a largest e-commerce company in the world \n and the CEO of this company become one of the richest person in the world";
                       }
                       case "Tv shows" -> {
                           Word = "Squid Game";
                           Hint1 = "It is tv show presented by Netflix";
                           Hint2 = "The country it's created is South Korea \n and it became popular when this show released and it's theme is to survive to win big money";
                       }
                       case "Games" -> {
                           Word = "Call of duty mobile";
                           Hint1 = "It is popular mobile game in the Philippines.";
                           Hint2 = "It can be both play by first person POV \n and it can be third person POV and Developed by Garena and adapted from pc video game Call of Duty";
                       }
                       case "Animals" -> {
                           Word = "Lion";
                           Hint1 = "It is known for being the \"King of the Jungle\" ";
                           Hint2 = "It is a mammal that live in in a variety of habitats like grassland and savanna \n and a well muscled cat with a long body large head and short legs and has a hair of mane";
                       }
                   }
                    
               }
            }
            //assigning on what text is  display in each lives
            // if the player inputs give me a hint the program will them a hint1 in each word
            // and if the player inputs No on question if he/she will take a hint the program will continue
            //if the player in the second time inputs give me a hint the program will give then a hint2 in each word
            for(int i = 0; true; i++){
                System.out.println();
                System.out.print("What is your guess: ");                
                String guess = input.nextLine();
                if (guess.equalsIgnoreCase(Word)){
                    System.out.println();
                   System.out.println("Fantastic. You guess the word!");
                   break;
                }else if(!guess.equals(Word) && i == 0){
                    System.out.println();
                    System.out.println("Wrong answer :(");
                    System.out.println();
                    System.out.print("Type give me hint or if not Type no: ");
                    String givemeahint = input.nextLine();
                    if(givemeahint.equalsIgnoreCase("give me a hint")){
                        System.out.println();
                        System.out.println(Hint1);
                    }else if(givemeahint.equalsIgnoreCase("no")){
                        continue;
                    }
                }
                else if(!guess.equals(Word) && i == 1){
                    System.out.println();
                    System.out.println("Wrong guess :(. Try to think outside the box!");
                    System.out.println();
                    System.out.print("Type give me hint or If not Type no: ");
                    String givemeahint1 = input.nextLine();
                    if(givemeahint1.equalsIgnoreCase("give me a hint")){
                        System.out.println();
                        System.out.println(Hint2);
                    }else if(givemeahint1.equalsIgnoreCase("no")){
                        continue;
                    }
                }
                else if(!guess.equals(Word) && i ==2){
                    System.out.println();
                    System.out.println("Wrong guess :(. You have no lives left!");
                    System.out.println();
                   //if the player runs out guesses display game over
                    System.out.println();
                    System.out.println("Game Over!!!");
                    break;
 
                }
            }
            //ask the player if the player will play again
            //if the player play again the loop will repeat starting on picking the category
            //if the player input No the program will end
            System.out.println();
            System.out.println("Play Again? (Yes/No)");
            play = input.nextLine();   
            if(play.equalsIgnoreCase("No")){
				user_con = false;
			}else if(play.equalsIgnoreCase("yes")){
                user_con = true;
            }
		}
    }
}