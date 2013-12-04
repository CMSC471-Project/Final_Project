package travlingSalesman;

public class City {
	
	private boolean isVisited;
	private int xPosition;
	private int yPosition;
	
	public City(int xPosition, int yPosition, boolean isVisited){
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.isVisited = isVisited;
	}
	
	public boolean getIsVisited(){
		return isVisited;
	}
	
	public int getCityX(){
		return xPosition;
	}
	
	public int getCityY(){
		return yPosition;
	}
	
	public void setIsVisited(boolean visited){
		isVisited = visited;
	}
	
	public void setCityX(int newX){
		xPosition = newX;
	}
	
	public void setCityY(int newY){
		yPosition = newY;
	}
}
