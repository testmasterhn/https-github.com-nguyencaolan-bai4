
public class MyTriangle {
	
	int canh1;
	int canh2;
	int canh3;
	
	public MyTriangle () {
		
	}
	
	public MyTriangle (int canh1, int canh2, int canh3) {
		
		this.canh1 = canh1;
		this.canh2 = canh2;
		this.canh3 = canh3;
		
	}
	
	public  boolean IsTriangle(int canh1, int canh2, int canh3) {
		
		if (canh1 < 0 ) {
			System.out.println("Không phai là tam giac");
			}
		if (canh2 < 0 ) {
			System.out.println("Không phai là tam giac");
		}
		if (canh3 < 0 ) {
			System.out.println("Không phai là tam giac");
		}
		
		return false;
		
	
	}
	
	public boolean IsIsoscelesTriangle() {
		boolean result = true;
		
		if (canh1 == canh2 && canh2 ==canh3 || canh1 == canh3 && canh2 == canh3 || canh2 == canh3 && canh3==canh1) {
		System.out.println("Tam giác cân");
			
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
	
		int canh1 = 0;
		int canh2 = 20;
		int canh3 = 40;
		
		int chuvi = canh1 + canh2+ canh3;
		
		System.out.println(chuvi);
		
		
		
	}
	
	
		
}
	

