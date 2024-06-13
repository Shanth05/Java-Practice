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

    B(int x, int y) {
        super(x); // Call the constructor of class A with parameter x
        this.y = y;
    }

    void getY() {
        System.out.println("By " + this.y);
    }
}

class C extends A {
    int z;

    C(int x, int z) {
        super(x); // Call the constructor of class A with parameter x
        this.z = z;
    }

    void getZ() {
        System.out.println("Cz " + this.z);
    }
}

public class Main {
    public static void main(String[] args) {
        B objB = new B(100, 200);
        C objC = new C(300, 400);

        objB.getX();
        objB.getY();

        objC.getX();
        objC.getZ();
    }
}
