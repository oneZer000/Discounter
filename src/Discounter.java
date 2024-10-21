import java.util.Scanner;

public class Discounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Исходная цена: ");
        double origPrice = in.nextDouble();
        System.out.print("Скидка (%): ");
        double discount = in.nextDouble();
        double newPrice = origPrice * (1 - discount/100);
        System.out.printf("Исходная цена = %f\n", origPrice);
        System.out.printf("Скидка = %f\n", discount);
        System.out.printf("Новая цена = %f\n", newPrice);
    }
}
