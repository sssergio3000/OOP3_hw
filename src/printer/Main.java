package printer;

import static printer.Printer.*;

public class Main {
    public static void main(String[] args) {

        Printer printerBlue = new PrinterBlue();
        printerBlue.print("Hello");

        Printer printerRed = new PrinterRed();
        printerRed.print("Hello");

        Printer printerGreen = new PrinterGreen();
        printerGreen.print("Hello");
    }

}
