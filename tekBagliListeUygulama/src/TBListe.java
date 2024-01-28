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

    //listede bir değer arar ve bulduğunda o düğümü geri döndürür
    public Dugum elemanBul(int deger){
        Dugum temp=this.ilk;
        Dugum bulunan=null;
        while(temp!=null){
            if(temp.getVeri()!=deger){
                temp=temp.getSonraki();
            }
            else{
               bulunan = temp;
               break;
            }
    
        }
      return bulunan;
    }
  
   //aranan değerden listede ka. tane olduğunu döndüren fonksiyon

   public int elemanKacTane(int deger){
    Dugum temp=this.ilk;
    int sayac=0;
    while (temp!=null){
         
        if(temp.getVeri()!=deger){
            temp=temp.getSonraki();
        }
        else{
            sayac++;
            temp=temp.getSonraki();
        }
       
    }
    return sayac;
   }
   
   //değeri,listede herhangi bir indekse ekleyen fonksiyon
public void arayaEkle(int deger,int indis){
    if((this.ilk==null)|| (indis==1)){
        this.basaEkle(deger);
        return;
    }
    Dugum yeni=new Dugum(deger);
    Dugum temp=this.ilk;
    int sayac=1;

    while(temp.getSonraki()!=null){
        if(sayac+1==indis){
            break;
        }
        sayac++;
        temp=temp.getSonraki();
    }
    yeni.setSonraki(temp.getSonraki());
    temp.setSonraki(yeni);
}
  //araya ekle fonksioyonunun sona ekleme kontrolü
   
 



}
