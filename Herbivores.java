import java.util.ArrayList;
import java.util.Random;

public class Herbivores extends animals_island { //Травоядное
    private Logs log=new Logs();
    public int [][] additional_types_of_calories ;
    public Herbivores(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals , int[][] additional_types_of_calories){
        super(weight,maximum_density,speed_in_cells,calories,minimum_subsistence_calories,Number_of_animals);
        this.additional_types_of_calories = additional_types_of_calories;
    }
/////////////////////////////////////////////
    //кушать
    public locations eat(locations map){
        Random r = new Random();
        ArrayList <Herbivores> List_Herbivores = map.get_List_Herbivores();
        boolean rr = true;
        while (rr) {
        if (map.get_plants()>0) {
            map.plants_min();
            enter_calories(get_calories()+map.get_Plants_weight());
            log.get_log("животное "+log.conversion_logs(get_Number_of_animals())+" скушоло травы");
        }
        else if (this.additional_types_of_calories.length > 1) {
            boolean y_n = true;
            int i =0;
            while (i<this.additional_types_of_calories.length & y_n == true){
                for(int i2=0; i2 < List_Herbivores.size();i2++){
                    if (List_Herbivores.get(i2).get_Number_of_animals() == additional_types_of_calories[i][0]){
                        if (r.nextInt(100) < this.additional_types_of_calories[i][1]){
                            this.enter_calories(this.get_calories()+List_Herbivores.get(i2).get_calories());
                            List_Herbivores.remove(i2);
                            map.enter_List_Herbivores(List_Herbivores);
                            log.get_log("животное "+log.conversion_logs(get_Number_of_animals())+" село животное" +log.conversion_logs(this.additional_types_of_calories[i][0]));
                            y_n = false;
                        }
                    }
                }
                i++;

            }
        }
        rr=false;
    }
        return map;
    }
    //движение
    public locations[][] movement_animals(locations[][] map,Herbivores n, int x, int y, int number){
        locations[][] map_exit = map;
        Herbivores nn = n;
        map_exit[x][y].get_List_Herbivores().remove(n);
        for (int i=0; i < this.get_speed_in_cells();i++) {
            if ( x+1<100 ) {
                if(x < 40 & map[x+1][y].get_number_number_animals(this.get_Number_of_animals()) < this.get_maximum_density()){
                x =+ 1;}

            } else if ( x-1>=0 ) {
                if(x > 70 & map[x -1][y].get_number_number_animals(this.get_Number_of_animals()) < this.get_maximum_density()){
                x =- 1;}
            }

            else if ( y+1<100 ) {
                if(y < 8 & map[x][y+1].get_number_number_animals(this.get_Number_of_animals()) < this.get_maximum_density()){
                y =+ 1;}
            } else if ( y-1>=0 ) {
                if(y > 12 & map[x][y-1].get_number_number_animals(this.get_Number_of_animals()) < this.get_maximum_density()){
                y =- 1;}
            }
        }
        log.get_log("животное "+log.conversion_logs(get_Number_of_animals())+" перешло на клетку " +" x " + x +" y "+ y);
        ArrayList <Herbivores> list = map_exit[x][y].get_List_Herbivores();
        list.add(nn);
        map_exit[x][y].enter_List_Herbivores(list);


        return map_exit;
    }

    //размножение

    public Herbivores reproduce(){return new Herbivores(0,0,0,0,0,0,new int[][]{{}});}

    
    public locations reproduce(locations map, Herbivores n){
        Random r = new Random();
        boolean y_n = true;
        int i =0;
        ArrayList <Herbivores> rr = map.get_List_Herbivores();
        int my_number = rr.indexOf(n);
        while (i < rr.size() & y_n == true){
            
            if (get_Number_of_animals() == rr.get(i).get_Number_of_animals() & my_number != i ) {
                y_n = false;
                if(r.nextInt(100) > 50){

                    log.get_log("животное " + log.conversion_logs(get_Number_of_animals()) + " размножилось");
                    map.enter_List_Herbivores(reproduce());

                }
            }
            i++;
        }
        return map;
    }


    
    public locations die(locations map, Herbivores n){
        if (this.get_calories() >= this.get_maximum_density()){
            this.enter_calories(this.get_calories()-this.get_maximum_density());
        }
        else{
            log.get_log("животное "+log.conversion_logs(get_Number_of_animals() )+" умерло от не достатка еды");
            ArrayList <Herbivores> myList = map.get_List_Herbivores();
            this.enter_alive(false);
            myList.remove(n);
            map.enter_List_Herbivores(myList);
        }
        return map;
    }
}