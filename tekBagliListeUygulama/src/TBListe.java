public class TBListe { 
    private Dugum ilk;


    public TBListe(){
        this.ilk=null;
    }
    
     //listenin başına eleman ekleme
       public void basaEkle(int deger){
          Dugum yeni=new Dugum(deger);
        yeni.setSonraki(this.ilk);
          this.ilk=yeni;
       }

       public void basaEkle(Dugum yeni){
          yeni.setSonraki(this.ilk);
          this.ilk=yeni;
       }



    //listenin sonuna eleman ekleme
   public void sonaEkle(int deger){
    Dugum yeni=new Dugum(deger);
    if(this.ilk==null){
        this.ilk=yeni;
        return;
    }
    Dugum temp=this.ilk;
    while(temp.getSonraki()!=null){
        temp=temp.getSonraki();
    
    }
     temp.setSonraki(yeni);
     
   }
public void sonaEkle(Dugum yeni){
    if(this.ilk==null){
        this.ilk=yeni;
        return;
    }
    Dugum temp=this.ilk;
    while(temp.getSonraki()!=null){
        temp=temp.getSonraki();
    }
    temp.setSonraki(yeni);
}


    //eleman sayısını bulma
public int eleman(){

    int sayac=0;
    if(this.ilk==null){
        System.out.println("Lİste Boş");
    }
     
   Dugum temp=this.ilk;
   while(temp!=null){
    sayac++;
    temp=temp.getSonraki();
   }
   return sayac;
   
}





   //listedeki tüm elemanların değerlerini ekrana yazma
public void listele(){
    Dugum temp=this.ilk;
    if(temp==null){
        System.out.println("Liste boş");
        return;
    }
    while(temp!=null){
        temp.yazdir();
        temp=temp.getSonraki();
    }
    System.out.println("----------------");

}
}
