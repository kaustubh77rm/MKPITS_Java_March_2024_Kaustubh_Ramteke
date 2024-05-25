package stud;

public class StaticExample {
    static int add(int a,int b){
        return a+b;
    }
    void display(){
        int sum=StaticExample.add(1,2);
        System.out.println(sum);
    }
}