public class Unit3_1Demo{
    public static void main(String[] args){


        String n1 = new String("Tori");
    	String n2 = new String("Tori");
    	String n3 = n2;
    	System.out.println(n1 == n2);
    	System.out.println(n2 == n3);
    	System.out.println(n1 == n3);
    // For strings, it’s best if we use the equals method:
	    System.out.println(n1.equals(n2));
    }
}