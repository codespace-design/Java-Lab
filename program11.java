public class program11 {
    static class Box {
        int length;
        int breadth;
        int height;

        Box(int length, int breadth, int height) {
            this.length = length;
            this.breadth = breadth;
            this.height = height;
        }

        int volume() {
            return length * breadth * height;
        }
    }

    static void largerBox(Box box1, Box box2) {
        if (box1.volume() > box2.volume()) {
            System.out.println("Larger Box Volume = " + box1.volume());
        } else {
            System.out.println("Larger Box Volume = " + box2.volume());
        }
    }

    public static void main(String[] args) {
        Box box1 = new Box(3, 4, 5);
        Box box2 = new Box(5, 4, 6);

        largerBox(box1, box2);
    }
}
