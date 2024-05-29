package assgn_14.linkedlist.assignment8;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class PlaylistManager {
	LinkedList<Song> linkedList = new LinkedList<>();

	public void add(Song song) {
		linkedList.add(song);
	}

	public void remove(String songId) {
		Iterator<Song> iterator = linkedList.iterator();
		boolean removed = false;
		while (iterator.hasNext()) {
			Song song = iterator.next();
			if (song.getSongIdString().equals(songId)) {
				iterator.remove();
				removed = true;
				System.out.println("Song with id " + songId + " removed.");
				break;
			}
		}
		if (!removed) {
			System.out.println("Song with id " + songId + " not found.");
		}
	}

	public void search(String title) {
		boolean found = false;
		for (Song song : linkedList) {
			if (song.getTitleString().equals(title)) {
				System.out.println("Found: " + song);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Song with title " + title + " not found.");
		}
	}

	public void sort() {
		Collections.sort(linkedList);
	}

	public void display() {
		if (linkedList.isEmpty()) {
			System.out.println("The playlist is empty.");
		} else {
			for (Song song : linkedList) {
				System.out.println(song);
			}
		}
	}
}
