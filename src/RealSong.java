public class RealSong implements Song{

    private String title;
    private String artist;
    private String lyrics;
    private String metadata;

    public RealSong(String title, String artist){
        this.title = title;
        this.artist = artist;
        this.lyrics = "Lyrics of the song";
        this.metadata = "Song metadata";
    }

    @Override
    public void getTitle(){
        System.out.println("Title: " + title);
    }

    @Override
    public void getArtist(){
        System.out.println("Artist: " + artist);
    }

    @Override
    public void play(){
        System.out.println("Playing: " + title + " by " + artist);
    }

    @Override
    public void loadDetails(){
        System.out.println("Details loaded");
    }

}
