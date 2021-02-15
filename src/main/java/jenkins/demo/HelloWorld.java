package jenkins.demo;

public class HelloWorld {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if (args.length == 2) {
			try {
				int i = Integer.parseInt(args[0]);
				int j = Integer.parseInt(args[1]);

				System.out.println("Sum of two number:" + addTwoNum(i, j));
			} catch (Exception e) {
				// TODO: handle exception
				throw e;
			}
		}

	}

	public static int addTwoNum(int i, int j) {
		return i + j;
	}

	public static int subTwoNum(int i,int j) {
		if(i>j)	return i-j;
		else return j-i;
	}

}
