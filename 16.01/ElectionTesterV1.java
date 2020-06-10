public class ElectionTesterV1 {
    public static void main(String[] args)  {
        Candidate[] candidates = new Candidate[5];
        candidates[0] = new Candidate("Lucy Robertson", 6000);
        candidates[1] = new Candidate("Marie Grace", 2400);
        candidates[2] = new Candidate("Boyce Ronk", 1800);
        candidates[3] = new Candidate("Andrea Sienfeld", 3200);
        candidates[4] = new Candidate("Catalina Traverso", 2100);
        candidateData(candidates);
        printTable(candidates);
    }

    public static void candidateData(Candidate[] candidates)   {
        System.out.println("Raw Election Data: \n");
        for(int i = 0; i < candidates.length; i++)  {
            System.out.println(candidates[i].toString());
        }
        System.out.println("\n\n");
    }

    public static int totalVotes(Candidate[] candidates)    {
        int totalVotes = 0;
        for(int i = 0; i < candidates.length; i++)  {
            totalVotes += candidates[i].getVotes();
        }
        return totalVotes;
    }

    public static void printTable(Candidate[] candidates) {
        System.out.println("Election Results: \n");
        System.out.printf("%-20s", "Candidate");
        System.out.printf("%-20s", "Votes Recieved");
        System.out.printf("%s", "% of Total Votes\n");
        System.out.println("------------------------------------------------------");
        for(int i = 0; i < candidates.length; i++)  {
            System.out.printf("%-25s",candidates[i].getName());
            System.out.printf("%-18s",candidates[i].getVotes());
            System.out.printf("%-2.5s",((double)candidates[i].getVotes() / (double)totalVotes(candidates)) * 100);
            System.out.println("");
        }
        System.out.println("Total number of votes in this election: " + totalVotes(candidates));
    }
}
