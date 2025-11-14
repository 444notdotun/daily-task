
public class MorningTask{
public String determine( int number){
	String output ="";
	if (number > 0 && number <=3){
		output = "Q1";
	}
	else if(number > 3&& number <=6){
		output = "Q2";
	}
	else if(number > 6&& number <=9){
		output = "Q3";
	}else if(number > 9&&number <=12){
		output = "Q4";
	} 
	return output;
}

}