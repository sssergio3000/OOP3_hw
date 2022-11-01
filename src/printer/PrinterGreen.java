package printer;

public class PrinterGreen extends Printer {
    void print(String value) {
        System.out.println(ANSI_GREEN + value);

    }
}
