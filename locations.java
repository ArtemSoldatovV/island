import java.util.ArrayList;

public class locations {
    public ArrayList <Plants> List_Plants = new ArrayList<Plants>(200);
    public ArrayList <Herbivores> List_Herbivores = new ArrayList<Herbivores>(2230);
    public ArrayList <Predator> List_Predator = new ArrayList<Predator>(115);
    //животных 15 видов enter_List_Predator
    public locations (){
        for(int i=0;i<200;i++){
            List_Plants.add(new Plants());
        }
    }

    public int[] number_animals = new int[16];

    public int get_plants(){
        return this.List_Plants.size();
    }
    public void plants_min(){ this.List_Plants.remove(0) ;}
    public void plants_list_height(){
        for(int i=0;i<200 - this.List_Plants.size();i++){
            List_Plants.add(new Plants());
        }
    }

    public double get_Plants_weight(){return List_Plants.get(0).get_weight();}
    public int get_number_number_animals (int rr){return number_animals[rr];}

    public ArrayList <Herbivores> get_List_Herbivores(){return this.List_Herbivores;}
    public void enter_List_Herbivores(ArrayList <Herbivores> myList){this.List_Herbivores = myList;}

    public ArrayList <Predator> get_List_Predator(){return this.List_Predator;}
    public void enter_List_Predator(ArrayList <Predator> myList){this.List_Predator = myList;}
    
    public void enter_List_Herbivores(Herbivores myList){this.List_Herbivores.add( myList);
        number_animals[myList.get_Number_of_animals()]+=1;}
    public void enter_List_Predator(Predator myList){this.List_Predator.add(myList);
        number_animals[myList.get_Number_of_animals()]+=1;}
}