package EmailValidator;

public class EmailList {
    String[] emails;
    int nextIndex = 0;
    int arraySize = 0;

    public EmailList(int size) {
        this.arraySize = size;
        this.emails = new String[size];
    }

    public void addEmail(String email) {
        this.emails[this.nextIndex] = email;
        this.nextIndex++;
        if (this.nextIndex >= this.arraySize) {
            this.nextIndex = 0;
        }
    }

    public void printEmails() {
        for (int i = 0; i < this.emails.length; i++) {
            System.out.println(this.emails[i]);
        }
    }
}
