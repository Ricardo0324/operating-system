package myos;



import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException, InterruptedException {
       A a=new B();
       System.out.println(A.aFun(3));

    }
    protected  void test(){

    }
}

class A{
    protected  String name="hello";
    public A(){
        Demo demo=new Demo();
        demo.test();
    }
    public static int aFun(int n){
        return n*n;
    }
}
class B extends A implements Runnable{
    private String name;
    public B(){
        super();

    }
   public static int aFun(int n){
        int m=A.aFun(n);
        return m+n;
   }
    @Override
    public void run() {
        try {
        for (int i=0;i<1000;i++){
            System.out.println(i);
                Thread.sleep(2000);
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
