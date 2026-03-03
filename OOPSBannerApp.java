public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC7: Using the Inner Class to retrieve and display the banner
        CharacterPatternMap map = new CharacterPatternMap();
        
        // Use StringBuilder for efficient horizontal banner construction
        StringBuilder banner = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            banner.append(map.getPattern('O', i)).append("   ")
                  .append(map.getPattern('O', i)).append("   ")
                  .append(map.getPattern('P', i)).append("   ")
                  .append(map.getPattern('S', i)).append("\n");
        }
        System.out.print(banner.toString());
    }

    /**
     * UC7: Static Inner Class for centralized pattern management.
     * Adheres to the Single Responsibility Principle and Abstraction.
     */
    static class CharacterPatternMap {
        // Method to retrieve the pattern for a specific character and row
        public String getPattern(char character, int row) {
            switch (character) {
                case 'O': return (row == 0 || row == 6) ? "****" : "* *";
                case 'P':
                    if (row == 0 || row == 3) return "****";
                    return (row < 3) ? "* *" : "* ";
                case 'S':
                    if (row == 0 || row == 3 || row == 6) return "****";
                    return (row < 3) ? "* " : "   *";
                default: return "    ";
            }
        }
    }
}