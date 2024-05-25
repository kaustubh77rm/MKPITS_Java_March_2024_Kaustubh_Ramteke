public class ThreadSum extends Thread{
    int sum=0;
    public void run(){
        synchronized(this){
            for(int i=0; i<51; i++){
                sum=sum+i;
            }
            notify();
        }
    }
}
public void main(){
        ThreadSum t = new ThreadSum();
        t.start();
        synchronized(t){
            try{
                t.wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    System.out.println("sum: "+t.sum);
}