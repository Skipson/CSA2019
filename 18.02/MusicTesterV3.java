public class MusicTesterV3 {
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
        System.out.println("Sorting by Title");
        sortTitle(songs);
        printArray(songs);
        System.out.println("\n Searching for title 'The Safety Dance' returns: ");
        searchTitle(songs, "The Safety Dance");
        System.out.println("\n Searching for title 'Once in a lifetime' (Does not exist) returns: ");
        searchTitle(songs, "Once in a lifetime");
        System.out.println("\n\n");
        System.out.println("Sort by Year");
        sortYear(songs);
        printArray(songs);
        System.out.println("\n Searching for year '1979' returns: ");
        searchYear(songs, 1979);
        System.out.println("\n Searching for year '2002' (Does not exist) returns: ");
        searchYear(songs, 2002);
        System.out.println("\n\n");
        System.out.println("Sort by Artist");
        sortArtist(songs);
        printArray(songs);
        System.out.println("\n Searching for artist 'Electric Light Orchestra' returns: ");
        searchArtist(songs, "Electric Light Orchestra");
        System.out.println("\n Searching for artist 'Beatles' (Does not exist) returns: ");
        searchArtist(songs, "Beatles");


    }

    public static void printArray(Music[] songList)  {
        for(int i = 0; i < songList.length; i++)    {
            System.out.println(songList[i].toString());
        }
    }

    // All methods for searching / sorting title

    public static void searchTitle(Music[] songs, String title)  {
            int high = songs.length;
            int low = -1;
            int probe;
        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if( songs[probe].getTitle().compareTo(title) > 0)
                high = probe;
            else
                low = probe;
        }

        if( (low >= 0) && (songs[low].getTitle().compareTo(title) == 0 ))
            printAllTitles(songs, low, title);
    }

    public static void sortTitle(Music[] source)
    {
        Music[] dest = new Music[ source.length ];
        for( int i = 0 ; i < source.length ; i++ )
        {
            Music next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getTitle().compareTo(dest[k-1].getTitle()) > 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }
            dest[ insertIndex ] = next;
        }
        for(int i = 0; i < dest.length; i++)
            source[i] = dest[i];
    }

    // All  methods for searching + sorting year

    public static void searchYear(Music[] songs, int year) {
        int high = songs.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;
            if (songs[probe].getYear() > year)
                high = probe;
            else
                low = probe;
        }
        if ((low >= 0) && (songs[low].getYear() == year))
            printAllYears(songs, low, year);
    }

    public static void sortYear(Music[] source)
    {
        Music[] dest = new Music[ source.length ];
        for( int i = 0 ; i < source.length ; i++ )
        {
            Music next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getYear() - (dest[k-1].getYear()) > 0)
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }
            dest[ insertIndex ] = next;
        }
        for(int i = 0; i < dest.length; i++)
            source[i] = dest[i];
    }

    // All methods for searching + sorting artist

    public static void searchArtist(Music[] songs, String artistName)  {
        int high = songs.length;
        int low = -1;
        int probe;
        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if( songs[probe].getArtist().compareTo(artistName) > 0)
                high = probe;
            else
                low = probe;
        }

        if( (low >= 0) && (songs[low].getArtist().compareTo(artistName) == 0 ))
            printAllArtists(songs, low, artistName);
    }

    public static void sortArtist(Music[] source)
    {
        Music[] dest = new Music[ source.length ];
        for( int i = 0 ; i < source.length ; i++ )
        {
            Music next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getArtist().compareTo(dest[k-1].getArtist()) > 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }
            dest[ insertIndex ] = next;
        }
        for(int i = 0; i < dest.length; i++)
            source[i] = dest[i];
    }

    public static void printAllTitles(Music[] r, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getTitle().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getTitle().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    public static void printAllYears(Music[] r, int low, int toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getYear() - toFind == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getYear() - toFind == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    public static void printAllArtists(Music[] r, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getArtist().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getArtist().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }






/*
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
*/

/*
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
*/

/*
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
*/
}
