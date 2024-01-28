public class App {
    public static void main(String[] args) throws Exception {
       
      /* Dugum d1=new Dugum();
        d1.yazdir();
        Dugum d2=new Dugum(2);
        d2.yazdir();*/ 
        
        TBListe myList=new TBListe();
        myList.listele();

        myList.basaEkle(10);
        myList.basaEkle(20);
        myList.basaEkle(30);
        
        myList.sonaEkle(40);

        Dugum d=new Dugum(50);
        myList.basaEkle(d);
        Dugum dd=new Dugum(60);
        myList.sonaEkle(dd);

        myList.listele();
       System.out.println("eleman sayısı: "+ myList.eleman());
       System.out.println(" "+myList.elemanKacTane(10));
    }
}
