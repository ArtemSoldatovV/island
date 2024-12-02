public class Deer extends Herbivores {
    public Deer(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[][] additional_types_of_calories){
        super(weight=300, maximum_density =20, maximum_density =4, calories=100, minimum_subsistence_calories=50,Number_of_animals=6,additional_types_of_calories );
        int[][] atoc = new int[][]{{}};
        this.additional_types_of_calories = atoc;
    }
    @Override
    public Herbivores reproduce(){return new Deer(0,0,0,0,0,0,new int[][]{{}});}
}