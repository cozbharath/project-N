package com.accessmodifier2;

import com.accessmodifier1.*;

public class AccessModifier4 extends AccessModifier1 {

	public static void main(String[] args) {
		AccessModifier4 t2 = new AccessModifier4();
		System.out.println(t2.a4);
		System.out.println(t2.name4);
		t2.method4();
	}

}
