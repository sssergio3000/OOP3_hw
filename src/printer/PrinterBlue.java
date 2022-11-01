package printer;

public class PrinterBlue extends Printer{
    void print(String value) {
        System.out.println(ANSI_BLUE + value);

    }
}
