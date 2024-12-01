public class Wild_boar extends Herbivores{
    public Wild_boar(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[][] additional_types_of_calories){
        super(weight=40, maximum_density =50, maximum_density =2, calories=100, minimum_subsistence_calories=50,Number_of_animals=11,additional_types_of_calories );
        int[][] atoc = new int[][]{{8,50},{14,90}};
        this.additional_types_of_calories = atoc;
    }

}
