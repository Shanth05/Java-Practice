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

class C extends A {
    int z;

    C() {
        this.z = 15;
    }

    void getZ() {
        System.out.println("Cz " + this.z);
    }
}

public class Main{
    public static void main(String[] args) {
        B objB = new B();
        C objC = new C();
        
        objB.getX();
        objB.getY();
        
        objC.getX();
        objC.getZ();
    }
}
