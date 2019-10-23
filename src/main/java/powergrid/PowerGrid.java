package powergrid;

import java.util.HashSet;
import java.util.Set;

public class PowerGrid {

	/**
	 * Given loads a, b, and c, at three power stations, is it possible to
	 * balance the load using the permitted operation?
	 *
	 * @param a
	 * the load at Power Station A, a >= 0
	 * @param b
	 * the load at Power Station B, b >= 0
	 * @param c
	 * the load at Power Station C, c >= 0
	 * @return true if load balancing is possible and false otherwise
	 */

	static Set<String> setOfAllValues = new HashSet<>();
	static int counter = 0;


	public static boolean canLoadBalance(int a, int b, int c) {
		setOfAllValues = new HashSet<>();
		boolean sentinel = balance(a,b,c);
		return sentinel;
	}

	public static boolean balance (int a, int b, int c) {
			String s = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);
			if (!setOfAllValues.contains(s)) {
				setOfAllValues.add(s);
				if (a == b && b == c) {
					return true;
				}

				if (c > a && c > b) {
						if (balance(a, b * 2, c - b)) {
							return true;
						}
						if (balance(a * 2, b, c - a)) {
							return true;
						}
				}

				if (a > b && a > c) {
						if (balance(a - b, b * 2, c)) {
							return true;
						}
						if (balance(a - c, b, c * 2)) {
							return true;
						}
				}

				if (b > a && b > c) {
						if (balance(a, b - c, c * 2)) {
							return true;
						}
						if (balance(a * 2, b - a, c)) {
							return true;
						}
				}
			}
			return false;
	}
}
