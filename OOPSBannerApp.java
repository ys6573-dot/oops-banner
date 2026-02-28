public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC5: Combined declaration and initialization in a single statement
        String[] banner = {
            String.join("   ", "****", "****", "****", "****"),
            String.join("   ", "* *", "* *", "* *", "* "),
            String.join("   ", "* *", "* *", "* *", "* "),
            String.join("   ", "* *", "* *", "****", "****"),
            String.join("   ", "* *", "* *", "* ", "   *"),
            String.join("   ", "* *", "* *", "* ", "   *"),
            String.join("   ", "****", "****", "* ", "****")
        };

        // UC5: Enhanced for-loop for efficient rendering
        for (String row : banner) {
            System.out.println(row);
        }
    }
}
