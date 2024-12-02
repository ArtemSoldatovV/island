public class Caterpillar extends Herbivores{
    public Caterpillar(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[][] additional_types_of_calories){
        super(weight=0.01, maximum_density =1000, maximum_density =0, calories=0, minimum_subsistence_calories=0,Number_of_animals=14,additional_types_of_calories );
        int[][] atoc = new int[][]{{}};
        this.additional_types_of_calories = atoc;
    }
    @Override
    public Herbivores reproduce(){return new Caterpillar(0,0,0,0,0,0,new int[][]{{}});}
}