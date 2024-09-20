package no.oslomet.cs.algdat;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class Oblig1 {

    private Oblig1() {}

    // Oppgave 0
    public static int gruppeMedlemmer() {
        return 1; // Skal returne hvor mange som er i gruppa deres.
    }

    // Oppgave 1
    // Finds the largest value in an array by looking two and two places in array,
    // and switching them if first one is larger. Largest ends up last in the array.

    /*
     Theory question answers in Norwegian, also in Readme:

    a) Det vil gjøres n-1 sammenligninger da man sammenligner to og to verdier.
    Den nte gang ville ha sammenlignet den siste med out of bounds.

    b) Det blir færrest ombyttninger når tabellen allerede er stigene, eller sortert. Altså når når alle verdier er større
    enn den som er forran Altså eks. [1, 2, 3, 4, 4, 5, 6]

    c) Det blir flest ombyttninger når den største verdien er først. Altå at ombyttningen må skje hver eneste sammenligning.

    d) Gjenomsnitt antall ombytt vil være n-Hn (n-ln(n)+0,577). Noe som er dårligere enn tidligere metoder vi har vært
    borte i. Det er fordi Hn er omtrent like mange ganger tallet er større en det tallet etter seg, som er også tilfellene
    Da den koden ikke bytter om.
     */
    public static int maks(int[] a) {
        if (a.length < 1) throw new NoSuchElementException("Array is empty");

        for (int i = 0; i < a.length-1; i++) {
           if (a[i] > a[i+1]) switchPlaces(a, i, i+1);
        }
        return a[a.length-1];
    }

    // Switches place of two values in an int array
    public static void switchPlaces(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    // Same as maks method, but returns number of switches instead.
    public static int ombyttinger(int[] a) {
        if (a.length < 1) throw new NoSuchElementException("Array is empty");

        int numOfSwitches = 0;
        for (int i = 0; i < a.length-1; i++) {
           if (a[i] > a[i+1]) {
               switchPlaces(a, i, i+1);
               numOfSwitches++;
           }
        }
        return numOfSwitches;
    }

    // Oppgave 2
    // Checks if array is sorted, throws error if it isnt. If it is, returns amount of different values.
    public static int antallUlikeSortert(int[] a) {
        if (a.length < 1) return 0;

        int differentNum = 1;

        for (int i = 0; i < a.length-1; i++) {
            if (a[i] > a[i+1]){
                throw new IllegalStateException("Array isn't sorted");
            } else if (a[i] < a[i+1]) {
                differentNum++;
            }
        }
        return differentNum;
    }

    // Oppgave 3
    // Finds number of unique numbers without any non-variable data structure and without changing original array.
    // This code with have complexity O(n^2), because one extra number means it has to go through most whole array
    // one more time. The break saves a little bit.
    // Best case where all numbers are the same, it would be O(n)
    // Would be faster to sort or use an additional datastructures.
    public static int antallUlikeUsortert(int[] a) {
        if (a.length < 1) return a.length;

        int differentNum = a.length;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    differentNum--;
                    break;          // Little bit faster, not much in the grand scheme of things
                }
            }
        }
        return differentNum;
    }

    // Oppgave 4
    // First do a partisjonering to put even and odd numbers on its own sides of the array. Then quicksorts the two parts.
    public static void delsortering(int[] a) {
        int left = 0;
        int right = a.length-1;

        while (left < right) {
            if (a[left] % 2 == 0 && a[right] % 2 != 0) {
                switchPlaces(a, left++, right--);
            }
            while(left <= right && a[left] % 2 != 0) left++;
            while (left <= right && a[right] % 2 == 0) right--;
        }

        quickSort(a, 0, right);
        quickSort(a, left, a.length-1);
    }

    // Quicksort where pivot is choosen at random
    public static void quickSort(int[] array, int inLeft, int inRight) {
        if (inRight - inLeft < 1) return;

        Random random = new Random();
        int pivot = random.nextInt( inRight-inLeft + 1) + inLeft;
        switchPlaces(array, inRight, pivot);

        int left = inLeft;
        int right = inRight-1;

        while (true) {
            while ( left <= right && array[left] < array[inRight]) left++;
            while ( left <= right && array[right] >= array[inRight]) right--;
            if (right <= left) break;
            switchPlaces(array, left++, right++);
        }
        switchPlaces(array, left, inRight);

        quickSort(array, inLeft, left-1);
        quickSort(array, left+1, inRight);
    }

    // Oppgave 5
    // Moves all characters of array to the right, and puts the rightmost element first. "Rotating" the array by one.
    public static void rotasjon(char[] a) {
        if (a.length == 0) return;

        char last = a[a.length-1];
        for (int i = a.length-1; i > 0; i--) {
            a[i] = a[i-1];
        }
        a[0] = last;
    }

     public static <T> void switchPlaces(T[] array, int a, int b) {
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    // Oppgave 6
    // Flips whole array, then flips two parts depending on what k is.
    public static void rotasjon(char[] a, int k) {
        if (a.length <= 1) return;
        k = k % a.length;
        if (k < 0) k = k + a.length;
        flip(a);

        flip(a, 0, k-1);
        flip(a, k, a.length-1 );
    }

//    Flips part of array based on index values given
    public static void flip(char[] array, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            switchPlaces(array, i++, j--);
        }
    }

//    Flips with whole array
    public static void flip(char[] array) {
        flip(array, 0, array.length-1);
    }

//    Switches place of two values in a char array
    public static void switchPlaces(char[] array, int a, int b) {
        char temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

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
    // Can do the same thing as task 7a can
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