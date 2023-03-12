package model;

import java.util.ArrayList;

import service.IComponent;

public class Playlist implements IComponent {

	private String playlistName;
	private ArrayList<IComponent> playlist = new ArrayList<IComponent>();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	public void play() {
		System.out.println("Tocando " + playlistName);
		for (IComponent song : playlist) {
			song.play();
		}
	}

	public void setPlaybackSpeed(float speed) {
		for (IComponent song : playlist) {
			song.setPlaybackSpeed(speed);
		}
	}

	public void add(IComponent component) {
		playlist.add(component);
	}

	public void remove(IComponent component) {
		playlist.remove(component);
	}

	public String getName() {
		return playlistName;
	}

}
