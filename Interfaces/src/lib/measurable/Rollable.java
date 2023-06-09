package lib.measurable;

/** This interface imposes two common 'rollable' 
 * behaviours on the objects of each class that
 * implements it.
 * 
 * @author la/lz
 */
public interface Rollable {

	public void roll();
	
	public int getScore();
	
}


/*
rollable class -> roll()

multipleDice class -> roll()

die class inherits rollable and multipleDice -> roll() ??
*/