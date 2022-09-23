public class Runner {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(150, 200);
        Rectangle s = new Rectangle(100);
        Rectangle d = new Rectangle();
        r.setWidth(125);
        s.setLength(125);
        d.setWidth(125);

        int totalPerimeter = s.perimeter() + r.perimeter() + d.perimeter();
        System.out.println(totalPerimeter + " Feet");

        int totalArea = s.calculateArea() + r.calculateArea() + d.calculateArea();
        System.out.println(totalArea + " Square Feet");
    }
}
