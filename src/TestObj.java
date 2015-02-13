public class TestObj {
	private String a;

	/**
	 * Initializes the instance variable to 'a'
	 */
	public TestObj() {
		a = "a";
	}

	/**
	 * Returns A
	 * @return
	 */
	public String getA() {
		return a;
	}

	/**
	 * This method, should never be called since it is private and is never
	 * called in this class...Right???
	 * 
	 * @param a
	 */
	private void setA(String a) {
		this.a = a;
	}
}
