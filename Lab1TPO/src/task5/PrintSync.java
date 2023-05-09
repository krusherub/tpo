package task5;

public class PrintSync extends Thread{
    private static Object lock = new Object();
    private String text;
    private int number;
    PrintSync(int number, String text){
        this.number = number;
        this.text = text;
    }

    public void  run(){
        for(int l = 0; l < 10; l++){
            for (int i = 0; i<10; i++){
                synchronized(lock){
                    System.out.print(text);


                    try {
                        lock.notifyAll();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if(number == 1)
                System.out.println();
        }
    }
}
