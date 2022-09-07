//Snake and Ladder game played with single player at start position 0
class Player{
	int current_position = 0;
	Player(){}
	
	int rollADie() {
		int dieOutCome = (int)(Math.floor(Math.random() *10)%6)+1;
		return dieOutCome;
	} 
	int checkOption() { 
		int check =  (int)(Math.floor(Math.random() *10)%3);
		return check;
	}
	
	//The Player rolls the die to get a number between 1 to 6. - Use ((RANDOM)) to get the number
	// checks for a Option that players are No Play,Ladder or snake
	//Repeat till the Player reaches the winning position 100. 
	//Ensure the player gets to exact winning position 100. 
}
public class SnakeLadder {
	public static void main( String[] args )
	{
		Player P1= new Player();
		int total = 0;
		while(P1.current_position != 100) {
			int result = P1.rollADie();	
			int check = P1.checkOption();
			total++;
			switch (check) {
			case 0:
				break;
			case 1:
				int status = P1.current_position + result;
					P1.current_position = status;
				break;
			case 2:
				int status1 = P1.current_position - result;
				P1.current_position = status1;
				if(P1.current_position<0)
					P1.current_position=0;
				break;				
			}
			System.out.println("Dice outcome  "+ result);
		
			System.out.println("Player current position is  "+P1.current_position);
			
		
		}
		System.out.println("Number of times the dice was played to win  "+ total);
		
	 }
}