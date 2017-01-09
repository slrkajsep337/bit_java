package paint;
//import java.util.*;

public class Point {
	//Scanner scan = new Scanner(System.in);
	
	
	
	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void show() {
		System.out.println("점[x="+x+"y="+y+"]을 그렸습니다.");
	}
	
	
	
}
