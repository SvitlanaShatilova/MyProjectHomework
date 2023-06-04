package Homework2205.Printer;

public class PrinterRed extends Printer{
    public static final String RED = "\033[0;31m";
    @Override
    void print(String value) {
        super.print(RED + value + RESET);
    }
}
