package qedge_class;

public class AutoBoxing_Unboxing {

	public static void main(String[] args) {
		int x = 10;
		Integer i1 =x;						//Auto-boxing	//Integer.valueOf(x)
		int unboxedValue =i1;				//Auto-unboxing //i1.intValue()
		System.out.println(unboxedValue);
		
		boolean flag = true;				//Auto-Boxing	//Boolean.valueOf(flag)
		Boolean b1 = flag;					//Auto-unboxing //b1.booleanValue();
		
		boolean unboxedBooleanValue = b1;
		System.out.println(unboxedBooleanValue);
	}

}

//note - Auto-boxing is internally implemented through the valueOf() method
// & auto-unboxing is internally implemented through the xxxvalue()