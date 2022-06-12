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

        boolean isNull = Arrays.stream(Services.reservation_product).allMatch(Objects::isNull) &&
                Arrays.stream(Services.reservation_price).allMatch(Objects::isNull);
        if (isNull) {
            System.out.println("You haven't yet reserve a apple product/s.");
            Thread.sleep(2000);
            //running = false;
        } else {
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
            }catch (Exception e){
                e.printStackTrace();
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
            System.out.print("Do you want to cancel your reserve? ");
            String c = Services.input.nextLine();

            if (c.equalsIgnoreCase("Yes")) {
//                Arrays.fill(Services.reservation_price, 0);
//                for (String i : Services.reservation_product) {
//                    System.out.println("You have now " + i + "reservation");
//                    break;
                System.out.println("After clearing array");
                Services.reservation_product = new String[Services.reservation_product.length];
                System.out.println("You have now " + Services.reservation_product[0] + "reserve." );

                System.out.println("Your reservation has been cancelled");

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

        System.out.println("Do you want to pay in cash or online? ");
        String CO = Services.input.nextLine();

        if ((CO.equalsIgnoreCase("Cash"))){
            System.out.println();
            System.out.println("Do you want now to Place Order? Y\"N ");
            String cash = Services.input.nextLine();

            if(cash.equalsIgnoreCase("Y")){
                Thread.sleep(3000);
                System.out.println("The payment method on this transaction is Cash on Delivery.");
            }
        } else if (CO.equalsIgnoreCase("Online")) {
            System.out.println();
        }else {
            System.out.println("Invalid Input.");
        }
    }
}
