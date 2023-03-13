package lib.adverts;

public class TvCommercial extends Advert {

	private int noOfSec;
	private int ratePerSec;
	private boolean peakTime;
	
	public TvCommercial() {
		noOfSec = 20;
		ratePerSec = 1;
		peakTime = true;
	}
	
	@Override
	public int cost() {
		if(peakTime == true) 
			return super.getFee() + noOfSec*ratePerSec*2;
		 else 
			return super.getFee() + noOfSec*ratePerSec;
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "[noOfSec=" + noOfSec + ", [ratePerSec=" +
					ratePerSec + ", peakTime=" + peakTime + "]";
	}
}
