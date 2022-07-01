import java.util.Scanner;

public class Vucut_Kutle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz");
        double boy= input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz");
        int kilo = input.nextInt();
        System.out.println("Hadi vücut kitle endeksini hesaplayalım");
        double vucut_kitle = kilo /  Math.pow(boy,2);
        System.out.println("Vücut kitle indexiniz :"+ vucut_kitle);














    }
}
