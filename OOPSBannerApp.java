import java.util.HashMap;
import java.util.Map;

/**
 * UC8: Use Map for Character Patterns and Render via Function
 * Final stage of the OOPS Banner App using advanced Java Collections.
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC8: Initialize pattern storage using HashMap
        Map<Character, String[]> patternMap = new HashMap<>();
        
        // Populate the map with 7-line patterns for each character
        patternMap.put('O', new String[]{"**** ", "* * ", "* * ", "* * ", "* * ", "* * ", "**** "});
        patternMap.put('P', new String[]{"**** ", "* * ", "* * ", "**** ", "* ", "* ", "* "});
        patternMap.put('S', new String[]{"**** ", "* ", "* ", "**** ", "   * ", "   * ", "**** "});

        // Assemble and render the final banner word "OOPS"
        renderBanner("OOPS", patternMap);
    }

    /**
     * Renders the word horizontally using nested loops.
     * Separates pattern storage from display logic.
     */
    public static void renderBanner(String word, Map<Character, String[]> map) {
        for (int i = 0; i < 7; i++) { // Loop through each row
            StringBuilder rowOutput = new StringBuilder();
            for (char c : word.toCharArray()) { // Loop through each character in the word
                if (map.containsKey(c)) {
                    rowOutput.append(map.get(c)[i]).append("  "); // Add 2-space padding
                }
            }
            System.out.println(rowOutput.toString());
        }
    }
}