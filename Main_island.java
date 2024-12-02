public class Main_island {
    static boolean program_works = true;
    static boolean pause = true;
    public static void main(String[] args) {

        int width =100;
        int longitude =20;
        Multi_threading m = new Multi_threading(width,longitude,0);
        Thread t = new Thread(m);
        Multi_threading m1 = new Multi_threading(width,longitude,1);
        Thread t1 = new Thread(m1);
        Multi_threading m2 = new Multi_threading(width,longitude,2);
        Thread t2 = new Thread(m2);
            
        
        t.start();
        t1.start();
        t2.start();
    }
}

