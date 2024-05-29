package assgn_14.linkedlist.assignment8;

public class Main {
    public static void main(String[] args) {
        PlaylistManager playlistManager = new PlaylistManager();

        Song song1 = new Song("1", "Pasoori", "Artist A", "Album X", 3.45);
        Song song2 = new Song("2", "ABCD", "Artist B", "Album Y", 4.20);
        Song song3 = new Song("3", "Janam", "Artist A", "Album Z", 2.50);
        Song song4 = new Song("4", "Dus Bahane", "Artist C", "Album X", 3.00);

        playlistManager.add(song1);
        playlistManager.add(song2);
        playlistManager.add(song3);
        playlistManager.add(song4);

        System.out.println("All songs in the playlist:");
        playlistManager.display();

        System.out.println("\nSearching for 'Song Two':");
        playlistManager.search("Song Two");

        System.out.println("\nRemoving song with id '3':");
        playlistManager.remove("3");

        System.out.println("\nAll songs in the playlist after removal:");
        playlistManager.display();

        System.out.println("\nSongs sorted by duration:");
        playlistManager.sort();
        playlistManager.display();
    }
}