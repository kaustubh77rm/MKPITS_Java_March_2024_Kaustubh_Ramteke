package stud;

public class CauseandSolve {
    public void causeSolve1(){
        String s = "kpr";
        try{System.out.println(s.charAt(4));} //StringIndexOutOfBoundsException;
        catch(Exception e){
            System.out.println(""+e.getMessage());
        }
    }
    public void causeSolve2(){
        try{Integer.parseInt("null");} //NumberFormatException;
        catch(Exception e2){
            System.out.println(""+e2.getMessage());
        }
    }
}
/*
 new CauseandSolve().causeSolve1();
 new CauseandSolve().causeSolve2();
*/