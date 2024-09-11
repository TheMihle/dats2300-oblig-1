package no.oslomet.cs.algdat;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

// Du kan bruke denne klassen til å lage egne tester om du ønsker.
public class Oblig1UnitTest {

    // Task 1d test: Test average number of switches done in
    @Test
    void oppgave1PermTest() {
        int n = 10000;

        // Calculate average n-operations of multiple runs-
        double sum = 0;
        int numberOfLoops = 200;

        for (int i = 0; i < numberOfLoops; i++) {
            sum += ((double) n - Oblig1.ombyttinger(randPerm(n)));
        }

        // Calculate harmonic number
        double sum2 = 0;
        for (int i = 1; i < n; i++) {
            sum2 += (double)1/i;
        }

        System.out.println("Average calculated number of steps is n-" + (sum/numberOfLoops) + "\nHarmonic number: " + sum2);

    }


    // Copied from Oblif1Test.java Helping functions
    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] randPerm(int n) {
        Random r = new Random();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = i+1;
        for (int k = n-1; k > 0; --k) {
            int i = r.nextInt(k+1);
            bytt(a, i, k);
        }
        return a;
    }

}
