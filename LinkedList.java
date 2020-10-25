// This is our LinkedList class and it contains the
// sortInsertion(), queueInsertion(), stackInsertion()

import java.io.File;
import java.io.PrintStream;

public class LinkedList {
	
	public Node first, last;
	
	// The add() accepts MyQueue type. MyQueue
	// has an extractData() and deque() methods
	public void add(MyQueue data) {
		//
		try {
			data.extractData();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		int dataSize = data.getSize();
		String song;
		
		while (dataSize > 0) {
			song = data.deque();
			if(songNotStoredYet(song))
				sortInsertion(song);
			dataSize--;
		}
	}

	// sortInsertion() adds a new node into a sorted LinkedList
	private void sortInsertion(String song) {
		
		Node newNode = new Node(song);
		Node previous = null;
		Node current = first;
		
		// 'previous' is the node that contains the position of the node
		// that is previous to 'newNode'
		while(current !=null && (song.compareTo(current.song))>=0) {
			previous = current;
			current = current.next;
		}
		
		if(previous == null)
			first = newNode;
		else
			previous.next = newNode;
		
		newNode.next = current;
	}

	//songNotStoredYet() returns true if the song is already stored in
	// the 'first' node
	private boolean songNotStoredYet(String song) {
		Node current = first;
		
		while(current!=null) {	
			if(current.song.equals(song))
				return false;
			current = current.next;
		}
		return true;
	}
	
	public void display() throws Exception {
		
		PrintStream ps = new PrintStream(new File("/Users/alpha/Desktop/"
												+ "AllTheWeeks.csv"));
		
		ps.println("Below are the alphabetized top song between July-September");
			
		try {
			Node current = first;
			while(current!=null) {
				ps.println(current.song);
				current = current.next;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	
	// stackInsertion() adds a new node into a singly linkedlist
	public void stackInsertion(String song) {
		Node newNode = new Node(song);
		
		if(first == null)
			this.first = newNode;
		else
			newNode.next = this.first;
		
		this.first = newNode;
	}
	
	// queueInsertion() adds a new node into a queue linkedlist
	public void queueInsertion(String song) {
		Node currentSong = new Node(song);
		if(last==null)
			this.first = this.last = currentSong;
		else {
			this.last.next = currentSong;
			this.last = currentSong;
		}
	}
	
}
