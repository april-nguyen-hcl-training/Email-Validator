package EmailValidator;

public class Main {

    public static void main(String[] args) {
        EmailList emailList = new EmailList(10);
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

        emailList.printEmails();
    }
}
