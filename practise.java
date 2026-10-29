class practise {
    public void draw() {
        System.out.println("drawing a shape");
    }

    public void erase() {
        System.out.println("erasing a shape");
    }
}

class Circle extends practise {
    @Override
    public void draw() {
        System.out.println("drawing a circle");
    }

    @Override
    public void erase() {
        System.out.println("erasing a circle");
    }
}

class Triangle extends practise {
    @Override
    public void draw() {
        System.out.println("drawing a triangle");
    }

    @Override
    public void erase() {
        System.out.println("erasing a triangle");
    }
}

class Square extends practise
 {
    @Override
    public void draw() {
        System.out.println("drawing a square");
    }

    @Override
    public void erase() {
        System.out.println("erasing a square");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Triangle t = new Triangle();
        Square s = new Square();

        System.out.println("Using circle object");
        c.draw();
        c.erase();

        System.out.println("Using triangle object");
        t.draw();
        t.erase();

        System.out.println("Using square object");
        s.draw();
        s.erase();
    }
}  
  
    

