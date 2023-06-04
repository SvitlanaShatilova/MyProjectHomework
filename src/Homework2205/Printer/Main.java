package Homework2205.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Друк Printer");
        Printer printerGreen = new PrinterGreen();
        printerGreen.print("Друк PrinterGreen");
        Printer printerRed = new PrinterRed();
        printerRed.print("Друк PrinterRed");
        printerGreen = printer;
        printerGreen.print("UPcasting PrinterGreen to Printer");
        printerGreen = (PrinterRed) printerRed;
        printerGreen.print("DOWNcasting PrinterGreen to PrinterRed");
        PrinterGreen printerGreen1 = new PrinterGreen();
        printer = (PrinterGreen) printerGreen1;
        printer.print("DOWNcasting Printer to PrinterGreen");


    }
}
