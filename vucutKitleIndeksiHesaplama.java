import java.util.Scanner;

public class vucutKitleIndeksiHesaplama {
    public static void main(String[] args) {

        double kilo,boy,kitleIndeks;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = inp.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        kitleIndeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz :" + kitleIndeks);


    }
}



