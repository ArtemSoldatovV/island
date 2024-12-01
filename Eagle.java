public class Eagle extends Predator {
    public Eagle(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[] probability_of_killing_Herbivores){
        super(weight=6 ,maximum_density = 20,speed_in_cells = 3,calories=2,minimum_subsistence_calories=1,Number_of_animals=4, probability_of_killing_Herbivores );
        int[] pokh = {0, 0, 10, 0, 0, 0, 0, 90, 90, 0, 0, 0, 0, 80, 0};
        this.probability_of_killing_Herbivores = pokh;
    }
}
