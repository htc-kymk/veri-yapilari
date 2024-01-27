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
        myList.listele();
        myList.eleman();
    }
}
