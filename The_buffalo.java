public class The_buffalo extends Herbivores{
    public The_buffalo(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[][] additional_types_of_calories){
        super(weight=700, maximum_density =10, maximum_density =3, calories=200, minimum_subsistence_calories=100,Number_of_animals=12,additional_types_of_calories );
        int[][] atoc = new int[][]{{}};
        this.additional_types_of_calories = atoc;
    }
    @Override
    public Herbivores reproduce(){return new The_buffalo(0,0,0,0,0,0,new int[][]{{}});}
}