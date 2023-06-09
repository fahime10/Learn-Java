package simpleRobot;

public class ScreenRobot {
	
	//fields
	private int x;
	private int y;
	private int direction; //1-4 up,left,down,right
	
	
	//constructors
	public ScreenRobot() {
		this(0,0,4); //i.e. facing right
	}
	
	public ScreenRobot(int x, int y, int direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	
	//methods
	public void forward(int n) {
		if (direction == 1) {
			y = y + n;
		} else if (direction == 2) {
			x = x - n;
		} else if (direction == 3) {
			y = y - n;
		} else if (direction == 4) {
			x = x + n;
		}
	}
	
	public void turnLeft() {
		direction = (direction%4) + 1;
	}
	
	public void home() {
		x=0;
		y=0;
		direction=4;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String getDirection() {
		if (direction == 1) {
			return "UP";
		} else if (direction == 2) {
			return "LEFT";
		} else if (direction == 3) {
			return "DOWN";
		} else {
			return "RIGHT";
		}
	}
	
	public String getPosition() {
		return "[x:" + x + ", y:" + y + "] - Facing:" + this.getDirection();
	}
	
	public String toString() {
		return "ScreenRobot[x=" + x + ", y=" + y + ", direction=" + direction + "]";
	}
	
}
