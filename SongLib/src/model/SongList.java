package model;

import java.util.ArrayList;
import java.io.*;

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
	 * @return index if successful, -1 if song already in list
	 */
	public int addSongToList(Song song){
		for(int i = 0; i < songList.size(); i++){
			if(song.compareTo(songList.get(i)) == 0 && song.getArtist().equals(songList.get(i).getArtist())){
				return -1;
			} else if(song.compareTo(songList.get(i)) <= 0){
				songList.add(i, song);
				return i;
			}
		}
		songList.add(song);
		return songList.size() - 1;	
	}
	
	/**
	 * @return the song list of songs
	 */
	public ArrayList<Song> getSongList() {
		return songList;
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
	
	/**
	 * Prints out the contents of the song list. For testing purposes.
	 */
	public void printList(){
		for(int i = 0; i < songList.size(); i++){
			//System.out.println("Name: " + songList.get(i).getName() + " Artist: " + songList.get(i).getArtist() + " Album: " + songList.get(i).getAlbum() + " Year: " + songList.get(i).getYear());
			System.out.println(songList.get(i).toJSON());
		}
		System.out.println();
	}
	
	/**
	 * Writes the list of songs to a file
	 * @param list of songs
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 */
	public void writeFile(ArrayList<Song> songs) throws FileNotFoundException, UnsupportedEncodingException {
		Writer writer = null;
		try {
		    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("song-list.json"), "utf-8"));
		    for(Song song : songs){
				writer.write(song.toJSON() + "\n");
			}
		}
		catch (IOException ex) {}
		finally {
		   try {
			   writer.close();
		   } 
		   catch (Exception ex) {}
		}
	}
}
