import java.util.Scanner;

public class kdvhesap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Fiyat:");
        float fiyat = input.nextFloat();

        float fiyatx = fiyat * 18;
        float kdv = fiyatx / 100;

        System.out.println("KDV Tutarı:" + kdv);
        System.out.println("KDV Fiyatı:" + (fiyat + kdv));
    }
}
