import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Services extends Main{
    static Products products = new Products();
    static int price;
    static Scanner input = new Scanner(System.in);
    static String[] reservation_product = new String[10];
    static int[] reservation_price = new int[10];

    static int[] reservation_prod_quanti = new int[10];

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
            System.out.println();
            System.out.println("========================");
            for (String Category0 : Products.getSmartphones()) {
                System.out.println("||   " + Category0);
            }
            System.out.println("========================");
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
                    phones = true;
                }
            }

            if (phones) {
                System.out.println();
                System.out.println("Please enter correct name of iPhone.");
                System.out.println();
                continue;
            }
            System.out.println();

            int timesQuantity = 0;
            int quantityy = 0;
            while (quantity) {
                try {
                    System.out.print("How many of " + phone + " you want to reserve? ");
                    quantityy = Integer.parseInt(input.nextLine());

                    products.setQproducts(products.getQproducts()+quantityy);
                    quantity = true;
                    timesQuantity = quantityy * price;
                    formattedPrice = dF.format(timesQuantity);


                    System.out.println();
                    Thread.sleep(2000);
                    System.out.println("You reserve " + quantityy + " pc/s of " + phone + " with a total of " + "P" + formattedPrice);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Input. Please input integer number");
                    quantity = false;
                }
            }
            LocalDateTime dTime = LocalDateTime.now();
            DateTimeFormatter formatdTime = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
            formattedDate = dTime.format(formatdTime);


            reservation_prod_quanti[index] = quantityy;
            reservation_product[index] = phone;
            reservation_price[index] = timesQuantity;

            boolean boolreserve = true;
            while(boolreserve) {
                if (products.getQproducts() < 10) {
                    System.out.println();
                    Thread.sleep(3000);
                    System.out.println("- Type \"Yes\" if you want to reserve again in iPhone");
                    System.out.println("- Type \"1\" if you want to reserve in other categories of apple products");
                    System.out.println("- Or type \"dashboard\" to return to the main dashboard\n");
                    System.out.print("Please pick of command you want to do in the above options: ");

                    String reserve = input.nextLine();
                    if (reserve.equalsIgnoreCase("Yes")) {
                        index++;
                        break;
                    } else if (reserve.equalsIgnoreCase("1")) {
                        index++;
                        runProducts = true;
                        return;
                    } else if (reserve.equalsIgnoreCase("Dashboard")) {
                        index++;
                        returnDashboard = true;
                        isDashboard = true;
                        return;
                    } else {
                        System.out.println();
                        System.out.println("Please answer the question Yes, 1 or dashboard depending on what you want");
                        boolreserve = false;
                        continue;
                    }
                } else {
                    System.out.println("The limit for reserving an apple product is 10 per account");
                    break;
                }
            }
        }
    }


    static void Tablet() throws InterruptedException{
        boolean runTablet = true;
        while (runTablet) {
            Thread.sleep(1500);
            System.out.println("------------Latest iPads---------------");
            for (String Category1 : Products.getTablet()) {
                System.out.println("|| " + Category1);
            }
            System.out.println();
            System.out.print("Pick a iPad you want to reserve: ");
            String tablet = input.nextLine();
            products.setTablet(tablet);

            boolean tablets = false;

            for (int i = 0; i < Products.getTablet().length; i++) {
                if (tablet.equalsIgnoreCase(Products.getTablet()[i])) {
                    tablets = false;
                    price = Products.getTabletPrices()[i];
                    formattedPrice = dF.format(price);
                    System.out.println(tablet + "     " + "Price: P" + formattedPrice);
                    break;
                } else {
                    tablets = true;
                }
            }
            if (tablets) {
                System.out.println("Please enter correct name of iPads.");
                continue;
            }
            int timesQuantity = 0;
            int quantityy = 0;
            while (quantity) {
                try {
                    System.out.println();
                    System.out.print("How many of " + tablet + " you want to reserve? ");
                    quantityy = Integer.parseInt(input.nextLine());

                    products.setQproducts(products.getQproducts()+quantityy);
                    quantity = true;
                    timesQuantity = quantityy * price;
                    formattedPrice = dF.format(timesQuantity);

                    Thread.sleep(2000);
                    System.out.println();
                    System.out.println("You reserve " + quantityy + " pc/s of " + tablet + " with a total of " + "P" + formattedPrice);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid data type. Please input integer number");
                    quantity = false;
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Your trying to reserve " + products.getQproducts() + " which is above the reserve limit.");
                    System.out.println();
                    quantity = false;
                }
//                finally {
//                    System.out.println("Thank you for reserving " + products.getQproducts() + reservation_product[0] + " to us. :)");
//                    Thread.sleep(2000);
//                }
            }

            reservation_prod_quanti[index] = quantityy;
            reservation_product[index] = tablet;
            reservation_price[index] = timesQuantity;

            boolean boolreserve = true;
            while(boolreserve) {
                if (products.getQproducts() < 10) {
                    System.out.println();
                    Thread.sleep(3000);
                    System.out.println("- Type \"Yes\" if you want to reserve again in iPads");
                    System.out.println("- Type \"1\" if you want to reserve in other categories of apple products");
                    System.out.println("- Or type \"dashboard\" to return to the main dashboard\n");

                    System.out.print("Please pick of command you want to do in the above options: ");
                    String reserve1 = input.nextLine();

                    if (reserve1.equalsIgnoreCase("Yes")) {
                        index++;
                        System.out.println(index);
                        break;
                    } else if (reserve1.equalsIgnoreCase("1")) {
                        index++;
                        runProducts = true;
                        return;
                    } else if (reserve1.equalsIgnoreCase("Dashboard")) {
                        index++;
                        returnDashboard = true;
                        isDashboard = true;
                        return;
                    } else {
                        System.out.println("Please answer the question Yes, 1 or dashboard depending on what you want");
                        boolreserve = false;
                        continue;
                    }
                } else {
                    System.out.println("The limit for reserving apple products is 10 per valid account.");
                    break;
                }
            }
        }
    }

    public static void Laptop() throws InterruptedException {

        boolean runLaptop = true;
        while (runLaptop) {
            System.out.println("------------Latest Macbooks---------------");
            for (String Category2 : Products.getLaptop()) {
                System.out.println("|| " + Category2);
            }
            System.out.println();
            System.out.print("Pick a Mac you want to reserve: ");
            String laptop = input.nextLine();
            products.setLaptop(laptop);

            boolean laptops = false;
            for (int i = 0; i < Products.getLaptop().length; i++) {
                if (laptop.equalsIgnoreCase(Products.getLaptop()[i])) {
                    laptops = false;
                    price = Products.getLaptopPrices()[i];
                    formattedPrice = dF.format(price);
                    System.out.println(laptop + "     " + "Price: P" + formattedPrice);
                    break;
                } else {
                    laptops = true;
                }
            }
            if (laptops) {
                System.out.println("Please enter correct name of Macbook.");
                continue;
            }
            int timesQuantity = 0;
            int quantityy = 0;
            while (quantity) {
                try {
                    System.out.println();
                    System.out.print("How many of " + laptop + " you want to reserve? ");
                    quantityy = Integer.parseInt(input.nextLine());

                    products.setQproducts(products.getQproducts()+quantityy);
                    quantity = true;
                    timesQuantity = quantityy * price;
                    formattedPrice = dF.format(timesQuantity);


                    Thread.sleep(2000);
                    System.out.println();
                    System.out.println("You reserve " + quantityy + " pc/s of " + laptop + " with a total of " + "P" + formattedPrice);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid data type. Please input integer number");
                    quantity = false;
                }
            }

            reservation_prod_quanti[index] = quantityy;
            reservation_product[index] = laptop;
            reservation_price[index] = timesQuantity;

            boolean boolreserve = true;
            while(boolreserve) {
                if (products.getQproducts() < 10) {
                    System.out.println();
                    Thread.sleep(3000);
                    System.out.println("- Type \"Yes\" if you want to reserve again in iPads");
                    System.out.println("- Type \"1\" if you want to reserve in other categories of apple products");
                    System.out.println("- Or type \"dashboard\" to return to the main dashboard\n");

                    System.out.print("Please pick of command you want to do in the above options: ");
                    String reserve2 = input.nextLine();
                    if (reserve2.equalsIgnoreCase("Yes")) {
                        index++;
                        System.out.println(index);
                        break;

                    } else if (reserve2.equalsIgnoreCase("1")) {
                        index++;
                        runProducts = true;
                        return;
                    } else if (reserve2.equalsIgnoreCase("Dashboard")) {
                        index++;
                        returnDashboard = true;
                        isDashboard = true;
                        return;
                    } else {
                        System.out.println("Please answer the question Yes, 1 or dashboard depending on what you want");
                        boolreserve = false;
                        continue;
                    }
                } else {
                    System.out.println("The limit for reserving apple products is 10 per account.");
                    break;
                }
            }
        }
    }
}

