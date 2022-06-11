import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Services extends Main{
    static Products products = new Products();
    static int price;
    static String cat;
    static Scanner input = new Scanner(System.in);
    static String[] reservation_product = new String[10];
    static int[] reservation_price = new int[10];
    static boolean quantity = true;
    static int index = 0;
    static String formattedDate;
    static String formattedPrice;
    static DecimalFormat dF = new DecimalFormat("##,###");
    static LocalDateTime dTime = LocalDateTime.now();
    static DateTimeFormatter formatdTime = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
    static void Smartphone() throws InterruptedException, InputMismatchException {

            System.out.println();
            boolean runSmartphone = true;
            while (runSmartphone) {

                Thread.sleep(1500);
                System.out.println("------------Latest iPhones---------------");
                for (String Category0 : Products.getSmartphones()) {
                    System.out.println("|| " + Category0);
                }
                System.out.println();

                System.out.print("Pick a smartphone you want to reserve: ");
                String phone = input.nextLine();
                products.setSmartphone(phone);

                boolean phones = false;
                for (int i = 0; i < Products.getSmartphones().length; i++) {
                    if (phone.equalsIgnoreCase(Products.getSmartphones()[i])) {
                        phones = false;
                        price = Products.getPhonePrices()[i];
                        formattedPrice = dF.format(price);
                        System.out.println(phone + "     " + "Price: P" + formattedPrice);
                        break;
                    } else {
                        phones = false;
                    }
                }

                if (phones) {
                    System.out.println("Please enter correct name of iPhone.");
                    continue;
                }
                System.out.println();


                while(quantity) {
                    try {
                        System.out.print("How many of " + phone + " you want to reserve? ");
                        products.setqProduct(Integer.parseInt(input.nextLine()));

                        quantity = true;
                        int timesQuantity = products.getqProduct() * price;
                        formattedPrice = dF.format(timesQuantity);

                        System.out.println();
                        Thread.sleep(2000);
                        System.out.println("You reserve " + products.getqProduct() + " pc/s of " + phone + " with a total of " + "P" + formattedPrice);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Input. Please input integer number");
                        quantity = false;
                    }
                }
                LocalDateTime dTime = LocalDateTime.now();
                DateTimeFormatter formatdTime = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
                formattedDate = dTime.format(formatdTime);

                reservation_product[index] = phone;
                reservation_price[index] = price;


                System.out.println();
                Thread.sleep(1500);
                System.out.println("- Type \"Yes\" if you want to reserve again in iPhone");
                System.out.println("- Type \"1\" if you want to reserve in other categories of apple products");
                System.out.println("- Or type \"dashboard\" to return to the main dashboard\n");

                System.out.print("Please pick of command you want to do in the above options: ");
                String reserve = input.nextLine();
                if (reserve.equalsIgnoreCase("Yes")) {
                    index++;
                    continue;
                } else if (reserve.equalsIgnoreCase("1")) {
                    //runSmartphone = false;
                    runProducts = true;
                    return;
                } else if (reserve.equalsIgnoreCase("Dashboard")) {
                    //runSmartphone = false;
                    returnDashboard = true;
                    isDashboard = true;
                    return;
                } else {
                    System.out.println("Please answer the question Yes, 1 or dashboard depending on what you want");
                }
            }
    }

    static void Tablet() throws InterruptedException{
        boolean runTablet = true;
        while (runTablet) {
            Thread.sleep(1500);
            System.out.println("------------Latest iPads---------------");
            for (String Category1 : Products.getTablet()) {
                System.out.println(Category1);
            }
            System.out.println();
            System.out.print("Pick a iPad you want to reserve: ");
            String tablet = input.nextLine();
            products.setTablet(tablet);

            boolean tablets = false;

            for (int i = 0; i < Products.getTablet().length; i++) {
                if (tablet.equalsIgnoreCase(Products.getTablet()[i])) {
                    tablets = false;
                    formattedPrice = dF.format(price);
                    price = Products.getTabletPrices()[i];
                    System.out.println(tablet + "     " + "Price: P" + price);
                    break;
                } else {
                    tablets = false;
                }
            }
            if (tablets) {
                System.out.println("Please enter correct name of iPads.");
                continue;
            }
            while(quantity) {
                try {
                    System.out.println();
                    System.out.print("How many of " + tablet + " you want to reserve? ");
                    products.setqProduct(Integer.parseInt(input.nextLine()));

                    int timesQuantity = products.getqProduct() * price;
                    formattedPrice = dF.format(timesQuantity);
                    System.out.println("You reserve " + products.getqProduct() + " pc/s of " + tablet + " with a total of " + "P" + formattedPrice);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid data type. Please input integer number");
                }
            }
            reservation_product[index] = tablet;
            reservation_price[index] = price;

            System.out.println();
            Thread.sleep(1500);
            System.out.println("- Type \"Yes\" if you want to reserve again in iPads");
            System.out.println("- Type \"1\" if you want to reserve in other categories of apple products");
            System.out.println("- Or type \"dashboard\" to return to the main dashboard\n");

            System.out.print("Please pick of command you want to do in the above options: ");
            String reserve1 = input.nextLine();

            if (reserve1.equalsIgnoreCase("Yes")) {
                index++;
                continue;
            } else if (reserve1.equalsIgnoreCase("No")) {
                //runTablet = false;
                runProducts = true;
                return;
            } else if (reserve1.equalsIgnoreCase("Dashboard")) {
                //System.out.println("aigoo");
                //runSmartphone = false;
                //runProducts = false;
                returnDashboard = true;
                isDashboard = true;
                //System.out.println(isDashboard);
                return;
            } else {
                System.out.println("Please answer the question Yes, 1 or dashboard depending on what you want");
            }
        }
    }

    public static void Laptop() throws InterruptedException {
        boolean runLaptop = true;
        while (runLaptop) {
            System.out.println("------------Latest Macbooks---------------");
            for (String Category2 : Products.getLaptop()) {
                System.out.println(Category2);
            }
            System.out.println();
            System.out.print("Pick a iPad you want to reserve: ");
            String laptop = input.nextLine();
            products.setLaptop(laptop);

            boolean laptops = false;
            for (int i = 0; i < Products.getLaptop().length; i++) {
                if (laptop.equalsIgnoreCase(Products.getLaptop()[i])) {
                    laptops = false;
                    formattedPrice = dF.format(price);
                    price = Products.getLaptopPrices()[i];
                    System.out.println(laptop + "     " + "Price: P" + price);
                    break;
                } else {
                    laptops = false;
                }
            }
                if (laptops) {
                    System.out.println("Please enter correct name of Macbook.");
                    continue;
                }
                while (quantity) {
                    try {
                        System.out.println();
                        System.out.print("How many of " + laptop + " you want to reserve? ");
                        products.setqProduct(Integer.parseInt(input.nextLine()));

                        int timesQuantity = products.getqProduct() * price;
                        formattedPrice = dF.format(timesQuantity);
                        System.out.println("You reserve " + products.getqProduct() + " pc/s of " + laptop + " with a total of " + "P" + formattedPrice);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid data type. Please input integer number");
                    }
                }
                reservation_product[index] = laptop;
                reservation_price[index] = price;

                System.out.println();
                Thread.sleep(1500);
                System.out.println("- Type \"Yes\" if you want to reserve again in iPads");
                System.out.println("- Type \"1\" if you want to reserve in other categories of apple products");
                System.out.println("- Or type \"dashboard\" to return to the main dashboard\n");

                System.out.print("Please pick of command you want to do in the above options: ");
                String reserve2 = input.nextLine();
                if (reserve2.equalsIgnoreCase("Yes")) {
                    index++;
                    continue;

                } else if (reserve2.equalsIgnoreCase("1")) {
                    //runLaptop = false;
                    runProducts = true;
                    return;
                } else if (reserve2.equalsIgnoreCase("Dashboard")) {
                    //runLaptop = false;
                    returnDashboard = true;
                    isDashboard = true;
                    return;
                } else {
                    System.out.println("Please answer the question Yes, 1 or dashboard depending on what you want");
                }
        }
    }
}

