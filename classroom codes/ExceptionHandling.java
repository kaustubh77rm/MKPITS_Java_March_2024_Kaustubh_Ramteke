package stud;

public class ExceptionHandling{

    public void display(){
        int arr[] = null; // array is assigned a null value
        //try block madhe asa statement je exception throw karu shakte
        try{
            System.out.println("The length of the array arr is: " + arr.length);
            //null pointer exception
        }
        catch(Exception e){
            System.out.println("null pointer exception caught");
        }
    }
}
//ExceptionHandling e = new ExceptionHandling();
//    e.display();