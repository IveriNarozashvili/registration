
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User user = new User();
        System.out.println("Your Nick");
        user.setNickName(in.nextLine());
        System.out.println("Your Name");
        user.setFirstName(in.nextLine());
        System.out.println("Your Last name");
        user.setLastName(in.nextLine());
        System.out.println("Your Male");
        user.setYourMale(in.nextLine());
        System.out.println("Where are you from?");
        user.setWhereareyoufrom(in.nextLine());
        System.out.println("Your Year of Birth");



       try {
           user.setBirthYear(in.nextInt());
       } catch (Exception var4) {
           System.err.println("Error");
       }

       if  (user.getBirthYear() > 0 ) {
           System.out.println("You!yes yoy!you have been registration");
           System.out.println("Nick: " + user.getNickName());
           System.out.println("Name: " + user.getFirstName());
           System.out.println("Last name: " + user.getLastName());
           System.out.println("Your male: " + user.getYourMale());
           System.out.println("Your year of birth: " + user.getBirthYear());
       }
        else {
           System.out.println("Davai do svidaniya");
       }
    }





}

