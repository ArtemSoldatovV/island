public class Duck extends Herbivores{
    public Duck(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[][] additional_types_of_calories){
        super(weight=1, maximum_density =200, maximum_density =4, calories=0.3, minimum_subsistence_calories=0.15,Number_of_animals=13,additional_types_of_calories );
        int[][] atoc = new int[][]{{14,90}};
        this.additional_types_of_calories = atoc;
    }
    @Override
    public Herbivores reproduce(){return new Duck(0,0,0,0,0,0,new int[][]{{}});}
}
