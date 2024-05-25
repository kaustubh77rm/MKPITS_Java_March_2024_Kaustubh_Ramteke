package stud;

class FinalDemo
{
    public void myMethod(int num, String str){
        num = num+10;
        str = str+"XYZ";

        System.out.println(num+str);
    }
    public static void main(String args[]){
        FinalDemo obj= new FinalDemo();
        obj.myMethod(10, "BeginnersBook.com");
    }
}