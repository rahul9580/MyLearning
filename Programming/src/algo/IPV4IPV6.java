/**
 * 
 */
package algo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * @author rahul
 *
 */
public class IPV4IPV6 {
	private static Pattern		VALID_IPV4_PATTERN	= null;
	private static Pattern		VALID_IPV6_PATTERN	= null;
	private static final String	ipv4Pattern			= "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
	private static final String	ipv6Pattern			= "([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}";

	static {
		try {
			VALID_IPV4_PATTERN = Pattern.compile(ipv4Pattern, Pattern.CASE_INSENSITIVE);
			VALID_IPV6_PATTERN = Pattern.compile(ipv6Pattern, Pattern.CASE_INSENSITIVE);
		} catch (PatternSyntaxException e) {
			// logger.severe("Unable to compile pattern", e);
		}
	}

	public static boolean isIpV4(String ipAddress) {

		Matcher m1 = IPV4IPV6.VALID_IPV4_PATTERN.matcher(ipAddress);
		if (m1.matches()) {
			return true;
		}
		return false;
	}

	public static boolean isIpV6(String ipAddress) {
		Matcher m2 = IPV4IPV6.VALID_IPV6_PATTERN.matcher(ipAddress);
		if (m2.matches()) {
			return true;
		}
		return false;
	}

	static String[] checkIPs(String[] ip_array) {
		String[] output = new String[ip_array.length];
		int i = 0;
		for (String s : ip_array) {
			if (isIpV4(s)) {
				output[i] = "IPv4";
			} else if (isIpV6(s)) {
				output[i] = "IPv6";
			} else {
				output[i] = "Neither";
			}
			i++;
		}
		return output;
	}

	public static void main(String args[]) throws Exception {
		String[] s = { "123.234.12.3", "123.234.12.3.000.7465.a67d.23b4", "2001.0db8.0000.0000.0000.ff00.0042.8329" };
		String os[] = checkIPs(s);
		for (String ss : os) {
			System.out.println(ss);
		}
	}

}
