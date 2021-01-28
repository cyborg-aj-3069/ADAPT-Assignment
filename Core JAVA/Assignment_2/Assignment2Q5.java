class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
        String d = "Rectangle Drawn";
        return d;
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
         String d = "Line Drawn";
        return d;
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
        String d = "Cube Drawn";
        return d;
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) {}
}