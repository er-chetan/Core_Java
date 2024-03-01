package Multithreading;

public class Firstproces extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Start of first process"+" "+Thread.currentThread().getName());
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("First process"+i);
        }
        System.out.println("end of first process"+" "+Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        System.out.println("start of thread"+" "+Thread.currentThread().getName());
        Firstproces fone=  new Firstproces();
        Secondprocess sone =new Secondprocess();
        fone.start();
        sone.start();
        try {
            fone.join();
            sone.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end of thread"+" "+Thread.currentThread().getName());
    }
}
class Secondprocess extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Start of second process"+" "+Thread.currentThread().getName());
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("second process"+i);
        }
        System.out.println("end of second process"+" "+Thread.currentThread().getName());
    }
}

