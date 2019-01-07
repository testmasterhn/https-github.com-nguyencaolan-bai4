public class MyExample
{

 class MyTriangle {
	
	public int canh1;
	public int canh2;
	public int canh3;
	
	/*Constructor */
	public MyTriangle () {
		
	}
	
	public MyTriangle (int canh1, int canh2, int canh3) {
		
		this.canh1 = canh1;
		this.canh2 = canh2;
		this.canh3 = canh3;
		
	}
	/*End constructor*/
	
	public  boolean IsTriangle(int canh1, int canh2, int canh3) {
		/*
		if (canh1 < 0 ) {
			System.out.println("Không phai là tam giac");
			}
		if (canh2 < 0 ) {
			System.out.println("Không phai là tam giac");
		}
		if (canh3 < 0 ) {
			System.out.println("Không phai là tam giac");
		}
		
		return false;*/
		
		if(canh1==0 || canh2==0 || canh3==0)
			return false;
		
		if((canh1 + canh2 > canh3) && (canh1+ canh3 > canh2) && (canh2+canh3>canh1))
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	
	public boolean IsIsoscelesTriangle() {
		/*
		boolean result = true;
		
		if (canh1 == canh2 && canh2 ==canh3 || canh1 == canh3 && canh2 == canh3 || canh2 == canh3 && canh3==canh1) {
		System.out.println("Tam giác cân");
			
		}
		
		return result;
		*/
		//ĐK để 3 số là 3 cạnh của tam giác cân là gì?
		//1. Là phải là 3 cạnh của tam giác
		boolean isTriangle = this.IsTriangle(this.canh1, this.canh2, this.canh3);
		if(isTriangle==true)
		{
			//2. Nó có 2 cạnh bằng nhau
			if(this.canh1 == this.canh2 || this.canh1==this.canh3 || this.canh2==this.canh3)
			{
				return true;
			}
			return false;
		}
		else
		{
			return false;
		}
	}
		
   }

	//Test
   @Test
   public void Test_IsTriangle()
   {
	   
	   //Arange - Giả thiết (dữ liệu, kịch bản v.v...)
	   MyTriangle  myTrig = new MyTriangle();
	   
	   //Action - Gọi xử lý để lấy kết quả
	   boolean result = myTrig.IsTriangle(3,5,7)
	   
	   //Assertion - Kiểm tra két quả thu được có phù hợp với giả thiết không?
	   Assert.assertEquals(true, result);
	   
   }
	
   @Test
   public void Test_IsIsoscelesTriangle()
   {
	   //Arrange
	   MyTriangle  myTrig = new MyTriangle(3,3,4);
	   
	   //Action
	   boolean result = myTrig.IsIsoscelesTriangle();
	   
	   //Assertion
	   Assert.assertEquals(true, result);
   }
}

