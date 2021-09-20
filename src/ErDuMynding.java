import java.util.Scanner;

public class ErDuMynding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int alder = scan.nextInt();

        if(alder > 17) {
            System.out.println("Du er myndig");
        } else {
            System.out.println("Du er ikke myndig");
        }

    }

}
