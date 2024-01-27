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
     mesajYaz();
     mesajYaz("Java'da fonksiyon kodluyorum");

     int a=5,b=10;
     int sonuc1=topla(a,b);

     double c=4.5,d=2.3;
     double sonuc2=topla(c, d);
    
     mesajYaz("sonuc1="+sonuc1);
     mesajYaz("sonuc2="+sonuc2);
    }
}
