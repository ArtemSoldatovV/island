import java.util.ArrayList;
import java.util.Random;

public class Herbivores extends animals_island { //Травоядное
    public int [][] additional_types_of_calories ;
    public Herbivores(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals , int[][] additional_types_of_calories){
        super(weight,maximum_density,speed_in_cells,calories,minimum_subsistence_calories,Number_of_animals);
        this.additional_types_of_calories = additional_types_of_calories;
    }
/////////////////////////////////////////////
    //кушать
    @Override
    public locations eat(locations map){
        Random r = new Random();
        ArrayList <Herbivores> List_Herbivores = map.get_List_Herbivores();

        while (get_calories()>get_maximum_density()) {
        if (map.get_plants()>0) {
            map.plants_min();
            enter_calories(get_calories()+map.get_Plants_weight());
        }
        else if (this.additional_types_of_calories.length > 0) {
            boolean y_n = true;
            int i =0;
            while (i<this.additional_types_of_calories.length && y_n == true){

                for(int i2=0; i2 < List_Herbivores.size();i2++){
                    if (List_Herbivores.get(i2).get_Number_of_animals() == this.additional_types_of_calories[i][0]){
                        if (r.nextInt(100) > this.additional_types_of_calories[i][1]){
                            this.enter_calories(this.get_calories()+List_Herbivores.get(i2).get_calories());
                            List_Herbivores.remove(i2);
                            map.enter_List_Herbivores(List_Herbivores);
                            y_n = false;
                        }
                    }
                }
                i++;

            }
        }
    }
        return map;
    }
    //движение
    @Override
    public locations[][] movement_animals(locations[][] map, int x, int y, int number){
        Random r = new Random();
        locations[][] map_exit = map;////////////
        Herbivores nn =map_exit[x][y].get_List_Herbivores().get(number);
        map_exit[x][y].get_List_Herbivores().remove(number);
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
        ArrayList <Herbivores> list = map_exit[x][y].get_List_Herbivores();
        list.add(nn);
        map_exit[x][y].enter_List_Herbivores(list);


        return map_exit;
    }
    @Override
    public locations die(locations map, int my_number){
        if (this.get_calories() >= this.get_maximum_density()){
            this.enter_calories(this.get_calories()-this.get_maximum_density());
        }
        else{
        
            ArrayList <Herbivores> myList = map.get_List_Herbivores();
            this.enter_alive(false);
            myList.remove(my_number);
            map.enter_List_Herbivores(myList);
        }
        return map;
    }
}