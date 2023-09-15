package packageajay;

public class MethodArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Args a =new Args();
		a.hyd();
		a.add(2, 40);
		int f=a.sub(500, 100);
		System.out.println(f);

	}

}
class Args{
	public void hyd(){
		System.out.println("hyd");
	}
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
		
		public int sub(int d,int e) {
			int f=d-e;
			return f;
		
	}
}
