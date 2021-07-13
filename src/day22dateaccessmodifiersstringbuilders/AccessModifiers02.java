package day22dateaccessmodifiersstringbuilders;

import day20arraylists.AccessModifiers03;

public class AccessModifiers02 {

	public static void main(String[] args) {
		
		/*To access any class member from another class there are 2 ways
		 * 1-'Call by class name' =>static must be used 
		 * 2- By object
		 * 
		 2-if a class member is private, we cannot access it from different class. 
		 
		 */
			
		AccessModifiers01 obj1 = new AccessModifiers01();
		
		System.out.println(obj1.name);
		
		System.out.println(obj1.schoolName);
		
		AccessModifiers03 obj2 = new AccessModifiers03();
		
		System.out.println(obj2.lName);
			
	}

}
