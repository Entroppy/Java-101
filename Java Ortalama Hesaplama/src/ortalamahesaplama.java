import java.util.Scanner;

public class ortalamahesaplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.println("Fizik Notunuz");
        fizik = input.nextInt();

        System.out.println("Matematik Notunuz");
        mat = input.nextInt();

        System.out.println("Kimya Notunuz");
        kimya = input.nextInt();

        System.out.println("Türkçe Notunuz");
        turkce = input.nextInt();

        System.out.println("Tarih Notunuz");
        tarih = input.nextInt();

        System.out.println("Müzik Notunuz");
        muzik = input.nextInt();

        int toplam = mat + fizik + kimya + turkce + muzik + tarih;
        int ortalama = toplam / 6;

        if (ortalama >= 60){
            System.out.println("Ortalaman " + ortalama + " Geçtin Knk");
            System.out.println("Ortalaman " + ortalama + " Geçtin Knk");
        }

        else {
            System.out.println("Ortalaman " + ortalama + " Kaldın knk");
        }
    }
}
