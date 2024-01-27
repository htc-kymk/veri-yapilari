public class dortgen {
   private double genislik;
   private double yukseklik;
   
public dortgen(){
    this.genislik=0;
    this.yukseklik=0;
}
public dortgen(double w){
    this.genislik=w;
    this.yukseklik=w;
}
public dortgen(double w,double y){
    this.genislik=w;
    this.yukseklik=y;
}
public void boyutGoster(){
    System.out.println("G:"+this.genislik+"Y: "+yukseklik);
}
public double alan(){
    return this.genislik*this.yukseklik;
}



//get ve set fonksiyonları
public double getGenislik(){
    return this.genislik;
}
public double getYukseklik(){
    return this.yukseklik;
}
public double setGenislik(double x){
    return this.genislik=x;
}
public double setYukseklik(double y){
    return this.yukseklik=y;
}



}
