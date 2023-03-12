package main;

import model.Playlist;
import model.Song;

public class Main {

	public static void main(String[] args) {

		Song s1 = new Song("22", "taylor", 2.30f); // Creamos objeto 1
		Song s2 = new Song("Mi suerte", "Morat", 3.21f); // Creamos objeto 2

		Playlist pl1 = new Playlist("De verano"); // Creamos un objeto Playlint

		pl1.add(s1); // Los agregamos la playlist
		pl1.add(s2);

		Song s3 = new Song("22", "taylor", 2.30f); // Creamos objeto 3
		pl1.remove(s3);

		pl1.play(); // Mandamos a llamar al metodo play implementado por la interface
	}

}
