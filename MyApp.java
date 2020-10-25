// MyApp contains the main method

public class MyApp {

	public static void main(String [] arg) {
		// myFiles is the array that will store the path of the
		// 13 csv files to extract the data from
		
		String[] myFiles = new String[13];
		
		myFiles[0] = "/Users/alpha/Desktop/Data/07-03.csv";
		myFiles[1] = "/Users/alpha/Desktop/Data/07-10.csv";
		myFiles[2] = "/Users/alpha/Desktop/Data/07-17.csv";
		myFiles[3] = "/Users/alpha/Desktop/Data/07-24.csv";
		myFiles[4] = "/Users/alpha/Desktop/Data/07-31.csv";
		myFiles[5] = "/Users/alpha/Desktop/Data/08-07.csv";
		myFiles[6] = "/Users/alpha/Desktop/Data/08-14.csv";
		myFiles[7] = "/Users/alpha/Desktop/Data/08-21.csv";
		myFiles[8] = "/Users/alpha/Desktop/Data/08-28.csv";
		myFiles[9] = "/Users/alpha/Desktop/Data/09-04.csv";
		myFiles[10] = "/Users/alpha/Desktop/Data/09-11.csv";
		myFiles[11] = "/Users/alpha/Desktop/Data/09-18.csv";
		myFiles[12] = "/Users/alpha/Desktop/Data/09-25.csv";
		
		LinkedList allTheWeeks = new LinkedList();
		
		for(int i = 0; i< myFiles.length; i++) {
			try {
				// data is an instance of MyQueue which has
				// access the extract() method
				MyQueue data = new MyQueue(myFiles[i]);
				
				allTheWeeks.add(data);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// display() prints the output to AllTheWeeks.csv
		try {
			allTheWeeks.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Playlist myPlaylist = new Playlist();
		
		myPlaylist.addSong("Hawái by Maluma");
		myPlaylist.addSong("ROCKSTAR (feat. Roddy Ricch)");
		myPlaylist.addSong("Blinding Lights");
		myPlaylist.addSong("Roses - Imanbek Remix");
		myPlaylist.addSong("Breaking Me");
		
		try {
		// display() prints the output to Playlist.txt
		myPlaylist.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
