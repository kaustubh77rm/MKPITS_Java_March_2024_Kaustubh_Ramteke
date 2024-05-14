package assn_13;

public class DaemonThread{
    public static void main(String[] args){

        Thread thread1 = new Thread(new Task("Thread 1"));
        Thread thread2 = new Thread(new Task("Thread 2"));
        thread1.start();
        thread2.start();

        Thread daemonThread = new Thread(new DaemonTask("Daemon Thread"));
        daemonThread.setDaemon(true);
        daemonThread.start();
    }
}

class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " finished execution.");
    }
}

class DaemonTask implements Runnable{
    private String name;

    public DaemonTask(String name){
        this.name = name;
    }

    @Override
    public void run(){
        try{
            for (int i = 1; i <= 10; i++){
                System.out.println(name + ": " + i);
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(name + " finished execution.");
    }
}