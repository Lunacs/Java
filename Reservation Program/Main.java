import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class Main {

    static Scanner inputs = new Scanner(System.in);
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
            System.out.println();
            System.out.println("       *===========Apple ID Login===========*       ");
            Thread.sleep(2000);

            System.out.println();
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
            } else if (uName || pWord) {
                System.out.println("Wrong username or password. Please try again");
                login = true;
            } else {
                System.out.println("Wrong username or password. Please provide correct information\n");
                login = true;
            }
        }
        while (running) {
            Thread.sleep(2000);
            System.out.println();
            System.out.println("          ||===============================================================||          ");
            System.out.println("          ||                 * Authorized Apple Reseller *                 ||          ");
            System.out.println("          ||---------------------------------------------------------------||          ");
            System.out.println();
            System.out.println("        ||===================================================================||");
            System.out.println("        ||          _W E L C O M E  T O  C Y B E R -S  M A R K E T_          ||");
            System.out.println("        ||                                                                   ||");
            System.out.println("        ||            Where we offer latest Apple products                   ||");
            System.out.println("        ||             and outstanding customer service as well.             ||");
            System.out.println("        ||                                                                   ||");
            System.out.println("        ||                                        \"Think Different\"          ||");
            System.out.println("        ||===================================================================||");
            System.out.println();
            Thread.sleep(1500);
            System.out.println("Book your apple necessities now!!!");
            Thread.sleep(1000);

            while (returnDashboard) {
                System.out.println();
                System.out.println("Reminder: You must not exceed a 10 limit when reserving a products.");

                System.out.println();
                System.out.println(">>>Press \"1\" to Book Apple Products");
                System.out.println(">>>Press \"2\" to Check reservation info");
                System.out.println(">>>Press \"3\" to Cancel reservation");
                System.out.println(">>>Press \"4\" to Pay");
                System.out.println(">>>Press \"0\" to Exit the program");

                System.out.println();
                System.out.print(">: ");
                String user = inputs.nextLine();


                Thread.sleep(2000);
                if (user.equals("1")) {
                    while (runProducts) {
                        System.out.println();
                        System.out.println("-----Apple Product Categories-----");
                        System.out.println();
                        System.out.println("Type \"cancel\" to go back in the dashboard");
                        System.out.println();

                        for (String p : Products.getCategories()) {
                            System.out.println("==========================");
                            System.out.println("||     " + p + "     ");
                        }
                        System.out.println("==========================");
                        Scanner u = new Scanner(System.in);
                        System.out.println();
                        System.out.print("Category: ");
                        cat = u.nextLine();

                        if (cat.equalsIgnoreCase("iPhones")) {
                            Services.Smartphone();
                        } else if (cat.equalsIgnoreCase("iPads")) {
                            Services.Tablet();
                        } else if (cat.equalsIgnoreCase("Macs")) {
                            Services.Laptop();
                        } else if (cat.equalsIgnoreCase("Cancel")) {
                            returnDashboard = true;
                        } else {
                            System.out.println("Please input correct apple product category.");
                        }
                        if (isDashboard) {
                            break;
                        }
                    }
                } else if (user.equals("2")) {
                    Account.checkInfo();

//                    System.out.println("Press enter to go back in the dashboard");
//                    inputs.nextLine();


                } else if (user.equals("3")) {
                    acc.Cancellation();

//                    System.out.println("Press enter to go back in the dashboard");
//                    inputs.nextLine();
                    running = false;

                } else if (user.equals("4")) {
                    acc.Pay();
                    running = false;
                    break;


                } else if (user.equals("0")) {
                    boolean isNull = Arrays.stream(Services.reservation_product).allMatch(Objects::isNull);
                    if (isNull) {
                        System.out.println("Thank for viewing our app. We hope you can reserve an apple product/s to us soon");
                    } else {
                        System.out.println("Thank you for reserving an apple product/s to us.");
                        System.out.println("Rest assured that your reservation will be a priority when the new apple product arrived.");
                    }
                    running = false;
                    isDashboard = false;
                    returnDashboard = false;

                } else {
                    System.out.println();
                    System.out.println("Please input correct correct number from 1-4 and 0 if you want to exit the program");
                }
            }
        }
    }
 }