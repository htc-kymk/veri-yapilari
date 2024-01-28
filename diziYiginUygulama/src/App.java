public class App {
    public static void main(String[] args) throws Exception {
     yigin mySt=new yigin(5);

      if(mySt.isEmpty()){
        System.out.println("yığın boş");
      }
      mySt.push(10);
      mySt.push(20);
      mySt.push(30);

      System.out.println(mySt.peek());
     

    }
}
