package lib.measurable;

import java.util.ArrayList;
import java.util.List;


public class DataAnalysis<E extends Measurable> {

	private List<E> objects;

	public DataAnalysis() {
		objects = new ArrayList<>();
	}

	public void addMeasurable(E m) {
		objects.add(m);
	}

	public int sum() {
		return objects.stream().mapToInt(m -> m.getMeasure()).sum();
	}
	
	public double avg() {
		if(objects.isEmpty()) {
			return -1;
		} else {
		return objects.stream().mapToDouble(m -> m.getMeasure()/objects.size()).sum();
	}
	}
	
	public int min() {
		int minimum = 0;
		if(objects.isEmpty()) {
			return -1;
		} else {
		for(E e: objects) {
			minimum = Math.min(e.getMeasure(), e.getMeasure());
		}
		
		return minimum;
	}
	}
	
	public int max() {
		int maximum = 0;
		if(objects.isEmpty()) {
			return -1;
		} else {
		for(E e: objects) {
			maximum = Math.max(e.getMeasure(), e.getMeasure());
		}
		
		return maximum;
	}
	}
	
	@Override
	public String toString() {
		return "DataAnalysis[objects= " + objects + "]";
	}
}
