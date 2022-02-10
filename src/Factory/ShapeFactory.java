package Factory;

public class ShapeFactory {
    public Shape getShapeObject(String input){
        if(input.equalsIgnoreCase("square"))
            return new Square();

        else if(input.equalsIgnoreCase("circle"))
            return new Circle();

        else if(input.equalsIgnoreCase("rectangle"))
            return new Rectangle();

        return null;
    }
}
