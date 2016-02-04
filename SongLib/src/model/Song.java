package model;

public class Song {
	
	private String name;
	private String album;
	private String artist;
	private int year;
	
	/**
	 * Creates a new instance of a song.
	 * 
	 * @param name name of the song
	 * @param album album of the song
	 * @param artist artist of the song
	 * @param year year of the song
	 */
	public Song(String name, String album, String artist, int year){
		this.name = name;
		this.album = album;
		this.artist = artist;
		this.year = year;
	}

	/**
	 * Returns the name of the song
	 * @return  name of the song
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Returns the album of the song
	 * @return  album of the song
	 */
	public String getAlbum(){
		return album;
	}
	
	/**
	 * Returns the artist of the song
	 * @return  artist of the song
	 */
	public String getArtist(){
		return artist;
	}
	
	/**
	 * Returns the year of the song
	 * @return year of the song
	 */
	public int getYear(){
		return year;
	}
	
	/**
	 * Sets the name of the song
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Sets the album of the song
	 * @param album
	 */
	public void setAlbum(String album){
		this.album = album;
	}
	
	/**
	 * Sets the artist of the song
	 * @param artist
	 */
	public void setArtist(String artist){
		this.artist = artist;
	}
	
	/**
	 * Sets the year of the song
	 * @param year
	 */
	public void setYear(int year){
		this.year = year;
	}
	
	/**
	 * Returns a string representation of a song
	 * @return string representation of a song
	 */
	public String toString(){
		return "Name: " + name + "\n Album: " + album + "Artist: " + artist + "\n Year: " + year;
	}
}