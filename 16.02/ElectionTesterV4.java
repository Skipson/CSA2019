import java.util.ArrayList;
public class ElectionTesterV4 {
    public static void main(String[] args)  {
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        candidates.add(new Candidate("Lucy Robertson", 6000));
        candidates.add(new Candidate("Marie Grace", 2400));
        candidates.add(new Candidate("Boyce Ronk", 1800));
        candidates.add(new Candidate("Andrea Sienfeld", 3200));
        candidates.add(new Candidate("Catalina Traverso", 2100));
        candidateData(candidates);
        printTable(candidates);
        nameChange(candidates, "Marie Grace", "Maurice Hippo");
        voteChange(candidates, "Lucy Robertson", 6001);
        nameVoteChange(candidates, "Boyce Ronk", "Bruce Ruperts", 1801);
        printTable(candidates);
    }

    public static void candidateData(ArrayList<Candidate> candidates)   {
        System.out.println("Raw Election Data: \n");
        for(int i = 0; i < candidates.size(); i++)  {
            System.out.println(candidates.get(i).toString());
        }
        System.out.println("\n\n");
    }

    public static int totalVotes(ArrayList<Candidate> candidates)    {
        int totalVotes = 0;
        for(int i = 0; i < candidates.size(); i++)  {
            totalVotes += candidates.get(i).getVotes();
        }
        return totalVotes;
    }

    public static void nameChange(ArrayList<Candidate> candidates, String curName, String newName)    {
        for(int i = 0; i < candidates.size(); i++)  {
            String tempName;
            tempName = candidates.get(i).getName();
            if(tempName.equals(curName))    {
                candidates.get(i).setName(newName);
            }
        }
    }

    public static void voteChange(ArrayList<Candidate> candidates, String curName, int newVotes)    {
        for(int i = 0; i < candidates.size(); i++)  {
            String tempName;
            tempName = candidates.get(i).getName();
            if(tempName.equals(curName))    {
                candidates.get(i).setVotes(newVotes);
            }
        }
    }

    public static void nameVoteChange(ArrayList<Candidate> candidates, String curName, String newName, int newVotes)    {
        for(int i = 0; i < candidates.size(); i++)  {
            String tempName;
            tempName = candidates.get(i).getName();
            if(tempName.equals(curName))    {
                candidates.get(i).setName(newName);
                candidates.get(i).setVotes(newVotes);
            }
        }
    }

    public static void printTable(ArrayList<Candidate> candidates) {
        System.out.println("Election Results: \n");
        System.out.printf("%-20s", "Candidate");
        System.out.printf("%-20s", "Votes Recieved");
        System.out.printf("%s", "% of Total Votes\n");
        System.out.println("------------------------------------------------------");
        for(int i = 0; i < candidates.size(); i++)  {
            System.out.printf("%-25s",candidates.get(i).getName());
            System.out.printf("%-18s",candidates.get(i).getVotes());
            System.out.printf("%-2.5s",((double)candidates.get(i).getVotes() / (double)totalVotes(candidates)) * 100);
            System.out.println("");
        }
        System.out.println("Total number of votes in this election: " + totalVotes(candidates));
    }
}
