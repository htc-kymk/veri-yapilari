public class App {
    public static void mesajYaz(){
        System.out.println("merhaba");
    }
    public static void mesajYaz(String msg){
        System.out.println( msg);
    }

    public static int topla (int x,int y){
        return(x+y);
    }
    
    public static double topla(double x,double y){
        return(x+y);
    }



    public static void main(String[] args) throws Exception {
     
    dortgen d1=new dortgen();
    d1.boyutGoster();
    System.out.println("alan:"+d1.alan()); 


    dortgen d2=new dortgen(5);
    d2.boyutGoster();

    dortgen d3=new dortgen(5,10);
    d3.boyutGoster();

    d2.setYukseklik(15);
    d3.getGenislik();
    d3.setGenislik(20);

    










      /*  ogrenci o1;   //tanımlama
       o1=new ogrenci(1234,"hatice","kaymak",20);  //bellekte yer ayırdık
       
    
    System.out.println(o1.ogrSoyad);
      
      
      
      
        o1.ogrNo=1234;      
       o1.ogrAd="Hatice";
       o1.ogrSoyad="Kaymak";
       o1.yas=20;*/
 
     
     
     
     
     
     
     
        /*mesajYaz();
     mesajYaz("Java'da fonksiyon kodluyorum");

     int a=5,b=10;
     int sonuc1=topla(a,b);

     double c=4.5,d=2.3;
     double sonuc2=topla(c, d);
    
     mesajYaz("sonuc1="+sonuc1);
     mesajYaz("sonuc2="+sonuc2);*/
    }
}
