public class Forest extends Terrain {
    private int numTrees;
    public Forest(int l, int w, int givenTrees) {
        super(l,w);
        numTrees = givenTrees;
    }
    public int getNumTrees()    {
        return numTrees;
    }
}
