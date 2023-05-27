import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       int km,yas,tur,ntutar,itutar,yindirim,gdindirim;

       System.out.println("Mesafeyi km türünden giriniz:");
       Scanner inputt=new Scanner(System.in);
       km=inputt.nextInt();
       System.out.println("Yaşınızı giriniz:");
       yas=inputt.nextInt();
       System.out.println("Yolculuk tipinizi giriniz(1->Gidiş dönüş,0->Tek yön)");
       tur=inputt.nextInt();
       if(km>0) {
           ntutar = km * 10 / 100;
           if (yas < 12 && tur ==1) {
               yindirim = km * 50 / 100;
               itutar = ntutar - yindirim;
               gdindirim = itutar * 20 / 100;
               itutar = (itutar - gdindirim) * 2;
               System.out.print("Toplam tutar:" + itutar);
           } else if (yas < 12 && tur == 0) {
               yindirim = ntutar* 50 / 100;
               itutar = ntutar - yindirim;
               System.out.print("Toplam tutar:" + itutar);
           } else if (yas >= 12 && yas < 24 && tur == 1) {
               yindirim = ntutar* 10 / 100;
               itutar = ntutar - yindirim;
               gdindirim = itutar * 20 / 100;
               itutar = (itutar - gdindirim) * 2;
               System.out.print("Toplam tutar:" + itutar);

           } else if (yas >= 12 && yas < 24 && tur == 0) {
               yindirim = ntutar * 10 / 100;
               itutar = ntutar - yindirim;
               System.out.print("Toplam tutar:" + itutar);
           } else if (yas > 65 && tur == 1) {
               yindirim = ntutar * 30 / 100;
               itutar = ntutar - yindirim;
               gdindirim = itutar * 20 / 100;
               itutar = (itutar - gdindirim) * 2;
               System.out.print("Toplam tutar:" + itutar);

           } else if (yas > 65 && tur ==0) {
               yindirim = ntutar * 10 / 100;
               itutar = ntutar - yindirim;
               System.out.print("Toplam tutar:" + itutar);
           }
           else{
               if(tur==1){
                 ntutar=ntutar*2;
                 System.out.print("Toplam tutar:"+ntutar);
               }
               else{
                   System.out.print("Toplam tutar:"+ntutar);
               }

           }


       }else{
           System.out.print("Hatalı veri girdiniz!");
       }

    }
}