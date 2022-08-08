import java.util.Vector;

class Vector1
{
	public static void main(String[] args)
	{
		System.out.println("n");

		Vector v = new Vector();
		Vector v2 = new Vector();

		System.out.println("n Capacity Of First Vector: " + v.capacity());

		String name = new String("Abijith");

		v.add(0);
		v.add("MR.");
		v.add(name);

		v.add(0,5);
		v.add(4,8);
		System.out.println("n Elements of First Vector : " + v);
		System.out.println("n Capacity Of First Vector : " + v.capacity());
		v.add(name);
		v.add(name);
		v.add(name);
		v.add(name);
		v.add(name);
		v.add(name);
		v.add(name);
		v.add(name);
		v.add(name);
		v.add(name);
		System.out.println("n Changed Capacity Of First Vector : " + v.capacity());

		v.add(name);
		v.add(name);
		v.add(name);
		v.add(name);
		v.add(name);
		v.add(name);
		v.add(name);
		v.add(name);
		v.add(name);
		v.add(name);
		v.add(name);
		System.out.println("n Changed Capacity Of First Vector : " + v.capacity());

		v2.add(0);
		v2.add("MR");
		v2.add(name);
		v2.add("Nadar");
		v2.add(9);
		System.out.println("n Elements of Second Vector : " + v2);
		v2.remove(1);
		System.out.println("n Elements of Second Vector : " + v2);
		System.out.println("n");
	}
}