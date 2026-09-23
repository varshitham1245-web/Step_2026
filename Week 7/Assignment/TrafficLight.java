public class TrafficLight {
    private final String id;
    private String color = "RED";

    public TrafficLight(String id) {
        this.id = id;
    }

    public String next() {
        if (color.equals("RED")) {
            color = "GREEN";
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
        } else if (color.equals("YELLOW")) {
            color = "RED";
        }
        return color;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");
        System.out.println("Initial color: " + t.getColor());
        System.out.println("next(): " + t.next());
        System.out.println("next(): " + t.next());
        System.out.println("next(): " + t.next());
        System.out.println("next(): " + t.next());
    }
}
