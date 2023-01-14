import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int sayi,adet,max=0,min=0;
        System.out.print("Lütfen kaç adet sayı gireceğinizi yazınız: ");
        adet=input.nextInt();

        for(int i=1;i<=adet; i++)
        {
            System.out.print(i+" .Sayıyı Giriniz: ");
            sayi=input.nextInt();
            if(sayi>max)
            {
                max=sayi;
            }
            if(sayi<min)
            {
                min=sayi;
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Girilen sayıların en büyüğü: "+max);
        System.out.println("Girilen sayıların en küçüğü: "+min);
    }
}