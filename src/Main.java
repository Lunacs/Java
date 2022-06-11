import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class Main {

    static Services s = new Services();
    static Main main = new Main();
    static Account acc = new Account();

    static boolean running = true;
    static boolean runProducts = true;
    static boolean returnDashboard = true;
    static boolean isDashboard = false;

    static String cat;

    public static void main(String[] args) throws InterruptedException, IOException {
        boolean login = true;

        while (login) {
            Scanner user = new Scanner(System.in);
            System.out.print("Apple Username: ");
            String username = user.nextLine();

            acc.setUsername(username);

            Scanner pass = new Scanner(System.in);
            System.out.print("Apple Password: ");
            String password = pass.nextLine();

            acc.setPassWord(password);

            boolean uName = false;
            for (int i = 0; i < acc.getUsernames().length; i++) {
                if (username.equalsIgnoreCase(acc.getUsernames()[i])) {
                    uName = true;
                    break;
                }
            }

            boolean pWord = false;
            for (int i = 0; i < acc.getPassWord().length; i++) {
                if (password.equalsIgnoreCase(acc.getPassWord()[i])) {
                    pWord = true;
                    break;
                }
            }
            System.out.println();
            if (uName && pWord) {
                System.out.println("Welcome apple user " + acc.getUsername() + "!");
                login = false;
            } else {
                System.out.println("Invalid input. Please provide correct information\n");
                login = true;
            }
        }
        while (running) {
            Thread.sleep(2000);
            System.out.println();
            System.out.println("|==============================================================|");
            System.out.println("|                                                              |");
            System.out.println("|     _W E L C O M E  T O  C Y B E R -S  S O L U T I O N S_    |");
            System.out.println("|                      Where we offer                          |");
            System.out.println("|             original and affordable Apple products           |");
            System.out.println("|                                                              |");
            System.out.println("|==============================================================|");
            System.out.println();
            Thread.sleep(1500);
            System.out.println("Book your apple necessities now!!!");
            Thread.sleep(1000);

            while (returnDashboard){
            System.out.println();
            System.out.println("Reminder: You must not exceed a 10 limit when reserving a products.");

                System.out.println();
            System.out.println(">>>Press \"1\" to Book Apple Products");
            System.out.println(">>>Press \"2\" to Check reservation info");
            System.out.println(">>>Press \"3\" to Cancel reservation");
            System.out.println(">>>Press \"4\" to Pay");
            System.out.println(">>>Press \"0\" to Exit the program");

//            InputStreamReader r = new InputStreamReader(System.in);
//            BufferedReader br = new BufferedReader(r);

            System.out.println();
            System.out.print(">: ");
            String user = Services.input.nextLine();


            Thread.sleep(2000);
            if (user.equals("1")) {
                while (runProducts) {
                    System.out.println();
                    System.out.println("-----Apple Product Categories-----");
                    for (String p : Products.getCategories()) {
                        System.out.println(p);
                    }
                    Scanner u = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Category: ");
                    cat = u.nextLine();

                    if (cat.equalsIgnoreCase("Smartphones")) {
                        Services.Smartphone();
                    } else if (cat.equalsIgnoreCase("Tablets")) {
                        Services.Tablet();
                    } else if (cat.equalsIgnoreCase("Laptops")) {
                        Services.Laptop();
                    } else {
                        System.out.println("Please input correct apple product category.");
                    }
                    if (isDashboard) {
                        break;
                    }
                }
            }  else if (user.equals("2")) {
                    Account.checkInfo();
            } else if (user.equals("3")) {
                    acc.Cancellation();
            } else if (user.equals("4")) {
                    System.out.println();
            } else {
                    System.out.println("Please input correct correct number from 1-4 and 0 if you want to exit the program");
            }

                if (user.equals("0")) {
                    boolean isNull = Arrays.stream(Services.reservation_product).allMatch(Objects::isNull) &&
                            Arrays.stream(Services.reservation_price).allMatch(Objects::isNull);
                    if (isNull) {
                        System.out.println("Thank for viewing our app. We hope you can reserve an apple product/s to us soon");
                    } else {
                        System.out.println("Thank you for reserving an apple product/s to us.");
                        System.out.println("Rest assured that your reservation will be a priority when the new apple product arrived.");
                    }

                    running = false;

                }
            }
        }
    }
 }