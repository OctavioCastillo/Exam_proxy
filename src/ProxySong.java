public class ProxySong implements Song{

    private RealSong realSong;
    private String title;
    private String artist;

    public ProxySong(String title, String artist){
        this.title = title;
        this.artist = artist;
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
        if (realSong == null){
            realSong = new RealSong(title, artist);
        }
        realSong.play();
    }

    @Override
    public void loadDetails(){
        if (realSong == null){
            realSong = new RealSong(title, artist);
        }
        realSong.loadDetails();
    }
}
