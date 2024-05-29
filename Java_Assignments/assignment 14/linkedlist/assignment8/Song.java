package assgn_14.linkedlist.assignment8;

public class Song implements Comparable<Song> {
	String songIdString;
	String titleString;
	String artist;
	String albumString;
	double duration;

	public Song(String songIdString, String titleString, String artist, String albumString, double duration) {
		this.songIdString = songIdString;
		this.titleString = titleString;
		this.artist = artist;
		this.albumString = albumString;
		this.duration = duration;
	}

	public Song() {
		// Default constructor
	}

	@Override
	public String toString() {
		return "Song [songId=" + songIdString + ", title=" + titleString + ", artist=" + artist
				+ ", album=" + albumString + ", duration=" + duration + "]";
	}

	public String getSongIdString() {
		return songIdString;
	}

	public void setSongIdString(String songIdString) {
		this.songIdString = songIdString;
	}

	public String getTitleString() {
		return titleString;
	}

	public void setTitleString(String titleString) {
		this.titleString = titleString;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbumString() {
		return albumString;
	}

	public void setAlbumString(String albumString) {
		this.albumString = albumString;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	@Override
	public int compareTo(Song other) {
		return Double.compare(this.duration, other.duration);
	}
}
