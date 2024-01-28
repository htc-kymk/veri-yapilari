public class Dugum {
    private int veri;
    private Dugum once;
    private Dugum sonraki;
 
    public Dugum(){
     this.veri=0;
     this.once=null;
     this.sonraki=null;
    }
    public Dugum(int deger){
     this.veri=deger;
     this.once=null;
     this.sonraki=null;
    }
 
    public void yazdir(){
     System.out.println(" "+this.veri);
    }
    public void setVeri(int deger){
     this.veri=deger;
    }
    public void setOnce(Dugum onceki){
     this.once=onceki;
    }
    public void setSonraki(Dugum sonraki){
     this.sonraki=sonraki;
    }
    public int getVeri(){
     return veri;
    }
    public Dugum getOnce(){
     return once;
    }
    public Dugum getSonraki(){
     return sonraki;
    }
 
 }
