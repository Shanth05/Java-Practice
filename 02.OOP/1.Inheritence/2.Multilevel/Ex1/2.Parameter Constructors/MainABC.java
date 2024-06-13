class A{
	int x;
	
	A(int x){
		this.x=x;
	}
	
	void getX(){
		System.out.println("Ax"+this.x);
	}
}

class B extends A{
	int y;
	
	B(int x,int y){
		super(x);
		this.y=y;
	}
	
	void getY(){
		System.out.println("Bx"+this.y);
	}
}

class C extends B{
	int z;
	
	C(int x,int y,int z){
		super(x,y);
		this.z=z;
	}
	
	void getZ(){
		System.out.println("Cx"+this.z);
	}
}

public class MainABC{
	public static void main(String arge[]){
		
		C objB = new C(100,200,300);
		
		objB.getX();
		objB.getY();
		objB.getZ();
	}
}