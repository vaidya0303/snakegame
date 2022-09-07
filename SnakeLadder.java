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
	//Play the game with 2 Player
}
public class SnakeLadder {
	public static void main( String[] args )
	{
		Player P1= new Player();
		Player P2 = new Player();
		int total = 0;
		while(P1.current_position != 100 && P2.current_position !=100) {
			int result_p1 = P1.rollADie();
			int result_p2 = P2.rollADie();
			int check_p1 = P1.checkOption();
			int check_p2 = P2.checkOption();
			total++;
			switch (check_p1) {
			case 0:
				break;
			case 1:
				int status = P1.current_position + result_p1;
				if(status <=100)
					P1.current_position = status;
					
				break;
			case 2:
				int status1 = P1.current_position - result_p1;
				P1.current_position = status1;
				if(P1.current_position<0)
					P1.current_position=0; 
				break;				
			}
			switch (check_p2) {
			case 0:
				break;
			case 1:
				int status = P2.current_position + result_p2;
				if(status <=100)
					P2.current_position = status;
					
				break;
			case 2:
				int status1 = P2.current_position - result_p2;
				P2.current_position = status1;
				if(P2.current_position<0)
					P2.current_position=0; 
				break;				
			}
			
			System.out.println("Player1 current position is  "+P1.current_position);
			System.out.println("Player2 current position is  "+P2.current_position);
		}
		System.out.println("Number of times the dice was played to win  "+ total);
		if(P1.current_position >= 100)
			System.out.println("Player1 won the game");
		else
			System.out.println("Player2 won the game");
		
	}
}