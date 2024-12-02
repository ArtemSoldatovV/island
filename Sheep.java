public class Sheep extends Herbivores {
    public Sheep(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[][] additional_types_of_calories){
        super(weight=70, maximum_density =140, maximum_density =3, calories=30, minimum_subsistence_calories=15,Number_of_animals=10,additional_types_of_calories );
        int[][] atoc = new int[][]{{}};
        this.additional_types_of_calories = atoc;
    }
    @Override
    public Herbivores reproduce(){return new Sheep(0,0,0,0,0,0,new int[][]{{}});}
}
