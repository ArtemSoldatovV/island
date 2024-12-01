public class Wolf extends Predator{
    public Wolf(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[] probability_of_killing_Herbivores){
        super(weight=50 ,maximum_density = 30,speed_in_cells = 3,calories=16,minimum_subsistence_calories=8,Number_of_animals=0, probability_of_killing_Herbivores );
        int[] pokh = {0, 0, 0, 0, 0, 10 ,15 ,60 ,80 ,60, 70 ,15, 10, 40, 0};
        this.probability_of_killing_Herbivores = pokh;
    }
}
