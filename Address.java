import java.util.Scanner;

class Contacts{
   String firstName, lastName, Address, City, State;
   Long ZipCode, PhoneNum;
   String Email;

      Contacts(String fName, String lName, String address, String city, String state, long zipCode, long phoneNum, String email){
         firstName = fName;
         lastName = lName;
         Address = address;
         City = city;
         State = state;
         ZipCode = zipCode;
         PhoneNum = phoneNum;
         Email = email;
               }
}

public class Address {

   static String Input1(String a) {
      Scanner i1 = new Scanner(System.in);
      System.out.println(a);
      String input1 = i1.nextLine();
      return input1;
   }

   static long Input2(String b) {
      Scanner i2 = new Scanner(System.in);
      System.out.println(b);
      long input2 = i2.nextLong();
      return input2;
   }


   public static void main(String args[]) {

      String firstName = Input1("Enter First Name: ");
      String lastName = Input1("Enter last Name: ");
      String address = Input1("Enter your address: ");
      String city = Input1("Enter your city: ");
      String state = Input1("Enter your state: ");
      long zipCode = Input2("Enter zip code of your area: ");
      long phoneNum = Input2("Enter phone number: ");
      String email = Input1("Enter your EMail ID: ");


      Contacts Kartik =  new Contacts(firstName, lastName, address, city, state, zipCode, phoneNum, email);
   }
}
