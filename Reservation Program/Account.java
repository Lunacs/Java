import java.util.Arrays;
import java.util.Objects;

public class Account extends Main{
    private static final String[] usernames = {"appleUsername1", "appleUsername2", "appleUsername3"};
    private static final String[] passwords = {"applePassword1", "applePassword2", "applePassword3"};

    String userName, passWord;


    String[] getUsernames(){
        return usernames;
    }

    void setUsername(String user){
       this.userName = user;
    }
    String getUsername(){
        return userName;
    }

    void setPassWord(String pass){
        this.passWord = pass;
    }
    String[] getPassWord(){
        return passwords;
    }


    public static void checkInfo() throws InterruptedException {
        System.out.println();

        boolean isNull = Arrays.stream(Services.reservation_product).allMatch(Objects::isNull);
        if (isNull) {
            System.out.println("You haven't yet reserve a apple product/s.");
            running = false;
            Thread.sleep(2000);
        } else {
            boolean checking = true;
            while (checking) {
                    if (Services.reservation_product == null){
                        System.out.println("You haven't yet reserve a apple product/s.");
                        checking = false;
                        break;
                    }
                Services.formattedDate = Services.dTime.format(Services.formatdTime);
                System.out.println("Reservation date and time: " + Services.formattedDate);
                System.out.println("===============Reserve Products===============");

                try {
                    Services.reservation_product = Arrays.stream(Services.reservation_product)
                            .filter(s -> (s != null && s.length() > 0))
                            .toArray(String[]::new);

                    for (int i = 0; i < Services.reservation_product.length; i++) {
                        Services.formattedPrice = Services.dF.format(Services.reservation_price[i]);
                        System.out.println(Services.reservation_prod_quanti[i] + "pc/s " + " " + Services.reservation_product[i] +
                                "\n Price: P" + Services.formattedPrice);
                        System.out.println();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }

    }
    public void Cancellation() throws InterruptedException {

        System.out.println("---------------Cancellation of Reservation---------------");
        boolean isNull = Arrays.stream(Services.reservation_product).allMatch(Objects::isNull) &&
                Arrays.stream(Services.reservation_price).allMatch(Objects::isNull);

        if (isNull) {
            System.out.println("You haven't yet reserve an apple product/s.");
            Thread.sleep(2000);

        } else {
            System.out.println();
            System.out.print("Do you want to cancel your reserve? Yes\\No:  ");
            String c = Services.input.nextLine();

                if (c.equalsIgnoreCase("Yes")) {

//                    Services.reservation_product = new String[Services.reservation_product.length];
//                    Services.reservation_prod_quanti = new int[Services.reservation_prod_quanti.length];
//                    Services.reservation_price = new int[Services.reservation_price.length];
//
//                    if (Services.reservation_product[0] == null ) {
//                        Services.reservation_product[0] = "0";
//
//                        if(Services.reservation_prod_quanti[0] == 0) {
//                            Services.reservation_prod_quanti[0] = Integer.parseInt("0");
//
//                            if (Services.reservation_price[0] == 0) {
//                                Services.reservation_price[0] = Integer.parseInt("0");


                                //Thread.sleep(2000);
                    for (String v : Services.reservation_product){
                        System.out.println(v);
                    }
                    System.out.println("After clearing an array");
                    Arrays.fill(Services.reservation_product , null);
                    Arrays.fill(Services.reservation_price, 0);
                    Arrays.fill(Services.reservation_prod_quanti, 0);

                    if(Services.reservation_product[0] ==null){
                        Services.reservation_product[0] = "0";
                    }
                                System.out.println();
                                System.out.println("You have now " + Services.reservation_product[0] + " reserve.");

                                System.out.println();
                                System.out.println("Your reservation has been cancelled.");
                                System.out.println();


                           // }
                        //}
                    //}

                } else if (c.equalsIgnoreCase("No")) {
                    System.out.println("Your reserve iPhone products are: ");

                } else {
                    System.out.println("Please input correct answer to the question");
                    System.out.println("If you want to cancel your reserve products type \"Yes\".");
                    System.out.println("Else; press \"No\" if you don't want to cancel your reserve products.");
                }
        }
    }

    public void Pay() throws InterruptedException{
        Thread.sleep(1500);

        System.out.println("            <==========Reserved Apple Product(s)==========>            ");
        Thread.sleep(1500);
        for (int i = 0; i < Services.reservation_product.length; i++) {
            Services.formattedPrice = Services.dF.format(Services.reservation_price[i]);
            System.out.println(Services.reservation_prod_quanti[i] + "pc/s " + " " + Services.reservation_product[i] +
                    "\n Price: P" + Services.formattedPrice);
        }
            System.out.println();
            Thread.sleep(2000);

            boolean paying = true;
            while (paying) {
                System.out.println("Do you want to pay in cash or online? ");
                String CO = Services.input.nextLine();

                if ((CO.equalsIgnoreCase("Cash"))) {
                    System.out.println();
                    System.out.print("Do you want now to Place Order? Y\"N ");
                    String cash = Services.input.nextLine();

                    int sum = 0;
                    if (cash.equalsIgnoreCase("Y")) {
                        Thread.sleep(1500);
                        System.out.println("The payment method on this transaction is Cash on Delivery.");
                        Thread.sleep(2000);
                        System.out.println();
                        System.out.println("Processing reservation...");
                        Thread.sleep(4500);

                        for (int x = 0; x < Services.reservation_price[x]; x++) {
                            sum += Services.reservation_price[x];
                            Services.formattedPrice = Services.dF.format(sum);
                        }
                        Thread.sleep(2000);
                        System.out.println();
                        System.out.println("The reservation has processed.");
                        Thread.sleep(2000);
                        System.out.println();
                        System.out.println("Please prepare an exact amount of " + "P" + Services.formattedPrice + "." +
                                "Photo proof of delivery is required");
                        Thread.sleep(2000);
                        System.out.println();
                        System.out.println("Thank you for reserving and buying an apple product/s to our store. \nWe hope you can reserve again to us in the future");
                        Thread.sleep(1500);
                        System.out.println();
                        System.out.println("Thanks and Be Safe!");

                        paying = false;

                    } else if (cash.equalsIgnoreCase("N")) {
                        running = true;
                    } else {
                        System.out.println("Please answer the question \"Y\" for Yes and \"N\" for No. ");
                    }
                } else if (CO.equalsIgnoreCase("Online")) {
                    Thread.sleep(2000);
                    System.out.println("Unfortunately the online payment method is currently unavailable.");
                    paying = false;
                } else {
                    System.out.println("Invalid Input.");
                }
            }
    }
}
