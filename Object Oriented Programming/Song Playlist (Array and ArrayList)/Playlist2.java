package lab;

import java.util.ArrayList;

public class Playlist2 {
public static final int SIZE = 5;
	
	public static void main(String[] args) {
		ArrayList<String> songs = new ArrayList<String>();
		songs.add("How long");
		songs.add("End Game");
		songs.add("Perfect");
		songs.add("Anywhere");
		songs.add("Find you");
		
		ArrayList<Double> durations = new ArrayList<Double>();
		durations.add(3.30);
		durations.add(4.11);
		durations.add(4.21);
		durations.add(3.35);
		durations.add(3.38);
		
		// Display songs in the playlist
		showPlaylist(songs, durations);

		// Find the longest song
		int idx = findLongestSong(durations);
		System.out.println("The longest song is " + songs.get(idx));
		
		// Find the total duration of this playlist in seconds
		int total = getPlaylistDuration(durations);
		System.out.println("The total duration is " + total + " seconds.");
	}
	
	public static int findLongestSong(ArrayList<Double> durations) {
		// Your code goes here
		int i,j=0;
		double Max = -9999;
		for(i= 0; i<durations.size();i++ )
		{
		   if(Max < durations.get(i))
		   {
			   Max = durations.get(i);
			   j=i;
		   }
		}
		return j; 
	}
	
	public static int getPlaylistDuration(ArrayList<Double> durations) 
	{
		int t;
		int total=0;
		double total2=0;
		for(int i=0; i < durations.size() ; i++)
		{
			total = (int) (total + durations.get(i));
		}
		
		t=(int) (total);
		
		t=t*60;
		
		for(int i=0; i < durations.size() ; i++)
		{
			total2 = total2 + ((double) durations.get(i)*100 );
		}
		total2 = total2 - ((t/60)*100);
		t=(int) (t+total2);
		return t;
	}
	
	public static void showPlaylist(ArrayList<String> songs, ArrayList<Double> durations) {
		for(int i = 0; i < SIZE; i++) {
			System.out.println("[" + (i + 1) +"] " + songs.get(i) + " (" + durations.get(i) + ")");
		}
	}
}
