package linkedListChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {

	static List<Album> albumList = new ArrayList<Album>();
	static Scanner scanner = new Scanner(System.in);

	public static List<Song> addSong(List<Song> playlist) {
		System.out.println("Choose an album:\n1.Howl's Moving Castle OST\n2.Spirited Away OST\n3.Ocean Waves OST");
		int choice = scanner.nextInt();
		Album currentAlbum = null;
		switch (choice) {
		case 1:
			currentAlbum = albumList.get(0);
			break;
		case 2:
			currentAlbum = albumList.get(1);
			break;
		case 3:
			currentAlbum = albumList.get(2);
			break;
		}
		System.out.println("Songs in album\n");
		currentAlbum.displaySongs(currentAlbum);
		System.out.println("\nChoose a song to add to your playlist");
		scanner.nextLine();
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
			if (playlist.contains(currentAlbum.getSongList().get(choice - 1))) {
				System.out.println("You have already added that song\n");
				break;
			}
			playlist.add(currentAlbum.getSongList().get(0));
			System.out.println(
					"---> Successfully added " + playlist.get(playlist.size() - 1).getName() + " to your playlist\n");
			break;

		case 2:
			if (playlist.contains(currentAlbum.getSongList().get(choice - 1))) {
				System.out.println("You have already added that song\n");
				break;
			}
			playlist.add(currentAlbum.getSongList().get(1));
			System.out.println(
					"---> Successfully added " + playlist.get(playlist.size() - 1).getName() + " to your playlist\n");
			break;
		case 3:
			if (playlist.contains(currentAlbum.getSongList().get(choice - 1))) {
				System.out.println("You have already added that song\n");
				break;
			}
			playlist.add(currentAlbum.getSongList().get(2));
			System.out.println(
					"---> Successfully added " + playlist.get(playlist.size() - 1).getName() + " to your playlist\n");
			break;
		case 4:
			if (playlist.contains(currentAlbum.getSongList().get(choice - 1))) {
				System.out.println("You have already added that song\n");
				break;
			}
			playlist.add(currentAlbum.getSongList().get(3));
			System.out.println(
					"---> Successfully added " + playlist.get(playlist.size() - 1).getName() + " to your playlist\n");
			break;
		}
		return playlist;
	}

	public static void playSong(List<Song> playlist) {
		System.out.println("Choose a song to play:\n");
		for (int i = 0; i < playlist.size(); i++) {
			System.out.println(i + 1 + "." + playlist.get(i).getName() + " (" + playlist.get(i).getDuration() + ")");
		}
		int indexVal = scanner.nextInt();
		ListIterator<Song> iterator = playlist.listIterator();
		System.out.println("--->" + playlist.get(indexVal - 1).getName() + " is now playing\n\n");
		for (int i = 0; i < indexVal; i++) {
			iterator.next();
		}
		boolean goingForward = true, goingBackward = false;
		while (true) {
			System.out.println(
					"Would you like to\n1.Replay the current song\n2.Play the next song\n3.Play the previous song\n**ENTER 0 TO QUIT**");
			int choice = scanner.nextInt();
			if (choice == 0) {
				break;
			}
			switch (choice) {
			case 1:
				System.out.println(
						"\n---> Song replayed --->" + playlist.get(indexVal - 1).getName() + " is now playing\n\n");
				break;
			case 2:
				if (!goingForward) {
					iterator.next();
				}
				if (!iterator.hasNext()) {
					System.out.println("---> You have reached the end of the playlist.\n");
					break;
				}
				System.out.println("\n---> Playing next song --->" + iterator.next().getName() + " is now playing\n\n");
				goingForward = true;
				goingBackward = false;
				indexVal++;
				break;
			case 3:
				if (!goingBackward) {
					iterator.previous();
				}
				if (!iterator.hasPrevious()) {
					System.out.println("Already at the beginning of playlist. Cannot play previous song.\n");
					break;
				}
				System.out.println(
						"\n---> Playing previous song --->" + iterator.previous().getName() + " is now playing\n\n");
				goingBackward = true;
				goingForward = false;
				indexVal--;
				break;
			}
		}
	}

	public static void main(String[] args) {
		Album howlsCastle = new Album();
		Album spiritedAway = new Album();
		Album oceanWaves = new Album();
		List<Song> playlist = new ArrayList<Song>();

		howlsCastle.getSongList().addAll(Arrays.asList(new Song("Merry Go Round of Life", "3:42"),
				new Song("Heartbeat", "4:01"), new Song("Sophie in Exile", "3:03"), new Song("In the Rain", "4:36")));

		spiritedAway.getSongList()
				.addAll(Arrays.asList(new Song("One Summer's Day", "3:29"), new Song("The Sixth Station", "4:01"),
						new Song("Nighttime Coming", "3:18"), new Song("Reprise", "4:23")));

		oceanWaves.getSongList()
				.addAll(Arrays.asList(new Song("On a Sunny Day", "4:19"), new Song("A Girl's Thoughts", "5:01"),
						new Song("First Impression", "3:18"), new Song("The Ocean Waves", "4:43")));

		albumList.addAll(Arrays.asList(howlsCastle, spiritedAway, oceanWaves));

		System.out.println("Welcome to Derek's playlist maker. Here you're given the honor of making a playlist out of"
				+ "his best picks from his favourite movies of studio: Studio Ghibli\n");
		while (true) {

			System.out.println(
					"\n***1.Add song to your playlist\n***2.Play music from your playlist\n\nPRESS 0 TO QUIT***");
			int choice = scanner.nextInt();
			if (choice == 0) {
				break;
			}
			switch (choice) {
			case 1:
				playlist = addSong(playlist);
				break;
			case 2:
				if (playlist.size() == 0) {
					System.out.println("You haven't added any songs to your playlist");
					break;
				}
				playSong(playlist);
				System.out.println();
			}
		}
	}
}
