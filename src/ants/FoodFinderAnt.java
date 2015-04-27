package ants;

public class FoodFinderAnt extends WorkerAnt {

	private final static String FOOD_COLOR = "Red";
	
	public FoodFinderAnt(){
		super();
	}

	public void searchForFood(){
		//Starting move forward amount
		int baselength = 500;
		int i = 1;
		int count = 0;
		while(getCurrentColor() != FOOD_COLOR){
			//Move forward
			moveForward(baselength * i);
			//Turn
			turnRight();
			count++;
			if(count % 2 == 0){					
				i *= 2;					
			}
		}
		
		//TODO What do we do once we have found food?? 
	}
	
	
}
