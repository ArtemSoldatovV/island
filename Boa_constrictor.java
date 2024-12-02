public class Boa_constrictor extends Predator {
    public Boa_constrictor(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[] probability_of_killing_Herbivores){
        super(weight=15 ,maximum_density = 30,speed_in_cells = 1,calories=6,minimum_subsistence_calories=3,Number_of_animals=1, probability_of_killing_Herbivores );
        int[] pokh = {0, 0, 15, 0, 0, 0, 0, 20, 40, 0, 0, 0, 0, 10, 0};
        this.probability_of_killing_Herbivores = pokh;
    }
    @Override
    public Predator reproduce(){return new Boa_constrictor(0,0,0,0,0,0,new int[]{});}
}
