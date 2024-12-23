import java.util.ArrayList ;
import java.util.concurrent.TimeUnit;

public class Map {
    public static locations[][] mas;

    public static locations[][] get_mas(){return mas;}
    public Map(int width, int longitude){
        mas =new locations[width][longitude];
        for (int i=0;i<100;i++){
            for (int i2=0;i2<20;i2++){
                mas[i][i2] = new locations();
            }
        }
    }


    public void new_animals(int x,int y){
        if(x >mas.length){x=mas.length;}else if(x<0){x=0;}
        if(y >mas[0].length){y=mas[0].length;}else if(y<0){y=0;}
        //mas[x][y]=new
    }

    public void bypassing_sthe_map(){
        for (int i=0; i < 5;i++){

            for (int i2=0; i2 <5;i2++){

                if(mas[i][i2].get_List_Herbivores().size()!=0){
                    ArrayList <Herbivores> n = mas[i][i2].get_List_Herbivores();
                    for (int i3 =0;i<99;i++){//
                        mas[i][i2] = n.get(i3).eat(mas[i][i2]) ; 
                        mas[i][i2] = n.get(i3).reproduce(mas[i][i2],n.get(i3));
                        mas[i][i2] = n.get(i3).die(mas[i][i2],n.get(i3));
                        mas = n.get(i3).movement_animals(mas,n.get(i3),i,i2,i3);
                    }
                }
                if(mas[i][i2].get_List_Predator().size()!=0){
                    ArrayList <Predator> n = mas[i][i2].get_List_Predator();
                    for (int i3 =0;i<99;i++){
                        mas[i][i2] = n.get(i3).eat(mas[i][i2]) ; 
                        mas[i][i2] = n.get(i3).reproduce(mas[i][i2],n.get(i3));
                        mas[i][i2] = n.get(i3).die(mas[i][i2],n.get(i3));
                        mas = n.get(i3).movement_animals(mas,n.get(i3),i,i2,i3);
                    }
                }
            }
            
        }

    }
    public void draw_a_map(int left, int right,   int top, int bottom) {
        try {
            for (int layer = 0; layer < 16; layer=4+layer) {
                for (int i = left; i < right; i++) {

                    String top_row = "";
                    String bottom_row = "";
                    for (int i2 = top; i2 < bottom; i2++) {
                        top_row    =    top_row + "\t" + mas[i][i2].get_number_number_animals(layer) + " " + mas[i][i2].get_number_number_animals(layer+1);
                        bottom_row = bottom_row + "\t" + mas[i][i2].get_number_number_animals(layer+2) + " " + mas[i][i2].get_number_number_animals(layer+3);
                    }
                    System.out.println(top_row);
                    System.out.print(bottom_row);
                    System.out.println("\n");
                }
                TimeUnit.SECONDS.sleep(3);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void Plants_height(){
        for (int i=0; i < mas.length;i++){

            for (int i2=0; i2 < mas[0].length;i2++){
                mas[i][i2].plants_list_height();
            }
        }
    }

    public void Animals_in_the_beginning(){
        enter_who_is_it(1,1,"Wolf");
        enter_who_is_it(1,1,"Wolf");
        enter_who_is_it(1,1,"Boa_constrictor");
        enter_who_is_it(1,1,"Boa_constrictor");
        enter_who_is_it(1,1,"Fox");
        enter_who_is_it(1,1,"Fox");
        enter_who_is_it(1,1,"Bear");
        enter_who_is_it(1,1,"Bear");
        enter_who_is_it(1,1,"Eagle");
        enter_who_is_it(1,1,"Eagle");

        enter_who_is_it(1,1,"Horse");
        enter_who_is_it(1,1,"Horse");
        enter_who_is_it(1,1,"Deer");
        enter_who_is_it(1,1,"Deer");
        enter_who_is_it(1,1,"Rabbit");
        enter_who_is_it(1,1,"Rabbit");
        enter_who_is_it(1,1,"Mouse");
        enter_who_is_it(1,1,"Mouse");
        enter_who_is_it(1,1,"Goat");
        enter_who_is_it(1,1,"Goat");
        enter_who_is_it(1,1,"Sheep");
        enter_who_is_it(1,1,"Sheep");
        enter_who_is_it(1,1,"Wild_boar");
        enter_who_is_it(1,1,"Wild_boar");
        enter_who_is_it(1,1,"The_buffalo");
        enter_who_is_it(1,1,"The_buffalo");
        enter_who_is_it(1,1,"Duck");
        enter_who_is_it(1,1,"Duck");
        enter_who_is_it(1,1,"Caterpillar");
        enter_who_is_it(1,1,"Caterpillar");

    }

    public void enter_who_is_it(int x, int y, String name){
        if(x>100){x = 100;}
        else if(x<0){x=0;}
        if(y>20){x = 20;}
        else if(y<0){y=0;}
        if(name.equals("Wolf")){
            mas[x][y].enter_List_Predator( new Wolf(0, 0, 0, 0, 0, 0, null) );
        }
        else if(name.equals("Boa_constrictor")){
            mas[x][y].enter_List_Predator( new Boa_constrictor(0, 0, 0, 0, 0, 0, null) );
        }
        else if(name.equals("Fox")){
            mas[x][y].enter_List_Predator( new Fox(0, 0, 0, 0, 0, 0, null) );
        }
        else if(name.equals("Bear")){
            mas[x][y].enter_List_Predator( new Bear(0, 0, 0, 0, 0, 0, null) );
        }
        else if(name.equals("Eagle")){
            mas[x][y].enter_List_Predator( new Eagle(0, 0, 0, 0, 0, 0, null) );
        }
        else if(name.equals("Horse")){
            mas[x][y].enter_List_Herbivores( new Horse(0, 0, 0, 0, 0, 0, null) );
        }
        else if(name.equals("Deer")){
            mas[x][y].enter_List_Herbivores( new Deer(0, 0, 0, 0, 0, 0, null) );
        }
        else if(name.equals("Rabbit")){
            mas[x][y].enter_List_Herbivores( new Rabbit(0, 0, 0, 0, 0, 0, null) );
        }
        else if(name.equals("Mouse")){
            mas[x][y].enter_List_Herbivores( new Mouse(0, 0, 0, 0, 0, 0, null) );
        }
        else if(name.equals("Goat")){
            mas[x][y].enter_List_Herbivores( new Goat(0, 0, 0, 0, 0, 0, null) );
        }
        else if(name.equals("Sheep")){
            mas[x][y].enter_List_Herbivores( new Sheep(0, 0, 0, 0, 0, 0, null) );
        }
        else if(name.equals("Wild_boar")){
            mas[x][y].enter_List_Herbivores( new Wild_boar(0, 0, 0, 0, 0, 0, null) );
        }
        else if(name.equals("The_buffalo")){
            mas[x][y].enter_List_Herbivores( new The_buffalo(0, 0, 0, 0, 0, 0, null) );
        }
        else if(name.equals("Duck")){
            mas[x][y].enter_List_Herbivores( new Duck(0, 0, 0, 0, 0, 0, null) );
        }
        else if(name.equals("Caterpillar")){
            mas[x][y].enter_List_Herbivores( new Caterpillar(0, 0, 0, 0, 0, 0, null) );
        }
    }

}
