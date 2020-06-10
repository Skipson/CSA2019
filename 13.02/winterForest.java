public class winterForest extends Forest{
    private double snowAmnt = 0.0;
    public winterForest(int l, int w, int t, double snow)   {
        super(l,w,t);
        snowAmnt = snow;
    }
    public double getSnowAmnt() {
        return snowAmnt;
    }
}
