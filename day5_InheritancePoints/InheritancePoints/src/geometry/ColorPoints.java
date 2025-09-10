package geometry;

public class ColorPoints extends Points {

    private String color;
    private static final String[] VALID_COLORS = {"red", "green", "blue", "yellow", "black", "white"};

    public ColorPoints(int x, int y, String color) {
        super(x, y);
        if (isValidColor(color)) {
            this.color = color.toLowerCase();
        } else {
            this.color = "black"; // default if invalid
        }
    }

    private boolean isValidColor(String c) {
        if (c == null) return false;
        String lower = c.toLowerCase();
        for (int i = 0; i < VALID_COLORS.length; i++) {
            if (VALID_COLORS[i].equals(lower)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void display() {
        System.out.println("ColorPoint: " + super.toString() + " Color: " + color);
    }

    @Override
    public String toString() {
        return super.toString() + " - " + color;
    }
}
