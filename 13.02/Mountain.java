public class Mountain extends Terrain {
    private int mountainCount;
    public Mountain(int l, int w, int m)    {
        super(l,w);
        mountainCount = m;
    }
    public int getMountainCount()   {
        return mountainCount;
    }


}
