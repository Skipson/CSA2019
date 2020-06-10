public class snowyTundra extends Terrain {
    private int polarBears = 0;
    public snowyTundra(int l, int w, int bears)   {
        super(l,w);
        polarBears = bears;
    }
    public int getPolarBears() {
        return polarBears;
    }
}
