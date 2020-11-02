public class Tester {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(6, 0);
        Point c = new Point(3, 6);
        Triangle x = new Triangle(a, b, c);
        System.out.println(a.distanceTo(b));
        System.out.println(a.equals(b));
        System.out.println(x.getPerimeter());
        System.out.println(x.getArea());
        System.out.println(x.classify());
    }
}