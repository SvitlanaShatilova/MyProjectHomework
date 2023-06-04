package Homework2205.Printer;

public class PrinterGreen extends Printer{
    public static final String GREEN = "\033[0;32m";
    @Override
    void print(String value) {
        System.out.println(GREEN + value + RESET);
    }
}
