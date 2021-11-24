// Testig things

public class Main {
	
	public static void main(String args[]) {
		System.out.println("________________Class___________________________");
		System.out.println(OuterClass.var1);
		OuterClass.tmp1();
		System.out.println("----------------Object--------------------------");
		OuterClass obj = new OuterClass();
		System.out.println(obj.var1);
		System.out.println(obj.var2);
		obj.tmp1();
		obj.tmp2();
		System.out.println("----------StaticNestedClass Class---------------");
		System.out.println(OuterClass.StaticNestedClass.nestedClassVar1);
		OuterClass.StaticNestedClass.nestedClassTmp1();
		System.out.println("----------StaticNestedCLass Object--------------");
		OuterClass.StaticNestedClass obj1 = new OuterClass.StaticNestedClass();
		System.out.println(obj1.nestedClassVar1);
		System.out.println(obj1.nestedClassVar2);
		obj1.nestedClassTmp1();
		obj1.nestedClassTmp2();
		System.out.println("----------InnerClass Class----------------------");
		System.out.println(OuterClass.InnerClass.innerVar1);
		System.out.println("----------InnerClass Object---------------------");
		OuterClass.InnerClass obj2 = new OuterClass().new InnerClass();
		System.out.println(obj2.innerVar1);
		System.out.println(obj2.innerVar2);
		obj2.innerTmp2();

	}
}

class OuterClass {

	public OuterClass() {
		System.out.println("OuterClass constructor");
	}
	
	public static String var1 = "OuterClass static field";
	public String var2 = "OuterClass simple field";

	public static void tmp1() {
		System.out.println("OuterClass static method");
	}

	public void tmp2() {
		System.out.println("Outerclass simple method");
	}

	public static class StaticNestedClass implements ITest {

		public StaticNestedClass() {
			System.out.println("StaticNestedClass constructor");
		}

		public static String nestedClassVar1 = "StaticNestedClass static field";
		public String nestedClassVar2 = "StaticNestedClass simple field";

		public static void nestedClassTmp1() {
			System.out.println("StaticNestedClass static method "+var1);
			tmp1();
		}
		public void nestedClassTmp2() {
			System.out.println("StaticNestedClass simple method "+var1);
			tmp1();
		}
	}

	public class InnerClass {

		public InnerClass() {
			System.out.println("InnerClass constructor");
		}

		public static final String innerVar1 = "InnerClass static field";
		public String innerVar2 = "InnerClass simple field";

		public void innerTmp2() {
			System.out.println("InnerClass simple method "+var1+" "+var2+" "+StaticNestedClass.nestedClassVar1+" "+new StaticNestedClass().nestedClassVar2);
			tmp1();
			tmp2();
			StaticNestedClass.nestedClassTmp1();
			new StaticNestedClass().nestedClassTmp2();
		}
	}
}

interface ITest {}
