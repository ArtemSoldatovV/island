
import java.util.concurrent.Exchanger;

public class Multi_threading {
    Exchanger<Boolean> exchanger_boo = new Exchanger<>();
    Boolean program_works = true;
    Boolean pause = false;
    Exchanger<Map> exchanger_map = new Exchanger<>();
    Map map = new Map();


    class Plant_growth implements Runnable{//растения
        @Override
        public void run() {
            while(true){
                try{
                    Map map_e = map;
                    map_e.Plants_height();
                    map_e = exchanger_map.exchange(map_e);
                }
            catch (InterruptedException e) {}
            }
        }
    }


    class withdrawal_of_islands implements Runnable{//вывод
        @Override
        public void run() {
            Map map_e = map;
            while(true){
                    
                    map_e.bypassing_sthe_map();
                    map_e.draw_a_map(0,10,0,10);
                
            }
        }
    }

    void start() {
        new Thread(new Plant_growth()).start();
        new Thread(new withdrawal_of_islands()).start();
      }
}
