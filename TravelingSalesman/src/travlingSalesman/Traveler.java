package travlingSalesman;

public class Traveler {
	
	private int xPosition;
	private int yPosition;
	
	public Traveler(){
		xPosition = 0;
		yPosition = 0;
	}
	
	public int getXPositition(){
		return xPosition;
	}
	
	public int getYPosition(){
		return yPosition;
	}
	
	public void setXPosition(int newX){
		xPosition = newX;
	}
	
	public void setYPosition(int newY){
		yPosition = newY;
	}
	
}
