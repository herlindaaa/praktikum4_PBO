import java.util.Scanner;

public class RumusABC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilih;
        do {
            System.out.print("Masukkan nilai a: ");
            double a = input.nextDouble();
            System.out.print("Masukkan nilai b: ");
            double b = input.nextDouble();
            System.out.print("Masukkan nilai c: ");
            double c = input.nextDouble();
            double D = b * b - 4 * a * c;
            if(D > 0) {
                double X1 = (-b + Math.sqrt(D)) / (2 * a);
                double X2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("X1= "+X1);
                System.out.println("X2= "+X2);
            } else if(D == 0) {
                double X1 = -b / (2 * a);
                System.out.println("X1= "+X1);
                System.out.println("X2= "+X1);
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-D) / (2 * a);
                System.out.println("X1= "+realPart+" + "+imaginaryPart+"i");
                System.out.println("X2= "+realPart+" - "+imaginaryPart+"i");
            }
            System.out.print("Input data lagi [Y/T]? ");
            pilih = input.next().charAt(0);
        } while(pilih == 'Y' || pilih == 'y');

        input.close();
    }
}
