public class Tester {
    public static void main(String[] args) {
        Point a = new Point(3, 4);
        Point b = new Point(9, 12);
        Point c = new Point(0, 0);
        Triangle x = new Triangle(a, b, c);
        System.out.println(a.distanceTo(b));
        System.out.println(a.equals(b));
        System.out.println(x.getPerimeter());
    }
}