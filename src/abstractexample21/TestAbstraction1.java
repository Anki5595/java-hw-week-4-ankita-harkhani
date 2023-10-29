package abstractexample21;

public class TestAbstraction1 {
    //in real scenario, method is called by programmer or user
    public static void main(String[] args) {
        Shape s = new Circle(); //In a real scenario, object is provided through method, e.g. getShape() method
        s.draw();
    }
}
