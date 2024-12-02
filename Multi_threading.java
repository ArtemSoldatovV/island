
import java.util.concurrent.Exchanger;
import java.util.concurrent.Semaphore;

class Multi_threading implements Runnable {
    private static Map map;
    private int num;
    private Logs log = new Logs();

    private static Semaphore check_map = new Semaphore(2);

    Multi_threading(int width, int longitude , int num){
        map = new Map(100,20);
        this.num =num;
        map.Animals_in_the_beginning();
    }
    @Override
    public void run() {
        while(true){
            if (this.num == 0) {
                try {
                    check_map.acquire();
                    map.Plants_height();
                    

                    check_map.release();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);}
                    check_map.release();
            } else if (this.num == 1) {
                try {
                    check_map.acquire();
                    map.bypassing_sthe_map();
                    check_map.release();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);}
            } else if (this.num == 2) {
                try {
                        check_map.acquire();
                        map.draw_a_map(0, 10, 0, 10);
                        log.conclusion_logs();//вывод логов
                        log.erase_logs();//стерание логов
                        check_map.release();
                    } catch (InterruptedException e) {
                    throw new RuntimeException(e);}
            }
        }
    }
    


}
