class A {
    int x;

    A(int x) {
        this.x = x;
    }

    void getX() {
        System.out.println("Ax " + this.x);
    }
}

class B extends A {
    int y;

    B(int y,int x) {
        super(x);
        this.y = y;
    }

    void getY() {
        System.out.println("By " + this.y);
    }
}

public class MainAB {
    public static void main(String[] args) {

        B objB = new B(100,200);
        objB.getX();
        objB.getY();
    }
}
