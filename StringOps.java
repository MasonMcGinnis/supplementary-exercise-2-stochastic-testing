package edu.pitt.cs;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StringOps {

	private static final Map<String, String> TAG_PAIRS = new HashMap<>();

    static {
        TAG_PAIRS.put("<b>", "</b>");
        TAG_PAIRS.put("<i>", "</i>");
    }

	/**
	 * Compares strings s1 and s2, and returns true if they are identical, false if
	 * different.
	 * 
	 * @param s1 First string
	 * @param s2 Second string
	 * @return Whether s1 and s2 are identical
	 */
	public static boolean equals(String s1, String s2) {
		// TODO: Fix bug!
		/*for (int i = 0; i < Integer.min(s1.length(), s2.length()); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
		*/
		return s1.equals(s2);
	}


	/**
	 * Checks whether string s is in valid HTML format. Valid HTML is composed of
	 * nested HTML tags. In this method, we only check for <b> tags and <i> tags.
	 * Specifically if each <b> tag is matched by a corresponding </b> tag and each
	 * <i> tag is matched by a corresponding </i> tag.
	 * 
	 * @param s String containing HTML page
	 * @return Whether s is in valid HTML format (with matching <b> and <i> tags)
	 */
	public static boolean isValidHTML(String s) {
		// TODO: Fix bug!
	     Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            for (Map.Entry<String, String> entry : TAG_PAIRS.entrySet()) {
                String openingTag = entry.getKey();
                String closingTag = entry.getValue();

                if (s.startsWith(openingTag, i)) {
                    stack.push(openingTag);
                } else if (s.startsWith(closingTag, i)) {
                    if (stack.empty() || !stack.pop().equals(openingTag)) {
                        return false;
                    }
                }
            }
        }

        return stack.empty();
    }
}
