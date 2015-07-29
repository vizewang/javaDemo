package chapter6.item30;

/**
 * Created by weizwang on 2015/7/28.
 */
public class WeightTable {
    public static void main(String[] args) {
        double earthWeight=9.97;
        double mass=earthWeight/Planet.EARTH.surfaceGravity();
        for(Planet p:Planet.values())
            System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
    }
}
