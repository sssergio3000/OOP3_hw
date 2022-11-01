package printer;

public class PrinterRed extends Printer{
    void print(String value) {
        System.out.println(ANSI_RED + value);

    }
}
