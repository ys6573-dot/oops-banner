public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC6: Invoking static helper methods during array declaration
        String[] banner = {
            getLine(0), getLine(1), getLine(2), getLine(3), getLine(4), getLine(5), getLine(6)
        };

        // UC6: Loop-based rendering
        for (String row : banner) {
            System.out.println(row);
        }
    }

    // Static helper method to build patterns for each row (0-6)
    public static String getLine(int row) {
        String o = getO(row);
        String p = getP(row);
        String s = getS(row);
        return String.join("   ", o, o, p, s);
    }

    public static String getO(int row) {
        if (row == 0 || row == 6) return "****";
        return "* *";
    }

    public static String getP(int row) {
        if (row == 0 || row == 3) return "****";
        if (row < 3) return "* *";
        return "* ";
    }

    public static String getS(int row) {
        if (row == 0 || row == 3 || row == 6) return "****";
        if (row < 3) return "* ";
        return "   *";
    }
}
