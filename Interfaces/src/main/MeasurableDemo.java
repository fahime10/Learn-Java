package main;

import lib.measurable.Song;
import lib.measurable.Die;
import lib.measurable.Measurable;
import lib.measurable.Name;

import java.util.ArrayList;

import lib.measurable.DataAnalysis;

public class MeasurableDemo {

	public static void main(String[] args) {
		
		Name m = new Name("Joe", "Bloggs");
		Name n = new Name("John", "Doe");
		Name o = new Name("Will", "Smith");
		
		System.out.println(m.getMeasure());
		
		DataAnalysis<Name> list = new DataAnalysis<>();;
		list.addMeasurable(m);
		list.addMeasurable(n);
		list.addMeasurable(o);
		
		System.out.println(list);
		System.out.println("Sum of every character in the list: " + list.sum());
		
		System.out.println(list.min());
		
		DataAnalysis<Measurable> songs = new DataAnalysis<>();
		
		Song a = new Song("Radio Gaga", 281, "Queen");
		Song b = new Song("Radio Gaga", 281, "Queen");
		Song c = new Song("Flash", 190, "Ibid.");
		
		songs.addMeasurable(a);
		songs.addMeasurable(b);
		songs.addMeasurable(c);
		int total = songs.sum();
		System.out.println("\nSum of songs: " + total);
		}


	}

