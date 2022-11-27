import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand=new Random();
        int number=rand.nextInt(100);

        Scanner input =new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong=new int[5];
        boolean isWin=false;
        System.out.println(number);
        while(right<5){
            System.out.println("Lütfen tahmininizi giriniz: ");
            selected=input.nextInt();

            if (selected<0||selected>99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                continue;
            }

            if (selected==number){
                System.out.println("Tebrikler,doğru tahmin! Tahmin ettiğiniz sayı :"+number);
                isWin=true;
                break;
            }
            else {

                System.out.println("Hatalı bir sayı girdiniz!");
                if (selected > number){
                    System.out.println(selected+"sayısı,gizli sayıdan büyüktür.");
                }
                else{
                    System.out.println(selected+"sayısı,gizli sayıdan küçüktür.");
                }
                wrong[right]=selected;
                right++;
                System.out.println("Kalan hakkınız : "+(5-right));
            }

        }
        if (!isWin){
            System.out.println("Kaybettiniz !");
            System.out.println("Tahminleriniz: "+ Arrays.toString(wrong));


        }
    }

}