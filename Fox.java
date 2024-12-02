public class Fox extends Predator {
    public Fox(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[] probability_of_killing_Herbivores){
        super(weight=8 ,maximum_density = 30,speed_in_cells = 2,calories=4,minimum_subsistence_calories=2,Number_of_animals=2, probability_of_killing_Herbivores );
        int[] pokh = {0, 0, 0, 0, 0, 0, 0, 70, 90, 0, 0, 0, 0, 60, 40};
        this.probability_of_killing_Herbivores = pokh;
    }
    @Override
    public Predator reproduce(){return new Fox(0,0,0,0,0,0,new int[]{});}
}
