import java.util.Scanner;

public class itemsearcher_Group4_Batch1 {
	public static void main(String[] args) {
		//Log-in Form
		boolean login = true;
		while(login){
			Scanner user= new Scanner(System.in);
			System.out.print("Employee Username: ");
			String username = user.nextLine();

			Scanner pass= new Scanner(System.in);
			System.out.print("Employee Password: ");
			String passwordd = pass.nextLine();
			//Array of  usernames and passwords
			String[] mga_username = {"Username1", "Username2", "Username3"};
			String[] mga_pass = {"Password1", "Password2", "Password3"};
			//for each loop for iterating the array and finding the match username and password
			boolean use = false;
			for (String x : mga_username) {
				if(x.equals(username)){
					use = true;
					break;
				}else use = false;
			}
			boolean pas = false;
			for (String y: mga_pass) {
				if(y.equals(passwordd)){
					pas = true;
					break;
				}else pas = false;
			}
			//Print Welcome if the username and pass are correct
			if(use && pas){
				System.out.println();
				System.out.println("Welcome Employee " + username + "!\n");
				login = false;
				//Print  Invald input if the username and password are incorrect
			}else {
				System.out.println();
				System.out.println("Invalid input try again\n");
				login = true;
			}
		}

		Scanner input = new Scanner(System.in);

		//Array of different categories of items
		String Categories[]= {"Snacks", "Shampoo", "Soap","Detergents", "Cigarretes", "Candies", "Biscuits", "Noodles",
				"Softdrinks", "Ice cream", "Seasoning", "School Supplies" };

		//Arrays of items per categories
		String[] Snacks = {"Piattos       ₱14",
				"Nova          ₱14",
				"Vcut          ₱14",
				"Clover        ₱8",
				"Tortillos     ₱8",
				"Mang Juan     ₱8",
				"Oishi         ₱9",
				"Chippy        ₱10"};

		String[] Shampoo = 	{"Palmolive                 ₱7",
				"Sunsilk                   ₱7",
				"Head & Shoulders          ₱7",
				"Cream Silk conditioner    ₱7"};

		String[] Soap = {"Safeguard    ₱19",
				"Greencross   ₱17",
				"Johnson's    ₱19"};

		String[] Detergents = {"Champion Detergent  ₱7",
				"Surf Powder         ₱7",
				"Breeze Powder       ₱13",
				"Calla Powder        ₱14",
				"Ariel Powder        ₱13",
				"Tide Powder         ₱12"};

		String[] Cigarretes = {"Marlboro     ₱8",
				"Fortune      ₱7",
				"Mighty       ₱6",
				"Winston      ₱7"};

		String[] Candies = {"Snowbear	₱1",
				"Frutos		₱1",
				"Mentos		₱3",
				"Maxx		₱1",
				"lollipop	₱1"};

		String[] Biscuits = {"Sky Flakes     ₱6",
				"Rebisco        ₱6",
				"Wafrets        ₱7",
				"Hansel         ₱6",
				"Chocomucho     ₱7"};

		String[] Noodles =  {"Luck Me            ₱10",
				"Nissin Ramen       ₱13",
				"Pancit Canton      ₱14"};

		String[] Softdrinks = {"Coca-cola mismo		₱15",
				"Coca-cola 1.5L		₱55",
				"Sprite mismo		₱15",
				"Sprite 	  1.5L		₱55",
				"Pepsi  mismo		₱14",
				"Pepsi     1.5L		₱53",
				"Royal  mismo		₱15",
				"Royal     1.5L		₱50"};

		String[] Icecream = {"Selecta   1.5L   ₱240",
				"Creamline 1.5L   ₱210",
				"Magnolia  1.5L   ₱235"};

		String[] Seasoning = {"Magic Sarap		₱4",
				"Ajinomoto		₱5",
				"Namnam			₱4",
				"Ginisa Mix		₱3"};

		String[] School_Supplies = {"Ballpen           ₱5",
				"Pencil            ₱5",
				"Scissors          ₱10",
				"Bondpaper 2pcs    ₱1"};
		//Display banner of sari sari store
		System.out.println("<---------- Sari-Sari Store Item Searcher ---------->");
		System.out.println();
		boolean user_continue = true;
		System.out.println("Options: ");
		System.out.println();
		//Print all categories 
		for (String x:Categories) {
			System.out.println(x);
		}
		//If the user type exit the program will end
		System.out.println();
		System.out.println("Type Exit to close the program");
		//if the user continue the program display the search text
		while (user_continue) {
			System.out.println();
			System.out.print("Search: ");
			String user_chose = input.nextLine();
			System.out.println();
			//If the user search specific categories print all items inside it
			for (String y : Categories) {
				if (y.equalsIgnoreCase(user_chose)) {
					if (y == "Snacks") {
						System.out.println("===========================");
						for (String Categorie0 : Snacks) {
							System.out.println(Categorie0);
						}
						System.out.println("===========================");
					} else if (y == "Shampoo") {
						System.out.println("===========================");
						for (String Categorie1 : Shampoo) {
							System.out.println(Categorie1);
						}
						System.out.println("===========================");
					} else if (y == "Soap") {
						System.out.println("===========================");
						for (String Categorie2 : Soap) {
							System.out.println(Categorie2);
						}
						System.out.println("===========================");
					} else if (y == "Detergents") {
						System.out.println("===========================");
						for (String Categorie3 : Detergents) {
							System.out.println(Categorie3);
						}
						System.out.println("===========================");
					} else if (y == "Cigarretes") {
						System.out.println("===========================");
						for (String Categorie4 : Cigarretes) {
							System.out.println(Categorie4);
						}
						System.out.println("===========================");
					} else if (y == "Candies") {
						System.out.println("===========================");
						for (String Categorie5 : Candies) {
							System.out.println(Categorie5);
						}
						System.out.println("===========================");
					} else if (y == "Biscuits") {
						System.out.println("===========================");
						for (String Categorie6 : Biscuits) {
							System.out.println(Categorie6);
						}
						System.out.println("===========================");
					} else if (y == "Noodles") {
						System.out.println("===========================");
						for (String Categorie7 : Noodles) {
							System.out.println(Categorie7);
						}
						System.out.println("===========================");
					} else if (y == "Softdrinks") {
						for (String Categorie8 : Softdrinks) {
							System.out.println(Categorie8);
						}
						System.out.println("===========================");
					} else if (y == "Ice cream") {
						System.out.println("===========================");
						for (String Categorie9 : Icecream) {
							System.out.println(Categorie9);
						}
						System.out.println("===========================");
					} else if (y == "Seasoning") {
						System.out.println("===========================");
						for (String Categorie10 : Seasoning) {
							System.out.println(Categorie10);
						}
						System.out.println("===========================");
					} else if (y == "School Supplies") {
						System.out.println("===========================");
						for (String Categorie11 : School_Supplies) {
							System.out.println(Categorie11);
						}
						System.out.println("===========================");
					}
				}
			}
			if(user_chose.equalsIgnoreCase("exit")){
				user_continue = false;
			}
		}
	}
}
