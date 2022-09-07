//Snake and Ladder game played with single player at start position 0
class Player {
	int current_position = 0;
	Player(){}
	int rollADie() {
		int dieOutCome = (int)(Math.floor(Math.random() *10)%6)+1;
		return dieOutCome;

	} 

	//The Player rolls the die to get a number between 1 to 6. - Use ((RANDOM)) to get the number

    public class SnakeLadder {
	
        public static void main( String[] args )
        {
            Player P1= new Player();
            int result = P1.rollADie();	

		System.out.println(P1.current_position);  
		System.out.println(result);
	   }
    }
}