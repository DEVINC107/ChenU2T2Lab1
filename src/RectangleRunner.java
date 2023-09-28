public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle a = new Rectangle(150, 200);
        Rectangle b = new Rectangle(125);
        Rectangle c = new Rectangle();

        a.setWidth(75);
        b.setLength(75);
        b.setWidth(75);
        c.setWidth(75);

        System.out.println("These three plots requires " + (a.calculateArea() + b.calculateArea() + c.calculateArea()) + " square feet of land");
    }
}
