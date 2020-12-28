package EmailValidator;

import java.util.ArrayList;

public class EmailList {
    ArrayList<String> emails;

    public EmailList() {
        this.emails = new ArrayList<String>();
    }

    public void addEmail(String email) {
        this.emails.add(email);
    }

    public void printEmails() {
        for (String e:emails) {
            System.out.println(e);
        }
    }

    public boolean foundMatch(String input) {
        for (String e:emails) {
            if (e.equalsIgnoreCase(input)) {
                return true;
            }
        }
        return false;
    }
}
