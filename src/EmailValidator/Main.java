package EmailValidator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EmailList emailList = new EmailList();
        emailList.addEmail("Bob.Bezanga@Company.com");
        emailList.addEmail("Sally.Zimmers@Company.com");
        emailList.addEmail("Peter.Pinkelton@Company.com");
        emailList.addEmail("Bobby.Drop@Company.com");
        emailList.addEmail("Rudolph.Rednose@Company.com");
        emailList.addEmail("Bob.Ross@Company.com");
        emailList.addEmail("Ubiga.Altman@Company.com");
        emailList.addEmail("Tony.Ross@Company.com");
        emailList.addEmail("Aaron.Rogers@Company.com");
        emailList.addEmail("Yolo.Once@Company.com");
        emailList.addEmail("Big.Show@Company.com");
        emailList.addEmail("Doug.Dimmadome@Company.com");

        // emailList.printEmails();

        System.out.println("Provide an email to search for:");
        Scanner scan = new Scanner(System.in);
        String searchFor = scan.nextLine();

        boolean foundMatch = emailList.foundMatch(searchFor);
        if (foundMatch) {
            System.out.println(searchFor + " is in email list");
        } else {
            System.out.println(searchFor + " is not in email list");
        }
    }
}
