package com.vivekjaiswal;

public class RecordPatternsExample {

    record Rectangle(int width, int height) {}

    static int area(int width, int height) {
        return width * height;
    }

    public static void main(String[] args) {
        Object obj = new Rectangle(3, 5);

        // Before Java 21
        if (obj instanceof Rectangle rect) {
            int area = area(rect.width, rect.height);
            System.out.println(area);
        }

        // After Java 21
        if (obj instanceof Rectangle(int width, int height)) {
            int area = area(width, height);
            System.out.println(area);
        }
    }

}
