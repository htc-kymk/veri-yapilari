public class App {
    public static void main(String[] args) throws Exception {
        yigin y=new yigin();
        y.push(20);
        y.push(30);
        y.push(40);

        System.out.println("yığının en üstü:"+y.peek());
        System.out.println("yığından çekilen"+y.pop());
        System.out.println("yığının en üstü:"+y.peek());

        y.push(50);
        System.out.println("yığının en üstü:"+y.peek());
        System.out.println("yığından çekilen"+y.pop());
        System.out.println("yığının en üstü:"+y.peek());
    }
}
