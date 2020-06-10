import java.util.ArrayList;

public class CircleTester {
    public static void main(String[] args)  {
        Circle2 circle = new Circle2(2,4,5);
        Cylinder2 cylinder = new Cylinder2(5,6,2,4);
        Oval2 oval = new Oval2(5,10,2,4);
        OvalCylinder2 ovalCylinder = new OvalCylinder2(5, 10,3,5,6);

        ArrayList<Circle2> circles = new ArrayList<>();
        circles.add(circle);
        circles.add(cylinder);
        circles.add(oval);
        circles.add(ovalCylinder);
        int arrayCount = circles.size();
        for(int i = 0; i < arrayCount; i++) {
            showCenter(circles.get(i));
        }

    }
    public static void showCenter(Circle2 circle)  {
        System.out.println("For this " + circle.getName() + ", the " + circle.getCenter());
    }

}
