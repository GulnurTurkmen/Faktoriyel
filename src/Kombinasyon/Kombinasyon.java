package Kombinasyon;

import java.util.Scanner;
import java.math.BigInteger;

public class Kombinasyon {

    public static void main(String[] args) {
        int n, r;
        BigInteger nFaktoriyel, rFaktoriyel, nEksiRFaktoriyel, kombinasyon;

        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        n = scan.nextInt();
        System.out.print("r: ");
        r = scan.nextInt();

        nFaktoriyel = BigInteger.ONE;
        rFaktoriyel = BigInteger.ONE;
        nEksiRFaktoriyel = BigInteger.ONE;

        // n!, r! ve (n-r)!'yi hesapla
        for (int i = 1; i <= n; i++) {
            nFaktoriyel = nFaktoriyel.multiply(BigInteger.valueOf(i));
            if (i <= r) {
                rFaktoriyel = rFaktoriyel.multiply(BigInteger.valueOf(i));
            }
            if (i <= n - r) {
                nEksiRFaktoriyel = nEksiRFaktoriyel.multiply(BigInteger.valueOf(i));
            }
        }

        // Kombinasyonu hesapla
        kombinasyon = nFaktoriyel.divide(rFaktoriyel.multiply(nEksiRFaktoriyel));

        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
    }
}