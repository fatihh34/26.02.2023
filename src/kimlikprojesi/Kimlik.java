package kimlikprojesi;

import java.util.Scanner;

public class Kimlik {

    public static void main(String[] args) {

        saveInfo();



    }
    private static void saveInfo(){
        Scanner input =new Scanner(System.in);
        System.out.println("kimlik nosunu giriniz");
        String kimlikNo =input.nextLine();

        System.out.println("lutfen isminizi giriniz");
        String isim =input.next();




    }
}
