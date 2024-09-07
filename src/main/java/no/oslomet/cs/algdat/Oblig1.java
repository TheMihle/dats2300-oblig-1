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
    // Checks if array is sorted, throws error if it isnt. If it is, returns amount of different values.
    public static int antallUlikeSortert(int[] a) {
        if (a.length < 1) return 0;

        int antallUlike = 1;

        for (int i = 0; i < a.length-1; i++) {
            if (a[i] > a[i+1]){
                throw new IllegalStateException();
            } else if (a[i] < a[i+1]) {
                antallUlike++;
            }
        }
        return antallUlike;
    }

    // Oppgave 3
    // Fails one of the tree tests
    public static int antallUlikeUsortert(int[] a) {
        if (a.length < 1) return a.length;

        int differentNum = a.length;

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] == a[j]) differentNum--;
            }
        }
        return differentNum;
    }

    // Oppgave 4
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    // Oppgave 5
    // Moves all characters of array to the right, and puts the rightmost element first. "Rotating" the array by one.
    public static void rotasjon(char[] a) {
        if (a.length <= 0) return;

        char last = a[a.length-1];
        for (int i = a.length-1; i > 0; i--) {
            a[i] = a[i-1];
        }
        a[0] = last;
    }

     public static <T> void switchPlces(T[] array, int a, int b) {
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }



    // Oppgave 6
    public static void rotasjon(char[] a, int k) {throw new UnsupportedOperationException();}

    // Oppgave 7
    // Intertwines two strings in to one.
    // Don't really need this one any more after the one that takes variable arguments also can take just two arguments.
    public static String flett(String s, String t) {
        int indexS = 0;
        int indexT = 0;
        int indexOutput = 0;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        char[] output = new char[sArray.length + tArray.length];

        while (indexS < sArray.length || indexT < tArray.length) {
            if (indexS < sArray.length) {
                output[indexOutput++] = sArray[indexS++];
            }
            if (indexT < tArray.length) {
                output[indexOutput++] = tArray[indexT++];
            }
        }
        return String.copyValueOf(output);
    }

    // Intertwines any number of strings in to one.
    public static String flett(String... s) {
        int i = 0;
        boolean letterAdded = true;
        StringBuilder output = new StringBuilder();

        while (letterAdded) {
            letterAdded = false;
            for (String string : s) {
                if (i < string.length()) {
                    output.append(string.charAt(i));
                    letterAdded = true;
                }
            }
            i++;
        }
        return output.toString();
    }

    // Oppgave 8
    public static int[] indeksSortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 9
    public static int[] tredjeMin(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 10
    public static boolean inneholdt(String a, String b) {throw new UnsupportedOperationException();}
}