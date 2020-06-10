public class GameTerrainTester {
    public static void main(String[] args)  {
        Terrain terrain = new Terrain(150,240);
        Forest forest = new Forest(400,400,180);
        Mountain mountain = new Mountain(600,600,12);
        WinterMountain wintMountain = new WinterMountain(500,500,30,12.34);
        winterForest wintForest = new winterForest(250,250,180,6.1);
        snowyTundra tundra = new snowyTundra(125,625,6);
        System.out.println("Terrain " + terrain.getTerrainSize() + ".");
        System.out.println("Forest " + forest.getTerrainSize() + " and has " + forest.getNumTrees() + " trees.");
        System.out.println("Mountain " + mountain.getTerrainSize() + " and has " + mountain.getMountainCount() + " mountains.");
        System.out.println("Winter Mountain " + wintMountain.getTerrainSize() + " and has " +  wintMountain.getMountainCount() + " mountains and is " + wintMountain.getTemp() + " degrees.");
        System.out.println("Winter Forest " + wintForest.getTerrainSize() + " and has " + wintForest.getNumTrees() + " trees, and has " + wintForest.getSnowAmnt() + " inches of snow on the ground.");
        System.out.println("Snowy Tundra " + tundra.getTerrainSize() + " and has " + tundra.getPolarBears() + " polar bears roaming around.");

    }
}
