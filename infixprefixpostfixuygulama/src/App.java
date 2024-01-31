import java.util.Stack;

public class App {
    public static int oncelik (char c){
        switch(c){
            case '+':
            case '-': 
               return 1;
            case '*':
            case '/':
               return 2;
            case '^':
              return 3;
        }
        return -1;
    }

    public static String infix2Postfix(String infixIfade){
        Stack <Character> s=new Stack<>();
            String postIfade="";
        for(int i=0;i<infixIfade.length();i++){
            char c=infixIfade.charAt(i);

          if(oncelik(c)>0){   //operatör ise
               while(!s.isEmpty() && (oncelik(c)<= oncelik(s.peek()))) {
                postIfade=postIfade + s.pop();
               }
            s.push(c);
            //yığın
          }
          else{   //postfix ifadeye ekle
            postIfade=postIfade + c;
          }
        }
        int sBoyut=s.size();
        if(sBoyut >0){        //yığında kalanlar postfixe
            for(int i=0;i<sBoyut;i++){
               postIfade=postIfade + s.pop();
            }
        }
        return postIfade;
        
    }

     public static  int postfixHesapla(String postfixIfade){
        //bir string ifadeyi bir karaktere göre parçalayıp diziye dönüştüren kod
       String[] postfixDizi= postfixIfade.split(postfixIfade);
       
       Stack <String> y=new Stack<>();

       String e;
       int s1=0,s2=0,s3=0;
       for(int i=0;i<postfixDizi.length;i++){
        e=postfixDizi[i];
        e.trim();

        if(e.equals("+")){
            s2=Integer.parseInt(y.pop());
            s1=Integer.parseInt(y.pop());//stringten inte 
            s3=s1+s2;
            y.push(String.valueOf(s3));//intten stringe
        }
        else if(e.equals("-")){
            s2=Integer.parseInt(y.pop());
            s1=Integer.parseInt(y.pop());//stringten inte 
            s3=s1-s2;
            y.push(String.valueOf(s3));//intten stringe
        }
        else if(e.equals("*")){
            s2=Integer.parseInt(y.pop());
            s1=Integer.parseInt(y.pop());//stringten inte 
            s3=s1*s2;
            y.push(String.valueOf(s3));//intten stringe
        }
        else if(e.equals("/")){
            s2=Integer.parseInt(y.pop());
            s1=Integer.parseInt(y.pop());//stringten inte 
            s3=s1/s2;
            y.push(String.valueOf(s3));//intten stringe
        }
        else{
            y.push(e);
        }
    }
    int sonuc=Integer.parseInt(y.pop());
    if(!y.isEmpty()){
        System.out.println("Postfix ifade hatalı");
        return 0;
    }
    return sonuc;
}






    public static void main(String[] args) throws Exception {
        String infixIfade="a + b * c - d";
        
        System.out.println(infix2Postfix(infixIfade));
        
        String postfixIfade="2 3 5 * + 10 -";
        System.out.println(postfixIfade+"sonucu="+postfixHesapla(postfixIfade));

    }
}
