import java.awt.*;

public class Bear extends Critter {
	private int count;
	private boolean polar;
	private String s;

	public Bear(boolean polar){
		this.count = 0;
		this.polar = polar;
		this.s = "\\";
	}

	public Color getColor(){
		if(this.polar == true){
			return Color.WHITE;
		}else{
			return Color.BLACK;
		}
    }

    public String toString(){
    	return this.s;
    }

    public Action getMove(CritterInfo info){
   		if(this.s == "\\"){
   			this.s = "/";
   		}else{
   			this.s = "\\";
   		}
    	
    	if(info.getFront() == Neighbor.OTHER){
    		return Action.INFECT;
    	}else if(info.getFront() == Neighbor.WALL){
    		return Action.LEFT;
    	}else{
    		return Action.HOP;
    	}

    }
}