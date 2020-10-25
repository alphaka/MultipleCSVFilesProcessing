// The Playlist class creates a playlist based on the
// title of the song entered into addSong()
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Playlist extends LinkedList {
	
	// addSong() adds a song to one's playlist
	public void addSong(String song){
		queueInsertion(song);
	}
	
	// listenToSong() retrieves the next Song Node
	// from first and makes 'first' points to 
	// 'first.next'
	
	public Node listenToSong(){
		Node current = first;
		first = first.next;
		return current;
	}
	
	
	public void display() throws FileNotFoundException {
		
		PrintStream ps = new PrintStream(new File(
					"/Users/alpha/Desktop/Playlist.txt"));
		
		Node current = listenToSong();
		
		ps.println("The songs in the playlist were played"
				+ " as followed: \n");
		
		try {
			while(current!=null) {
				ps.println(current.song);
				current = listenToSong();
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
