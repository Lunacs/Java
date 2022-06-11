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
            System.out.println("===========Reserve Products===========");

            try {
                Services.reservation_product = Arrays.stream(Services.reservation_product)
                        .filter(s -> (s != null && s.length() > 0))
                        .toArray(String[]::new);

                for (int i = 0; i < Services.reservation_product.length; i++) {
                    Services.formattedPrice = Services.dF.format(Services.reservation_price[i]);
                    System.out.println(Services.reservation_product[i] + "     " + "Price: P" + Services.formattedPrice);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public void Cancellation(){
        System.out.println("--------Cancellation of Reservation--------");
        System.out.println();
        System.out.print("Do you want to cancel your reserve? ");
        String c = Services.input.nextLine();

        if (c.equalsIgnoreCase("Yes")){
            Arrays.fill(Services.reservation_product, null);
            for (String i : Services.reservation_product ) {
                System.out.println("You have now " + i + "reservation");
                break;
            }
            System.out.println("Your reservation has been cancelled");

        } else if (c.equalsIgnoreCase("No")) {
            System.out.println("Your reserve iPhone products are: ");
        }else {
            System.out.println("Please input correct answer to the question");
            System.out.println("If you want to cancel your reserve products type \"Yes\".");
            System.out.println("Else; press \"No\" if you don't want to cancel your reserve products.");
        }
    }


}
