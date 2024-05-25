package stud;

public class MyThread implements Runnable{
    public void run(){
        while(true){
            System.out.println(Thread.currentThread().getName());
        }
    }
}