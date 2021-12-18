package gac;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Game {

	private String name;

	public Game(String name) {
		this.name = name;
		sayName();
	}

	// I don't want a message for every creation
	public Game(String name, int i) {
		this.name = name;
	}

	public void sayName() {
		System.out.println(name);
	}

	static public String extractName(Game game) {
		return game.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class ReferencesClass {

	public static void main(String[] args) {

		List<Game> games = new ArrayList<>();

		Game game1 = new Game("Fifa", 0);
		Game game2 = new Game("CS:GO", 0);
		Game game3 = new Game("NFS", 0);
		Game game4 = new Game("Minecraft", 0);

		games.add(game1);
		games.add(game2);
		games.add(game3);
		games.add(game4);

		List<String> names = new ArrayList<>();

		names.add("OSU");
		names.add("Fortnite");
		names.add("Mortal Kombat");

		games.stream().forEach(Game::sayName); // Fifa CS:GO NFS Minecraft
		System.out.println();
		names.stream().forEach(Game::new); // OSU Fortnite Mortal Kombat

		Stream.of(game1, game2, game3, game4).map(Game::extractName).forEach(game1::setName);
		// Fifa -> CS:GO -> NFS -> Minecraft

		game1.sayName(); // Mincecraft

	}

}
