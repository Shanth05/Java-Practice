class A{
	int x;
	
	A(){
		this.x=100;
	}
	
	void getX(){
		System.out.println("Ax"+this.x);
	}
}

class B extends A{
	int y;
	
	B(){
		this.y=200;
	}
	
	void getY(){
		System.out.println("Bx"+this.y);
	}
}

class C extends B{
	int z;
	
	C(){
		this.z=300;
	}
	
	void getZ(){
		System.out.println("Cx"+this.z);
	}
}

public class MainABC{
	public static void main(String arge[]){
		
		C objB = new C();
		
		objB.getX();
		objB.getY();
		objB.getZ();
	}
}