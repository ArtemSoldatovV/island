import java.util.ArrayList;
import java.util.Random;

public class Predator extends animals_island{//Хищник
    public int[] probability_of_killing_Herbivores;
    private Logs log=new Logs();
    public Predator(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[] probability_of_killing_Herbivores){
        super(weight,maximum_density,speed_in_cells,calories,minimum_subsistence_calories,Number_of_animals);
        this.probability_of_killing_Herbivores = probability_of_killing_Herbivores;
    }

    public Predator reproduce(){return new Predator(0,0,0,0,0,0,new int[]{});}

    
    public locations reproduce(locations map, Predator n){
        Random r = new Random();
        boolean y_n = true;
        int i =0;
        ArrayList <Predator> rr = map.get_List_Predator();
        int my_number = rr.indexOf(n);
        //ArrayList <animals_island> myList = map.get_myList();
        while (i < map.get_List_Herbivores().size() & y_n == true){
            i++;
            if (get_Number_of_animals() == rr.get(i).get_Number_of_animals() & my_number != i) {
                y_n = false;
                if(r.nextInt(100) > 50){

                    log.get_log("животное " + log.conversion_logs(get_Number_of_animals()) + " размножилось");
                    map.enter_List_Predator(reproduce());

                }
            }
        }

        return map;
    }

    
    public locations eat(locations map){
        System.out.println("null");
        Random r = new Random();
        ArrayList <Herbivores> List_Herbivores = map.get_List_Herbivores();
        ArrayList <Predator> List_Predator = map.get_List_Predator();
        while (get_calories()>get_maximum_density()) 
        {
        if (List_Herbivores.size() > 0) {
            boolean y_n = true;
            int i =0;
            while( i<List_Herbivores.size() && y_n == true) {


                if (r.nextInt(100) > this.probability_of_killing_Herbivores[List_Herbivores.get(i).get_Number_of_animals()]) {
                    this.enter_calories(this.get_calories()+List_Herbivores.get(i).get_calories());
                    List_Herbivores.remove(i);
                    map.enter_List_Herbivores(List_Herbivores);
                    y_n = false;
                    log.get_log("животное "+log.conversion_logs(get_Number_of_animals())+" село животное" +log.conversion_logs(i));
                }

                i++;

            }
        }
        else if (List_Predator.size() > 0) {
            boolean y_n = true;
            int i =0;
            while( i<List_Predator.size() & y_n == true) {


                if (r.nextInt(100) > this.probability_of_killing_Herbivores[List_Predator.get(i).get_Number_of_animals()]) {
                    this.enter_calories(this.get_calories()+List_Predator.get(i).get_calories());
                    List_Predator.remove(i);
                    map.enter_List_Predator(List_Predator);
                    y_n = false;
                    log.get_log("животное "+log.conversion_logs(get_Number_of_animals())+" село животное" +log.conversion_logs(i));
                }

                i++;

            }
        }
    }
        return map;
    }

    //движение
    
    public locations[][] movement_animals(locations[][] map,Predator n, int x, int y, int number){
        locations[][] map_exit = map;
        Predator nn =n;
        map_exit[x][y].get_List_Predator().remove(n);
        for (int i=0; i < this.get_speed_in_cells();i++) {
            if ( x+1<=100 ) {
                if(x < 40 & map[x+1][y].get_number_number_animals(this.get_Number_of_animals()) < this.get_maximum_density()){
                    x =+ 1;}

            } else if ( x-1>=0 ) {
                if(x > 70 & map[x -1][y].get_number_number_animals(this.get_Number_of_animals()) < this.get_maximum_density()){
                    x =- 1;}
            }

            else if ( y+1<=100 ) {
                if(y < 8 & map[x][y+1].get_number_number_animals(this.get_Number_of_animals()) < this.get_maximum_density()){
                    y =+ 1;}
            } else if ( y-1>=0 ) {
                if(y > 12 & map[x][y-1].get_number_number_animals(this.get_Number_of_animals()) < this.get_maximum_density()){
                    y =- 1;}
            }
        }
        log.get_log("животное "+log.conversion_logs(get_Number_of_animals())+" перешло на клетку " +" x " + x +" y "+ y);
        ArrayList <Predator> list = map_exit[x][y].get_List_Predator();
        list.add(nn);
        map_exit[x][y].enter_List_Predator(list);


        return map_exit;
    }
    
    public locations die(locations map, Predator n){
        if (this.get_calories() >= this.get_maximum_density()){
            this.enter_calories(this.get_calories()-this.get_maximum_density());
        }
        else{
            ArrayList <Predator> myList = map.get_List_Predator();
            this.enter_alive(false);
            myList.remove(n);
            map.enter_List_Predator(myList);
            log.get_log("животное "+log.conversion_logs(get_Number_of_animals()) +" умерло от не достатка еды");
        }
        return map;
    }
}