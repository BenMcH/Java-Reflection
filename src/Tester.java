import java.lang.reflect.Method;

public class Tester {
	public static void main(String[] args) {
		TestObj obj = new TestObj();
		System.out.println(obj.getA());// a
		Method a = null;
		try {
			a = obj.getClass().getDeclaredMethod("setA", String.class); //Initialize the Method object with the setA method
			if (!a.isAccessible())
				a.setAccessible(true); //Make sure that it is callable even if it is protected/private 
			a.invoke(obj, "Reflection can be a scary thing"); //Call the method
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(obj.getA()); // Reflection can be a scary thing
	}
}
