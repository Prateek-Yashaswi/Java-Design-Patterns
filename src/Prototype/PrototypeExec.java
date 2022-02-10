package Prototype;

public class PrototypeExec {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println(clonedShape.getId()+": "+clonedShape.getType());
        clonedShape.draw();

        Shape clonedSquare = (Shape) ShapeCache.getShape("2");
        System.out.println(clonedSquare.getId()+": "+clonedSquare.getType());
        clonedSquare.draw();
    }
}
