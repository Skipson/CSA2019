public class PictureTester
{
  /** Method to test zeroBlue - Activity 5 */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
    public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
      public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testGreyscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.greyscale();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()    {
      Picture pic = new Picture("redMotorcycle.jpg");
      pic.explore();
      pic.mirrorVerticalRightToLeft();
      pic.explore();
    }
    
  public static void testMirrorHorizontal() {
        Picture cycle = new Picture( "redMotorcycle.jpg" );
        cycle.explore();
        cycle.mirrorHorizontal();
        cycle.explore();
    }
    
  public static void testMirrorHorizontalBotToTop() {
        Picture swan = new Picture( "redMotorcycle.jpg" );
        swan.explore();
        swan.mirrorHorizontalBotToTop();
        swan.explore();
    }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()   {
        Picture snowman = new Picture( "snowman.jpg" );
        snowman.explore();
        snowman.mirrorArms();
        snowman.explore();
    }
    
  public static void testMirrorGull()   {
        Picture gull = new Picture( "seagull.jpg" );
        gull.explore();
        gull.mirrorGull();
        gull.explore();
    }

  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  
  public static void testCopy()
  {
        Picture blank = new Picture("7inx95in.jpg");
        Picture moto = new Picture("redMotorcycle.jpg");
        blank.copy2(moto,100,400,100,400);
        blank.explore();
  }
  

  public static void testMyCollage()
  {
        Picture myCollage = new Picture("moon-surface.jpg");
        myCollage.myCollage();
        myCollage.explore();
  }
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
    public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
    Picture swan2 = new Picture("swan.jpg");
    swan2.edgeDetection2(10);
    swan2.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test and 
    // comment out the ones you don't want to run
    
    // Activity 5
    testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    testGreyscale();
    
    // Activity 5 Challenge - optional
    //testFixUnderwater();
    
    // Activity 6
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalBotToTop();
    
    // Activity 6 Challenge - optional
    //testMirrorDiagonal();
    
    // Activity 7
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();

    
    // Activity 8
    //testCollage();
    testCopy();
    testMyCollage();
    
    // Activity 9
    testEdgeDetection();
    testEdgeDetection2();
    
    // Extra methods
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}












