public class Goat extends Herbivores{
    public Goat(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[][] additional_types_of_calories){
        super(weight=60, maximum_density =140, maximum_density =3, calories=20, minimum_subsistence_calories=10,Number_of_animals=9,additional_types_of_calories );
        int[][] atoc = new int[][]{{}};
        this.additional_types_of_calories = atoc;
    }

}
