public class Logs {
    private static String txt_logs="";
    public void get_log(String t){
        txt_logs+=t+"\n";
    }
    public void conclusion_logs(){
        System.out.println(txt_logs);
    }
    public void erase_logs(){
        txt_logs="";
    }
	public String conversion_logs(int number){
        if(number==0){
			return "Wolf";
		}
		else if(number==1){
			return "Boa constrictor";
		}
		else if(number==2){
			return "Fox";
		}
		else if(number==3){
			return "Bear";
		}
		else if(number==4){
			return "Eagle";
		}
		else if(number==5){
			return "Horse";
		}
		else if(number==6){
			return "Deer";
		}
		else if(number==7){
			return "Rabbit";
		}
		else if(number==8){
			return "Mouse";
		}
		else if(number==9){
			return "Goat";
		}
		else if(number==10){
			return "Sheep";
		}
		else if(number==11){
			return "Wild boar";
		}
		else if(number==12){
			return "Buffalo";
		}
		else if(number==13){
			return "Duck";
		}
		else if(number==14){
			return "Caterpillar";
		}
		else{return "error";}
    }
}