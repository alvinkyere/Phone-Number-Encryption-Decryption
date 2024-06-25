import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------              -----------------");
        System.out.println("           Number Encryption System           ");
        System.out.println("---------------              -----------------");


        System.out.println("Enter a 10 digit Phone Number \n =");
        final long PHONE_NUM =scanner.nextLong();
        System.out.println();

        long Area_C            =(PHONE_NUM / 10000000);
        long Remainder_after_areaCode = (PHONE_NUM % 10000000);
        long Central_0        =(Remainder_after_areaCode / 10000);
        long Station_N         =(Remainder_after_areaCode % 10000);

        int Area_Code    =(int)Area_C;
        int Central_Code    =(int)Central_0;
        int Station_Number  =(int)Station_N;

        //Rearranging the phone number
        System.out.println("Re-arranging the phone number");
        System.out.println("("+ Area_Code +")" + " "+ Central_Code + " " + Station_Number );
        System.out.println();
        //----Step 2:::::::Encrypting the station number
        int Encrypted_Value_One     =Station_Number % 10000 / 100;
        int Encrypted_Value_Two     =Station_Number % 100;


        //--------Adding 33 to first number
        Encrypted_Value_One =Encrypted_Value_One + 33;
        Encrypted_Value_Two = Encrypted_Value_Two + 33;

        //convering each number into a char by type-casting
    char Char_Encrypted_One = (char)Encrypted_Value_One;
    char CHar_Encrypted_Value_Two = (char)Encrypted_Value_Two;

        System.out.println("Newly Encrypted Number");
        System.out.println( );
        System.out.println("("+ Area_Code +")" + " " + Central_Code + " - "
               + Char_Encrypted_One + CHar_Encrypted_Value_Two );
                System.out.println(" ");

        //-----Step 3:::::::::      c   ontinuing o numbers
        int Combined_Two_Number = Area_Code * 1000 + Central_Code;
        System.out.println("Encrypted Number");
        System.out.println(Combined_Two_Number);
        System.out.println();

        Combined_Two_Number = Integer.MAX_VALUE - Combined_Two_Number;
        System.out.println("New Generated Combined Value ");

        System.out.println(Combined_Two_Number);
        System.out.println();


        //Reverting Combined_Two_Number into the encrypted number
        System.out.println("Original Combined Two Number");
         int original_Combined_Two_Number = Integer.MAX_VALUE - Combined_Two_Number;
        System.out.println(original_Combined_Two_Number);
        System.out.println();

        //Re-arranging the result
        System.out.println("Rearranging results");
        System.out.println(Char_Encrypted_One + "" + original_Combined_Two_Number + ""
                + CHar_Encrypted_Value_Two);
        System.out.println();

        //Decrypting the final result
        int Decombined_Two_Number = original_Combined_Two_Number - Central_Code % 1000000;
        System.out.println("Decombined Number");
        System.out.println(Decombined_Two_Number);
        System.out.println();


        //reversing decombined_two_number into the newly encrypted number
        System.out.println("Decrypted Decombined number into Newly Encrypted number");
        int new_area_code = Decombined_Two_Number  / 1000;
        System.out.println(new_area_code);
        System.out.println();


        //newly encrypted number diplayed
        System.out.println("Newly encrypted number");
        System.out.println("("+new_area_code+")"+ "" +" " +Central_Code+ " - "
               + Char_Encrypted_One + CHar_Encrypted_Value_Two);
        System.out.println();

        //reversing char to int
         int Decrypted_Value_One = (int) Char_Encrypted_One;
         int Decrypted_Value_Two = (int) CHar_Encrypted_Value_Two;

         Decrypted_Value_One = Decrypted_Value_One -33;
        Decrypted_Value_Two = Decrypted_Value_Two - 33;


        System.out.println("Decrypted Number");
        System.out.println("("+new_area_code+")" +" " +Central_Code+ " - "
               + Decrypted_Value_One + Decrypted_Value_Two);
        System.out.println();

    }
}