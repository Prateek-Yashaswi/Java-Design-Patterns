package Factory;

public class FactoryExec {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShapeObject("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShapeObject("square");
        shape2.draw();

        Shape shape3 = shapeFactory.getShapeObject("rectangle");
        shape3.draw();

        Shape shape4 = shapeFactory.getShapeObject("");
        if(shape4==null)
            System.out.println("Invalid Shape");
    }
}
