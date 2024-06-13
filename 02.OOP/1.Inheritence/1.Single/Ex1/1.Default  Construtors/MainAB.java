class A {
    int x;

    A() {
        this.x = 10;
    }

    void getX() {
        System.out.println("Ax " + this.x);
    }
}

class B extends A {
    int y;

    B() {
        this.y = 5;
    }

    void getY() {
        System.out.println("By " + this.y);
    }
}

public class MainAB {
    public static void main(String[] args) {
        B objB = new B();
        objB.getX();
        objB.getY();
    }
}
