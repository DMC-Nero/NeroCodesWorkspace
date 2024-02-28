package qedge_class;

public class StaticMember_Access {
	public static void main(String[] args) {
		System.out.println("main started");

		StaticMember_Access s1 = new StaticMember_Access();
		s1.fun1();
		System.out.println("============");

		fun2();
		System.out.println("============");
		s1.fun2();
		System.out.println("============");
		StaticMember_Access.fun2();
		System.out.println("============");

		StaticMember_Acess s3 = new StaticMember_Acess();
		s3.m1();
		System.out.println("============");
		StaticMember_Acess.m1();
		System.out.println("============");

		StaticMember_Acess s4 = new StaticMember_Acess();
		s4.m2();

		System.out.println("main ended...");
	}

	public void fun1() {
		System.out.println("fun1 started");

//		System.out.println(universityName);		//directly not possible
//		placementDrive();						//directly not possible

		StaticMember_Acess s1 = new StaticMember_Acess();
		System.out.println(s1.universityName);
		s1.placementDrive();

		System.out.println(StaticMember_Acess.universityName);
		StaticMember_Acess.placementDrive();

		System.out.println("fun1 ended....");
	}

	public static void fun2() {
		System.out.println("fun2 started");

//		System.out.println(universityName);		//directly not possible
//		placementDrive();						//directly not possible

		StaticMember_Acess s1 = new StaticMember_Acess();
		System.out.println(s1.universityName);
		s1.placementDrive();

		System.out.println(StaticMember_Acess.universityName);
		StaticMember_Acess.placementDrive();

		System.out.println("fun2 ended....");
	}

}

class StaticMember_Acess {

	static String universityName = "NERO";

	public static void placementDrive() {
		System.out.println("placementDrive loaded");
	}

	public static void m1() {
		System.out.println("m1 started");

		System.out.println(universityName);
		placementDrive();

		StaticMember_Acess s1 = new StaticMember_Acess();
		System.out.println(s1.universityName);
		s1.placementDrive();

		System.out.println(StaticMember_Acess.universityName);
		StaticMember_Acess.placementDrive();

		System.out.println("m1 ended....");
	}

	public void m2() {
		System.out.println("m2 started");

		System.out.println(universityName);
		placementDrive();

		StaticMember_Acess s1 = new StaticMember_Acess();
		System.out.println(s1.universityName);
		s1.placementDrive();

		System.out.println(StaticMember_Acess.universityName);
		StaticMember_Acess.placementDrive();

		System.out.println("m2 ended...");

	}

}