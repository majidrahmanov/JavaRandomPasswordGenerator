import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many password do you want to generated?");


        int total_password = sc.nextInt();


        System.out.println("How many length of password do you want to generated? ");

        int total_length = sc.nextInt();
        securityofPassword(total_length);

        String passwordArray[] = new String[total_password];

        for (int i = 0; i < total_password; i++) {
            String password = "";

            for (int j = 0; j <total_length ; j++) {

                password = password + randomCharacter();
                //  System.out.println(password);
            }
            passwordArray[i] =password;
        }


        ReturnPassword(passwordArray);

    }


    public  static  void securityofPassword (int security_length) throws ArrayIndexOutOfBoundsException {

        if (security_length < 5) {
            throw new ArrayIndexOutOfBoundsException("Bad Security!");



        }


    }
    public  static  void ReturnPassword ( String[] my_arr){
        for (String str: my_arr) {
            System.out.println(str);
        }

    }
    public static char randomCharacter() {


        int rand = (int) (Math.random() * 62);

        if (rand <= 9){

            int ascii_value = rand+48;
            return  (char) (ascii_value);


        }
        else if (rand>9 && rand <=35) {

            int ascii_value2 = rand +55;
            return  (char) (ascii_value2);
        }

        else{
            int ascii_value3 = rand +61;
            return  (char) (ascii_value3);
        }
    }
}
