public class Rabbit extends Herbivores {
    public Rabbit(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[][] additional_types_of_calories){
        super(weight=2, maximum_density =150, maximum_density =2, calories=0.9, minimum_subsistence_calories=0.45,Number_of_animals=7,additional_types_of_calories );
        int[][] atoc = new int[][]{{}};
        this.additional_types_of_calories = atoc;
    }
    @Override
    public Herbivores reproduce(){return new Rabbit(0,0,0,0,0,0,new int[][]{{}});}
}