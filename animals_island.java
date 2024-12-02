import java.util.ArrayList;
import java.util.Random;

abstract class animals_island {
    private double weight;//вес
    private int maximum_density;//максимальная плотность населения
    private int speed_in_cells;//скорость
    private double calories;//калории
    private double minimum_subsistence_calories;//минимальное количество калорий
    private int Number_of_animals;//номер жевотного
    private boolean alive = true;//жив или мёртв

    ////////

    public animals_island(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals){
        this.weight = weight;
        this.maximum_density = maximum_density;
        this.speed_in_cells = speed_in_cells;
        this.calories = calories;
        this.minimum_subsistence_calories = minimum_subsistence_calories;
        this.Number_of_animals = Number_of_animals;
    }

    public void enter_alive(boolean alive){this.alive =alive;}
    public boolean get_alive(){return this.alive;}
    public double get_weight(){return this.weight;}
    public int get_Number_of_animals(){return this.Number_of_animals;}
    public double get_calories(){return this.calories;}
    public void enter_calories(double calories){ this.calories = calories;}
    public int get_speed_in_cells(){return this.speed_in_cells;}
    public int get_maximum_density(){return this.maximum_density;}
/*
    //кушать
    public locations eat( locations map){
        return map;
    }
    

    //движение
    public locations[][] movement_animals(locations[][] map, int x, int y, int number){
        Random r = new Random();
        locations[][] map_exit = map;////////////
        /*animals_island nn =map_exit[x][y].get_myList().get(number);
        map_exit[x][y].get_myList().remove(number);
        for (int i=0; i < this.speed_in_cells;i++) {
            if ( x+1<=100 ) {
                if(x < 40 & map[x+1][y].get_mas(this.Number_of_animals) < this.maximum_density){
                x =+ 1;}

            } else if ( x-1>=0 ) {
                if(x > 70 & map[x -1][y].get_mas(this.Number_of_animals) < this.maximum_density){
                x =- 1;}
            }

            else if ( y+1<=100 ) {
                if(y < 8 & map[x][y+1].get_mas(this.Number_of_animals) < this.maximum_density){
                y =+ 1;}
            } else if ( y-1>=0 ) {
                if(y > 12 & map[x][y-1].get_mas(this.Number_of_animals) < this.maximum_density){
                y =- 1;}
            }
        }
        ArrayList <animals_island> list = map_exit[x][y].get_myList();
        list.add(nn);
        map_exit[x][y].enter_myList(list);

         
        return map_exit;*//* 
    }

    //размножение
    public locations reproduce(locations map, int my_number){*/
        /*
        Random r = new Random();
        boolean y_n = true;
        int i =0;
        //ArrayList <animals_island> myList = map.get_myList();
        while (i < myList.size() & y_n == true){
            i++;
            if (this.Number_of_animals == myList.get(i).get_Number_of_animals() & my_number != i ) {
                y_n = false;
                if(r.nextInt(100) > 50){

                    //myList.add(new animals_island( 3,2,3,4,5,6));
                    //map.enter_myList(myList);

                }
            }
        }

         *//*
        return map;
    }

    //смерть
    public locations die(locations map, int my_number){
        this.calories = this.calories -5;
        if (this.calories < this.minimum_subsistence_calories){
            this.alive=false;
        }
        return map;
    }*/

}