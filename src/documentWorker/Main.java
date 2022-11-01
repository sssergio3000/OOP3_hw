package documentWorker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lkPro = 99999;
        int lkExpert = 77777;
        int lkInput;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your licence key: ");
        lkInput = scan.nextInt();
        switch (lkInput) {
            case 99999 : {
                DocumentWorker version = new ProDocumentWorker();
                System.out.println("You've got a Pro version now");
                break;
            }
            case 77777 : {
                DocumentWorker version = new ExpertDocumentWorker();
                System.out.println("You've got an Expert version now");
                break;
            }
            default: {
                DocumentWorker version = new DocumentWorker();
                System.out.println("You've got free version now");

            }
        }
    }


}
