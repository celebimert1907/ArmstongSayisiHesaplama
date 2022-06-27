package ArmstrongSayisi;

import java.util.Scanner;

public class Hesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int num = input.nextInt();
        int tempNum =num;
        int numberofplaces = 0;
        int digitValue;
        int total = 0;
        int numPow = 1;

        System.out.println("Kalan Sayi: " + num);
        while (tempNum !=0) {
            tempNum = tempNum / 10;
            System.out.println("Kalan sayi: " + tempNum);
            numberofplaces++;
        }
        System.out.println("Basamak sayisi: " + numberofplaces);

        tempNum=num;
        while (tempNum!=0){
            digitValue = tempNum % 10;
            System.out.println("Son hane: " + digitValue);
            numPow = 1;
            for (int i = 1; i<= numberofplaces; i++){
                numPow *= digitValue;
            }
            total += numPow;
            tempNum /= 10;
        }
        System.out.println("Toplam: " + total);

        if (total==num){
            System.out.println( total + ": Armstrong sayidir.");
        } else {
            System.out.println( total + ": Armstrong sayi degildir.");
        }
    }
}