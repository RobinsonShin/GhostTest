import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class GhostTest
{
    class Point implements Comparable<Point>
    {
        private Integer x;
        private Integer y;

        public Point(Integer inX, Integer inY)
        {
            x = inX;
            y = inY;
        }

        public Integer getX()
        {
            return x;
        }

        public Integer getY()
        {
            return y;
        }

        public boolean equals(Point p)
        {
            return x.equals(p.getX()) && p.getY().equals(y);
        }

        public int compareTo(Point p)
        {
            if (this.x > p.getX())
            {
                return 1;
            }

            else if (this.x < p.getX())
            {
                return -1;
            }
            else if (this.y > p.getX())
            {
                return 1;
            }
            else if (this.y < p.getY())
            {
                return -1;
            }
            else
            {
                return 0;
            }
        }
    }

    public GhostTest()
    {
    }

    public static void main(String[] args)
    {
        ArrayList<String> keys = new ArrayList<>();
        keys.add("ghost");
        keys.add("alien");
        keys.add("alien");
        keys.add("spiderman");
        keys.add("adiabatman");
        keys.add("scaryInversion");

        Integer[] values = { new Integer(1), new Integer(2), new Integer(100) };

        List<Integer> scaryKeysValues = Arrays.asList(values);
        ArrayList<Integer> scaryKeys = new ArrayList<Integer>(scaryKeysValues);

        keys.forEach(k -> System.out.println(k));

        keys.removeIf(k -> k.equalsIgnoreCase("alien"));

        GhostTest gt = new GhostTest();
        GhostTest.Point p1 = gt.new Point(1, 1);
        GhostTest.Point p2 = gt.new Point(new Integer(1), new Integer(1));

        if (p1.equals(p2))
            System.out.println("wow");
        else
        {
            System.out.println("aha");
        }
        TreeSet<GhostTest.Point> tp = new TreeSet<>();

        ArrayList<GhostTest.Point> points = new ArrayList<>();
        for (int index = 0; index < 5; ++index)
        {
            points.add(p1);
            tp.add(p1);
        }

        points.forEach(p -> System.out.println(p.getX()));

        tp.addAll(points);
        tp.forEach(p -> System.out.println(p.getX()));

    }
}
