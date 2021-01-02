package self_study;

import javax.swing.*;
public class RecordingSong {

	public static void main(String[] args) {
		
		Recording[] recordings = new Recording[2];
		int x, time;
		String song, artist, timeString, order, message = "";
		
		for(x = 0; x < recordings.length; ++x) {
			song = JOptionPane.showInputDialog(null, (x + 1) + ". sarki ismi > ");
			artist = JOptionPane.showInputDialog(null, (x + 1) + ". sarkici ismi > ");
			timeString = JOptionPane.showInputDialog(null, (x + 1) + ". sarki kac saniye > ");
			
			time = Integer.parseInt(timeString);
			
			Recording temp = new Recording();
			temp.setArtist(artist);
			temp.setSong(song);
			temp.setPlayTime(time);
			recordings[x] = temp;
		}
		
		order = JOptionPane.showInputDialog(null, 
				"Hangi ture gore siralama yapalim?\n"+ 
		"(S)ong, (A)rtist, (P)layTime; birini tusla > ");
		order.toUpperCase();
		if(order.charAt(0) == 'S')
			sortBySong(recordings);
		else if(order.charAt(0) == 'A')
			sortByArtist(recordings);
		else
			sortByTime(recordings);
		
		for(x = 0; x < recordings.length; ++x)
			message += 
			"\nartist > " + recordings[x].getArtist() + 
			"	song > " + recordings[x].getSong() + 
			"	time > " + recordings[x].getPlayTime();
		
		JOptionPane.showMessageDialog(null, message);
	}
	public static void sortByArtist(Recording[] array) {
		int a, b;
		Recording temp;
		String stringB, stringBPlus;
		int highSubscript = array.length - 1;
		for(a = 0; a < highSubscript; ++b)
			for(b = 0; b < highSubscript; ++b) {
				stringB = array[b].getArtist();
				stringBPlus = array[b + 1].getArtist();
				
				if(stringB.compareTo(stringBPlus) > 0) {
					temp = array[b];
					array[b] = array[b + 1];
					array[b + 1] = temp;
				}
			}
	}
	public static void sortByTime(Recording[] array) {
		int a, b;
		Recording temp;
		
		int highSubscript = array.length - 1;
		for(a = 0; a < highSubscript; ++a)
			for(b = 0; b < highSubscript; ++b) {
				if(array[b].getPlayTime() > array[b + 1].getPlayTime()) {
					temp = array[b];
					array[b] = array[b + 1];
					array[b + 1] = temp;
				}
			}
	}
	public static void sortBySong(Recording[] array) {
		int a, b;
		Recording temp;
		int highSubscript = array.length - 1;
		String stringB, stringBPlus;
		
		for(a = 0; a < highSubscript; ++a)
			for(b = 0; b < highSubscript; ++b) {
				stringB = array[b].getSong();
				stringBPlus = array[b + 1].getSong();
				if(stringB.compareTo(stringBPlus) > 0) {
					temp = array[b];
					array[b] = array[b + 1];
					array[b + 1] = temp;
			}
		}
	}
}
