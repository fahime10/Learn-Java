package main;
import lib.Node;
import lib.LinkedList;

public class RecursionFun {

	public static void main(String[] args){
		System.out.println("Question 1 ----------");
		int answer = factorial(7);
		System.out.println("The final answer is: "+ answer);
		System.out.println("----------End of factorial--------");
		
		System.out.println("Question 2 ----------");
		int answer2 = calculate(5);
		System.out.println("Calculate method returned "+answer2);
		
		System.out.println("Question 3------------");
		System.out.println(doubled("Hello"));
		System.out.println(doubleBack("Hello"));
		
		Node<String> n4 = new Node<>("green", null);
		Node<String> n3 = new Node<>("orange", n4);
		Node<String> n2 = new Node<>("blue", n3);
		Node<String> n1 = new Node<>("red", n2);

		System.out.println("Question 4---------");
		LinkedList<String> list = new LinkedList<>(n1);
		printNodes(list.getHead());
		
		System.out.println("Question 5 -------");
		
		Node<Integer>  m4 = new Node<>(14, null);
		Node<Integer>  m3 = new Node<>(45, m4);
		Node<Integer>  m2 = new Node<>(24, m3);
		Node<Integer>  m1 = new Node<>(24, m2);
		
		boolean areLower = areAnyLower(m1, 23);
		System.out.println(areLower);
		
		System.out.println("Question 6 ----------");
		
		Node<Integer>  l4 = new Node<>(14, null);
		Node<Integer>  l3 = new Node<>(100, l4);
		Node<Integer>  l2 = new Node<>(24, l3);
		Node<Integer>  l1 = new Node<>(51, l2);
		
		boolean allLower = areAllLower(l1, 190);
		System.out.println(allLower);
	}

	/** This method computes the factorial of a given number (n!).
	 * 
	 * @param num - The number.
	 * @return - The factorial of the given number as an int.
	 */
	public static int factorial(int num){
		System.out.println("Factorial started for num="+num);
		
		if (num == 0){
			System.out.println("End of recursion. Returning 1.");
			return 1;
		}
		
		System.out.println("Calling factorial for num="+(num-1));
		
		int rest = factorial(num-1);
		
		System.out.println("Method returned: "+rest);
		System.out.println("Multiplying "+num+" by "+rest+" and returning "+(num*rest));
		
		return num * rest;
	}

	/**  This method calculates something.
	 *   You need to figure out what it calculates.
	 * @param n - an integer.
	 * @return - an integer.
	 */
	public static int calculate(int n){
		if (n == 1){
			return 1;
		}
		return n * n * calculate(n-1);
	}

	/** This method does something with a given String.
	 *  You need to figure out what it does.
	 * @param str -  The given String.
	 * @return - a String.
	 */
	public static String doubled(String str){
		if (str.length() == 0){
			return "";
		}
		String str2 = str.charAt(0) + "" + str.charAt(0) + "" + doubled(str.substring(1));   
		return str2;
	}
	// when substring 1 is used by doubled(), the chatAt(0) looks at a new string without the previous character and so on.
	
	
	public static String doubleBack(String str) {
		if(str.length() == 0) {
			return "";
		}
		String str2 = str.charAt(str.length()-1) + "" + str.charAt(str.length()-1) + "" + doubleBack(str.substring(0, str.length()-1));
		return str2;
	}

	/** This method prints all the items of the nodes in the list 
	 *  starting from the given node.
	 * @param n - The start node of the list.
	 */
	public static void printNodes(Node<String> n){
		if (n != null) {
		     System.out.println(n.getItem());
		     printNodes(n.next());
		     System.out.println(n.getItem());
		}
	}

	/** This method returns true if any nodes in the linked list
	 * starting from the given node have a value lower than the given 
	 * value and false otherwise.
	 * @param n  - The start node of the list.
	 * @param value - The value to be used.
	 * @return - True or false as stated above.
	 */
	public static boolean areAnyLower(Node<Integer> n, int value){
		if(n == null) {
			return false;
		}
		if(n.getItem() < value) {
				return true;
			}
			return areAnyLower(n.next(), value);
	}
	
	
	
	public static boolean areAllLower(Node<Integer> n, int value) {
		if(n == null) {
			return true;
		}
		
		if(n.getItem() > value) {
		    return false;
		    }
		
		return areAllLower(n.next(), value);
	}

}
