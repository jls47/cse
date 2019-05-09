import java.awt.*;

public class Giant extends Critter{
	private int count;
	private int scount;
	private String s;

	public Giant(){
		this.count = 0;
		this.scount = 1;
		this.s = "fum";
	}

    public Color getColor(){
    	return Color.GRAY;
    }

    public String toString(){
    	return this.s;
    }

    public Action getMove(CritterInfo info){
    	if(this.count % 6 == 0){
			if(this.s == "fee"){
				this.s = "fie";
			}else if(this.s == "fie"){
				this.s = "foe";
			}else if(this.s == "foe"){
				this.s = "fum";
			}else{
				this.s = "fee";
			}
		}
		this.count++;
    	if(info.getFront() == Neighbor.OTHER){
    		return Action.INFECT;
    	}else if(info.getFront() == Neighbor.WALL){
    		return Action.RIGHT;
    	}else{
    		return Action.HOP;
    	}
    }
}