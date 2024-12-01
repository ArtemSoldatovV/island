import java.util.ArrayList;
import java.util.Random;

public class Predator extends animals_island{//Хищник
    public int[] probability_of_killing_Herbivores;
    public Predator(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[] probability_of_killing_Herbivores){
        super(weight,maximum_density,speed_in_cells,calories,minimum_subsistence_calories,Number_of_animals);
        this.probability_of_killing_Herbivores = probability_of_killing_Herbivores;
    }

    @Override
    public locations eat(locations map){
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
        locations[][] map_exit = map;
        Predator nn =map_exit[x][y].get_List_Predator().get(number);
        map_exit[x][y].get_List_Predator().remove(number);
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
        ArrayList <Predator> list = map_exit[x][y].get_List_Predator();
        list.add(nn);
        map_exit[x][y].enter_List_Predator(list);


        return map_exit;
    }
    @Override
    public locations die(locations map, int my_number){
        if (this.get_calories() >= this.get_maximum_density()){
            this.enter_calories(this.get_calories()-this.get_maximum_density());
        }
        else{
        
            ArrayList <Predator> myList = map.get_List_Predator();
            this.enter_alive(false);
            myList.remove(my_number);
            map.enter_List_Predator(myList);
        }
        return map;
    }
}
