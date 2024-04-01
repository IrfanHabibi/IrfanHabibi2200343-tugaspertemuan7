/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Irfan Habibi
 */
import java.util.Arrays;

// Kelas StopWatch
class StopWatch {
    private long startTime;
    private long endTime;

    // Konstruktor tanpa argumen
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    // Metode untuk memulai stopwatch
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Metode untuk menghentikan stopwatch
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Metode untuk mendapatkan waktu yang telah berlalu dalam milidetik
    public long getElapsedTime() {
        return endTime - startTime;
    }
}

// Program uji
public class Main {
    // Metode untuk mengurutkan array menggunakan selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Tukar elemen terkecil dengan elemen pertama
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Inisialisasi array dengan 100.000 angka acak
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }

        // Membuat objek stopwatch
        StopWatch stopwatch = new StopWatch();

        // Memulai stopwatch
        stopwatch.start();

        // Melakukan pengurutan menggunakan selection sort
        selectionSort(numbers);

        // Menghentikan stopwatch
        stopwatch.stop();

        // Mendapatkan waktu yang diperlukan untuk pengurutan dalam milidetik
        long elapsedTime = stopwatch.getElapsedTime();

        // Menampilkan waktu yang diperlukan
        System.out.println("Waktu eksekusi pengurutan 100.000 angka menggunakan selection sort: \n" + elapsedTime + " Milidetik");
    }
}
