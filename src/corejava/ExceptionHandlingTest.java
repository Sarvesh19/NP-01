package corejava;

public class ExceptionHandlingTest {

	// All catch blocks must be ordered from most specific to most general. If
	// you
	// have a catch clause for both IOException and Exception, you must put
	// the catch for IOException first in your code. Otherwise, the IOException
	// would be caught by catch(Exception e), because a catch argument can
	// catch the specified exception or any of its subtypes! The compiler will
	// stop
	// you from defining catch clauses that can never be reached.
	private int i = 0;

	void m1() {
		i++;
		if (i > 1) {
			throw new UserDefinedException("Please call this method only once");
		}
	}

	public static void main(String[] args) {
		ExceptionHandlingTest exceptionHandlingTest  = new ExceptionHandlingTest();
		int i = exceptionHandlingTest.checkExceptionTest(exceptionHandlingTest);
		System.out.println("wooo i "+ i);
		
		

	}
	
	int checkExceptionTest(ExceptionHandlingTest exceptionHandlingTest){
		try {
			//System.exit(0);

			exceptionHandlingTest.m1();
			exceptionHandlingTest.m1();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("hello final");
			//return 0;
		}
		return 0;
	}
}
