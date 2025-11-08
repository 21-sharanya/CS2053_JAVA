class Printer {
    synchronized void printDocument(String user, String document) {
        System.out.println(user + " started printing: " + document);
        try {
            Thread.sleep(1000); // simulate printing time
        } catch (InterruptedException e) {
            System.out.println("Printing interrupted.");
        }
        System.out.println(user + " finished printing: " + document);
    }
}

class User implements Runnable {
    private String userName;
    private String document;
    private Printer printer;

    public User(String userName, String document, Printer printer) {
        this.userName = userName;
        this.document = document;
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printDocument(userName, document);
    }
}

public class labsession7 {
    public static void main(String[] args) {
        Printer sharedPrinter = new Printer();

        Thread user1 = new Thread(new User("User1", "Report.pdf", sharedPrinter));
        Thread user2 = new Thread(new User("User2", "Invoice.docx", sharedPrinter));
        Thread user3 = new Thread(new User("User3", "Assignment.txt", sharedPrinter));

        user1.start();
        user2.start();
        user3.start();
    }
}
