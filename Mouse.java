public class Mouse extends Herbivores {
    public Mouse(double weight, int maximum_density, int speed_in_cells, double calories, double minimum_subsistence_calories,int Number_of_animals, int[][] additional_types_of_calories){
        super(weight=0.05, maximum_density =500, maximum_density =1, calories=0.1, minimum_subsistence_calories=0.01,Number_of_animals=8,additional_types_of_calories );
        int[][] atoc = new int[][]{{14,90}};
        this.additional_types_of_calories = atoc;
    }

}
/*
weight=60, maximum_density =140, maximum_density =3, calories=20, minimum_subsistence_calories=10,Number_of_animals=9
weight=70, maximum_density =140, maximum_density =3, calories=30, minimum_subsistence_calories=15,Number_of_animals=10
weight=40, maximum_density =50, maximum_density =2, calories=100, minimum_subsistence_calories=50,Number_of_animals=11
weight=700, maximum_density =10, maximum_density =3, calories=200, minimum_subsistence_calories=100,Number_of_animals=12
weight=1, maximum_density =200, maximum_density =4, calories=0.3, minimum_subsistence_calories=0.15,Number_of_animals=13
weight=0.01, maximum_density =1000, maximum_density =0, calories=0, minimum_subsistence_calories=0,Number_of_animals=14
 */