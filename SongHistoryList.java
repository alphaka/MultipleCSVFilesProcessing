// This class tracks all listened song in placed them in
// a stack linkedlist
public class SongHistoryList extends LinkedList{

	public void addSong(String song) {
		stackInsertion(song); // insert is a method from LinkedList
	}
	
	public String lastListened() {
		return first.song; 
	}
}
