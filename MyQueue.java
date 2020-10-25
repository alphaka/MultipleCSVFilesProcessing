// The class has a constructor that takes the path of the file to retrieve
// data from before arranging those data in the queue.

import java.io.File;
import java.util.Scanner;

public class MyQueue {
	
	private String path;
	private Node first, last;
	private int length;
	
	public MyQueue(String path) {
		this.path = path;
		this.length = 0;
	}
	
	// extractData() returns a queue linkedlist that contains all the songs 
	// from the csv
	public Node extractData() throws Exception {
		
		Scanner sc = new Scanner(new File(path));
		
		while(sc.hasNextLine()) {
			
			String line = sc.nextLine();
			String[] subLine = line.split(",");
			String song = subLine[1];
			
			// taking care of unwanted quotes
			try {
				if(song.charAt(0) == '"')
					song = song.substring(1, song.length()-1);
			
				if(!song.equals("Track Name")) {
					queueInsertion(song);
					this.length++;
				}
			
			} catch (Exception e) {
				;
			}
		}
		
		return first;
	
	}
	
	
	public void queueInsertion(String song) {
		Node currentSong = new Node(song);
		if(last==null)
			this.first = this.last = currentSong;
		else {
			this.last.next = currentSong;
			this.last = currentSong;
		}
	}
	
	// deque() returns the first song name from the queue
	// and assigns first.next to the next Node
	public String deque() {
		String song = "";
		if(this.first.next == null)
			return "";
		else {
			song = this.first.next.song;
			this.first.next = first.next.next;
			return song;
		}	
	}
	
	// getSize returns the length of the queue
	public int getSize() {
		return this.length;
	}
}
