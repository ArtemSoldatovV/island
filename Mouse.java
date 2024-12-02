public class Mouse extends Herbivores {
    public Mouse(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[][] additional_types_of_calories){
        super(weight=0.05, maximum_density =500, maximum_density =1, calories=0.1, minimum_subsistence_calories=0.01,Number_of_animals=8,additional_types_of_calories );
        int[][] atoc = new int[][]{{14,90}};
        this.additional_types_of_calories = atoc;
    }
    @Override
    public Herbivores reproduce(){return new Mouse(0,0,0,0,0,0,new int[][]{{}});}
}