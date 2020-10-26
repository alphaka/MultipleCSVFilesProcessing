# MultipleCSVFilesProcessing

The goal of this project is to produce an alphabetized list after processing 
2600 data from 13 CSV files from spotify.com

MyApp.java is the class that contains the main method. Inside that class,
I created an array that has the path of the thirteen files to be read from.

My second class is MyQueue() which is a Queue-LinkedList. The class has a
constructor that takes the path of the file to retrieve the data from
before arranging them in the queue. The method that creates the queue is
called queueInsertion() which receives the song's title through extractData().

The other four classes are Node, LinkedList, SongHistory, and Playlist.
