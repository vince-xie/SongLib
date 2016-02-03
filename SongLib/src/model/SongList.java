package model;

import java.util.ArrayList;

public class SongList {
	
	private ArrayList<Song> songList;
	
	/**
	 * Creates a new instance of an empty SongList
	 */
	public SongList(){
		songList = new ArrayList<Song>();
	}
	
	/**
	 * Creates a new instance of a SongList using an ArrayList of Songs
	 * 
	 * @param songList ArrayList of Songs
	 */
	public SongList(ArrayList<Song> songList){
		this.songList = songList;
	}
	
	/**
	 * Get a Song from the SongList
	 * 
	 * @param index index of the song in the list
	 * @return song at the index in the list
	 */
	public Song getSongFromListIndex(int index){
		if(index >= songList.size() || index < 0){
			return null;
		}
		return songList.get(index);
	}
	
	/**
	 * Add a song to the SongList
	 * 
	 * @param name name of the song
	 * @param album album of the song
	 * @param artist artist of the song
	 * @param year year of the song
	 * @return 0 if successful, -1 if song already in list
	 */
	public int addSongToList(String name, String album, String artist, int year){
		for(int i = 0; i < songList.size(); i++){
			if(name.compareToIgnoreCase(songList.get(i).getName()) > 0){
				Song newSong = new Song(name, album, artist, year);		
				songList.add(i, newSong);
				return 0;
			}
			else if(name.equalsIgnoreCase(songList.get(i).getName())){
				return -1;
			}
		}
		Song newSong = new Song(name, album, artist, year);
		songList.add(newSong);
		return 0;
		
	}
	
	/**
	 * Deletes a song from the SongList
	 * 
	 * @param index of the song
	 */
	public void deleteSongFromList(int index){
		if(index < 0 || index >= songList.size()){
			return;
		}
		songList.remove(index);
	}
}
