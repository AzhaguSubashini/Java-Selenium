package week1.day1.assignment;

public class ChangeOddIndex {

	public static void main(String[] args) {
		String test = "changeme";
	        StringBuffer strNew = new StringBuffer();
	        for (int i = 0; i < test.length(); i++) {
	            if (i % 2 == 0) {
	                strNew.append(Character.toLowerCase(test.charAt(i)));
	            } else {
	                strNew.append(Character.toUpperCase(test.charAt(i)));
	            }
	        }
	        System.out.println(strNew);
	    }
	

	}


