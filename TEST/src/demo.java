

	public class demo extends abc{
		public static void main(String args[]){
			demo d = new demo();
			int res = d.addition(5,10);
			System.out.println(res);
			//d.substraction(5,10);
		}

		@Override
		int addition(int a, int b) {
			int c = a+b;
			return c;
		}
	}

