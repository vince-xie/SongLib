//Edmond Wu & Vincent Xie

package model;

public class Song implements Comparable<Song>{
	
	private String name;
	private String album;
	private String artist;
	private String year;
	private int id;
	
	/**
	 * Creates a new instance of a song. Assigns a random ID integer to it (for possible future database use).
	 * 
	 * @param name name of the song
	 * @param album album of the song
	 * @param artist artist of the song
	 * @param year year of the song
	 */
	public Song(String name, String album, String artist, String year){
		this.name = name;
		this.album = album;
		this.artist = artist;
		this.year = year;
		this.id = 1 + (int)(Math.random() * 10000);
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
	public String getYear(){
		return year;
	}
	
	/**
	 * Returns the song's id
	 * @return id of the song
	 */
	public int getID() {
		return id;
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
	public void setYear(String year){
		this.year = year;
	}
	
	/**
	 * Returns a string representation of a song
	 * @return string representation of a song
	 */
	public String toString(){
		return "Name: " + name + "\nAlbum: " + album + "\nArtist: " + artist + "\nYear: " + year;
	}
	
	/**
	 * Returns a CSV representation of a song
	 * @return CSV representation of a song
	 */
	public String toCSV() {
		return id + ",\"" + name + "\",\"" + artist + "\",\"" + album + "\",\"" + year + "\"";
	}

	/**
	 * Compares ONLY the name of two songs
	 * @return 0 if same name
	 */
	@Override
	public int compareTo(Song o) {
		int firstCheck = this.name.compareToIgnoreCase(o.name);
		if (firstCheck == 0) {
			return this.artist.compareToIgnoreCase(o.artist);
		}
		return firstCheck;
	}
	
	/**
	 * Compares ONLY the name of two songs
	 * @return 0 if same name
	 */
	@Override
	public boolean equals(Object o) {
		if(o == null || !(o instanceof Song)){
			return false;
		}
		Song s = (Song)o;
		if(this.compareTo(s) == 0 && this.artist.equalsIgnoreCase(s.getArtist())){
			return true;
		}
		return false;
	}
	
}
