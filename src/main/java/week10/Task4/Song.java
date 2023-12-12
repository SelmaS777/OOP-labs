package week10.Task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Song {
    private String title;
    private String artist;
    private String genre;

    public Song(String title, String artist, String genre){
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public String toString(){
        return "Song: " + this.title;
    }
}

class GenreFilterGenerator implements Iterator<Song> {
    private String genre;
    private ArrayList<Song> playlist = new ArrayList<>();
    private int index;

    public GenreFilterGenerator(String genre, ArrayList<Song> playlist){
        this.genre = genre;
        this.playlist = playlist;
        this.index = 0;
    }

    public boolean hasNextValue0(){
        while(!(this.playlist.get(index).getGenre().equals(this.genre))){
            index++;
        }
        return index < this.playlist.size();
    }
    public boolean hasNext(){
        while(index < playlist.size()){
            if(this.playlist.get(index).getGenre().equals(this.genre)){
                return true;
            }
            index++;
        }
        return false;
    }

    public Song next(){
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        return this.playlist.get(index++);
    }
}

class Task4{
    public static void main(String[] args) {
        Song song1 = new Song("Me Porto Bonito", "Bad Bunny, Chencho Corleone", "Reggaeton");
        Song song2 = new Song("Another Love", "Tom Odell", "Pop");
        Song song3 = new Song("Spectrum", "Calvin Harris", "Pop");

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);

        GenreFilterGenerator generator = new GenreFilterGenerator("Pop", songs);
        while (generator.hasNext()) {
            System.out.println(generator.next());
        }
    }
}
