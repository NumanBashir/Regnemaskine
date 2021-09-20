import java.util.Scanner;

public class Regnemaskine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hvilken regneoperation vil du foretage?");
        String operation = scan.nextLine();
        operation = operation.toLowerCase();

        System.out.println("Vælg to tal");
        int tal1 = scan.nextInt();
        int tal2 = scan.nextInt();

        if(operation.equals("plus")) {
            System.out.println(tal1 + " + " + tal2 + " = " + (tal1+tal2));
        } else if(operation.equals("minus")) {
            System.out.println(tal1 + " - " + tal2 + " = " + (tal1-tal2));
        } else if(operation.equals("gange")) {
            System.out.println(tal1 + " · " + tal2 + " = " + (tal1*tal2));
        } else if(operation.equals("divider")) {
            System.out.println(tal1 + " / " + tal2 + " = " + (tal1/tal2));
        } else {
            System.out.println("Ugyldig operation");
        }

    }
}
