import java.util.ArrayList;
public class ElectionTesterV8 {
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
        System.out.println("\n\nBefore Inserting New: ");


        // Note that for each position that goes into the method, it is based on the VISUAL position, not index.
        // For example, you look at the list and want to delete whoever is in the second spot, you would use
        // the number 2, not the index position, which is 1.

        System.out.println("\n\nAfter inserting 'New Candidate' using position:");
        insertCandidate(candidates, 2, "New Candidate", 2500);
        printTable(candidates);

        System.out.println("\n\nAfter inserting 'Another Candidate' using name:");
        insertCandidate(candidates, "Catalina Traverso", "Another Candidate", 1800);
        printTable(candidates);

        System.out.println("\n\nAfter deleting whichever candidate is in position 3:");
        deleteCandidate(candidates, 3);
        printTable(candidates);

        System.out.println("\n\nAfter deleting 'Catalina Traverso' :");
        deleteCandidate(candidates, "Catalina Traverso");
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

    public static void insertCandidate(ArrayList<Candidate> candidates, int pos, String newCand, int votes) {
        candidates.add(pos - 1, new Candidate(newCand, votes));
    }

    public static void insertCandidate(ArrayList<Candidate> candidates, String name, String newCand, int votes) {
        int pos = 0;
        for(int i = 0; i < candidates.size(); i++)    {
            String tempName = candidates.get(i).getName();
            if(tempName.equals(name))    {
                pos = i;
            }
        }
        candidates.add(pos, new Candidate(newCand, votes));
    }

    public static void deleteCandidate(ArrayList<Candidate> candidates, int pos) {
        candidates.remove(pos - 1);
    }

    public static void deleteCandidate(ArrayList<Candidate> candidates, String name) {
        int pos = 0;
        for(int i = 0; i < candidates.size(); i++)    {
            String tempName = candidates.get(i).getName();
            if(tempName.equals(name))    {
                pos = i;
            }
        }
        candidates.remove(pos);
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
