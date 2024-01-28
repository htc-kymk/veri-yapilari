import java.util.LinkedList;

public class App1 {
    public static void main(String[] args) throws Exception {
       /*CBList cbl=new CBList();
       
       cbl.listele();
       cbl.arayaEkle(10, 1);
       cbl.basaEkle(20);
       cbl.sonaEkle(30);
       cbl.listele();*/

       LinkedList <String>liste=new LinkedList<>();
       liste.add("Veri");
       liste.addFirst("Yapıları");
       liste.addLast("matematik");
      System.out.println(""+liste.size()); 
        
    
    }
}
