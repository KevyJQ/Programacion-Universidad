package model;

import service.IComponent;

public class Song implements IComponent {

	private String songName;
	private String artist;
	private float speed;

	public Song(String songName, String artist, float speed) {
		this.songName = songName;
		this.artist = artist;
		this.speed = speed;
	}

	public void play() {
		System.out.printf("tocando %s por artista %s a la velocidad %f \n", songName, artist, speed);
	}

	public void setPlaybackSpeed(float speed) {
		this.speed = speed;
	}

	public String getName() {
		return songName;
	}

	public String getArtist() {
		return artist;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((songName == null) ? 0 : songName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		if (songName == null) {
			if (other.songName != null)
				return false;
		} else if (!songName.equals(other.songName))
			return false;
		return true;
	}

}
