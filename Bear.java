public class Bear extends Predator{
    public Bear(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[] probability_of_killing_Herbivores){
        super(weight=500 ,maximum_density = 5,speed_in_cells = 2,calories=160,minimum_subsistence_calories=80,Number_of_animals=3, probability_of_killing_Herbivores );
        int[] pokh = {0, 80, 0, 0, 0, 40, 80, 80, 90, 70, 70, 50, 20, 10, 0};
        this.probability_of_killing_Herbivores = pokh;
    }
    
}
