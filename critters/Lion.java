import java.awt.*;
import java.lang.Math;

public class Lion extends Critter{

	private int count;
	private Color color;

	public Lion(){
		this.count = 0;
		this.color = Color.BLUE;
	}

	public Color getColor(){
		return this.color;
    }

    public String toString(){
    	return "L";
    }

    public Action getMove(CritterInfo info){
    	if(this.count % 3 == 0){
			int randInt = (int)(Math.random() * 3) + 1;
			if(randInt == 1){
				this.color = Color.RED;
			}else if(randInt == 2){
				this.color = Color.GREEN;
			}else{
				this.color = Color.BLUE;
			}
		}
		this.count++;
    	if(info.getFront() == Neighbor.OTHER){
    		return Action.INFECT;
    	}else if(info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL){
    		return Action.LEFT;
    	}else if(info.getFront() == Neighbor.SAME){
    		return Action.RIGHT;
    	}else{
    		return Action.HOP;
    	}
    }
}