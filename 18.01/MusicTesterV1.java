import java.util.ArrayList;
public class MusicTesterV1 {
    public static void main(String[ ]args)  {
        Music[] songs = new Music[10];
        songs[0] = new Music("Danger Zone", 1997, "Kenny Loggins");
        songs[1] = new Music("Turn to Stone", 1977, "Electric Light Orchestra");
        songs[2] = new Music("The Safety Dance", 1982, "Men Without Hats");
        songs[3] = new Music("The Longest Time", 1983, "Billy Joel");
        songs[4] = new Music("Too Late for Goodbyes", 1984, "Julian Lennon");
        songs[5] = new Music("Go All the Way", 1972, "Raspberries");
        songs[6] = new Music("Cars", 1979, "Gary Numan");
        songs[7] = new Music("Dont Bring Me Down", 1979, "Electric Light Orchestra");
        songs[8] = new Music("Im Still Standing", 1983, "Elton John");
        songs[9] = new Music("Smooth Criminal", 1987, "Michael Jackson");
        System.out.println("List of songs: ");
        printArray(songs);
        System.out.println("\n\n");
        System.out.println("Printing songs that match by title");
        System.out.println(searchTitle(songs, "Cars"));
        System.out.println("\n\n");
        System.out.println("Printing songs that match by year");
        searchYear(songs, 1979);
        System.out.println("\n\n");
        System.out.println("Printing songs that match by artist");
        searchArtist(songs, "Electric Light Orchestra");
    }

    public static void printArray(Music[] songList)  {
        for(int i = 0; i < songList.length; i++)    {
            System.out.println(songList[i].toString());
        }
    }

    public static String searchTitle(Music[] songList, String songTitle)   {
        int indexOfMatch = -1;
        for(int i = 0; i < songList.length; i++)    {
            if(songTitle.equals(songList[i].getTitle()))    {
                indexOfMatch = i;
                break;
            }
        }
        if(indexOfMatch >= 0)   {
            return "A song with matching title is found at position " + (indexOfMatch+1);
        }   else    {
            return "There is no song with matching title.";
        }
    }

    public static void searchYear(Music[] songList, int year)   {
        ArrayList<Music> matchingSongs = new ArrayList<>();
        for(int i = 0; i < songList.length; i++)    {
            if(songList[i].getYear() == year)   {
                matchingSongs.add(songList[i]);
            }
        }
        System.out.println("Songs produced in year: " + year);
        if(matchingSongs.size() == 0)    {
            System.out.println("No songs found.");
        }   else    {
            for (Music matchingSong : matchingSongs) {
                System.out.println(matchingSong.toString());
            }
        }
    }

    public static void searchArtist(Music[] songList, String artist)    {
        ArrayList<Music> matchingSongs = new ArrayList<>();
        for(int i = 0; i < songList.length; i++)    {
            if(songList[i].getArtist().equals(artist))  {
                matchingSongs.add(songList[i]);
            }
        }
        System.out.println("Songs produced by: " + artist);
        if(matchingSongs.size() == 0)    {
            System.out.println("No songs found.");
        }   else    {
            for (Music matchingSong : matchingSongs) {
                System.out.println(matchingSong.toString());
            }
        }
    }
}
