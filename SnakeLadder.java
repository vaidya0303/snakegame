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
}
public class SnakeLadder {
	public static void main( String[] args )
	{
		Player P1= new Player();
		int result = P1.rollADie();	
		int check = P1.checkOption();
		System.out.println(check);
		switch (check) {
		case 0:
			System.out.println("No play Player stay in the same position");
			break;
		case 1:
			System.out.println("The player moves ahead by the number of position received in the die");
			break;
		case 2:
			System.out.println("This is Snake: The player moves behind by the number of position received in die");
			break;
		}
		System.out.println(P1.current_position);  
		System.out.println(result);
	}
}