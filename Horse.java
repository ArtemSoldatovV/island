public class Horse extends Herbivores {
    public Horse(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[][] additional_types_of_calories){
        super(weight=400, maximum_density =20, maximum_density =4, calories=120, minimum_subsistence_calories=60,Number_of_animals=5,additional_types_of_calories );
        int[][] atoc = new int[][]{{}};
        this.additional_types_of_calories = atoc;
    }
    @Override
    public Herbivores reproduce(){return new Horse(0,0,0,0,0,0,new int[][]{{}});}
}
