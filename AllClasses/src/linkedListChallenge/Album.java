package linkedListChallenge;

import java.util.ArrayList;


public class Album {
	private ArrayList<Song> songList = new ArrayList<Song>();

	public ArrayList<Song> getSongList() {
		return songList;
	}
	
	public void displaySongs(Album currentAlbum) {
		int count=0;
		for(Song song: currentAlbum.getSongList()) {
			count++;
			System.out.println(count+"."+song.getName()+" ("+song.getDuration()+")");
		}
	}
	





}
