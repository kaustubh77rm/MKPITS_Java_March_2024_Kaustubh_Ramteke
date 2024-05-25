package stud;

public class ForEachLoop {
    public void displayFive(){
        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            System.out.print(number+" ");
        }
}
    public static void main(String[] args) {
        new ForEachLoop().displayFive();
    }
}