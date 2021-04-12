package thread.Multi;

public class ThreadEX2 implements Runnable{

    int TestNum = 0;

    @Override
    public void run() {
        for(int i = 0 ; i < 10 ; i++){
            if(Thread.currentThread().getName().equals("B")){
                System.out.println("===========================");
                TestNum++;
            }
            System.out.println("ThreadName = " + Thread.currentThread().getName());

            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println(TestNum);
    }
}
