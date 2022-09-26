package SortingTechnique;

import java.util.*;

class Point2 {
    int x, y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class MyCmp2 implements Comparator<Point2> {

    @Override
    public int compare(Point2 o1, Point2 o2) {
        // TODO Auto-generated method stub
        return o1.x - o2.x;
    }

}

public class CompratorInterface {
    public static void main(String args[]) {
        List<Point2> list = new ArrayList<>();
        list.add(new Point2(5, 10));
        list.add(new Point2(2, 20));
        list.add(new Point2(10, 30));
        Collections.sort(list, new MyCmp2());
        for (Point2 p : list) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
