package no.oslomet.cs.algdat;

import java.util.Arrays;

public class Oblig1 {

    private Oblig1() {}

    // Oppgave 0
    public static int gruppeMedlemmer() {
        return 1; // Skal returne hvor mange som er i gruppa deres.
    }

    // Oppgave 1
    public static int maks(int[] a) {
        throw new UnsupportedOperationException();
    }

    public static int ombyttinger(int[] a) {
        throw new UnsupportedOperationException();
    }

    // Oppgave 2
    public static int antallUlikeSortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    // Oppgave 3
    public static int antallUlikeUsortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    // Oppgave 4
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    // Oppgave 5
    public static void rotasjon(char[] a) {
        if (a.length > 0) {
            char last = a[a.length-1];
            for (int i = a.length-1; i > 0; i--) {
                a[i] = a[i-1];
            }
            a[0] = last;
        }
    }

     public static <T> void switchPlces(T[] array, int a, int b) {
         T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }



    // Oppgave 6
    public static void rotasjon(char[] a, int k) {throw new UnsupportedOperationException();}

    // Oppgave 7
    public static String flett(String s, String t) {
        int indexS = 0;
        int indexT = 0;
        int indexOutput = 0;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        char[] output = new char[sArray.length + tArray.length];

        while (indexS < sArray.length || indexT < tArray.length) {
            if (indexS < sArray.length) {
                output[indexOutput] = sArray[indexS];
                indexS++;
                indexOutput++;
            }
            if (indexT < tArray.length) {
                output[indexOutput++] = tArray[indexT++];
//                indexT++;
//                indexOutput++;
            }
        }
        return String.copyValueOf(output);
    }

    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    // Oppgave 8
    public static int[] indeksSortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 9
    public static int[] tredjeMin(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 10
    public static boolean inneholdt(String a, String b) {throw new UnsupportedOperationException();}
}