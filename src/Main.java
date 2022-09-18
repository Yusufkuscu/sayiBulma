import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int sayi = scan.nextInt();
        int toplam = 0, sayac = -1, ortalama = 0;
        System.out.println("3'e ve 4'e tam bölünen sayılar : ");
        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i + "\n");
                toplam += i;
                sayac++;
            }
        }
        System.out.println("Toplam : " + toplam);
        System.out.println("0' dan " + sayi + "'e Kadar Olan 3 ve 4'e Tam Bölünen Sayıların Ortalaması : " + (toplam / sayac));
    }
}
