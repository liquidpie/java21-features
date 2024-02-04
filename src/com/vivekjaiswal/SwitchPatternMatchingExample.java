package com.vivekjaiswal;

public class SwitchPatternMatchingExample {

    public static void main(String[] args) {
        // Before Java 21
        String before = formatBefore(21);
        System.out.println(before);
        // After Java 21
        String after = formatAfter(21);
        System.out.println(after);
    }

    static String formatBefore(Object obj) {
        String value = "unknown";
        if (obj instanceof Integer val) {
            value = String.format("Type: int, Value: %d", val);
        } else if (obj instanceof Long val) {
            value = String.format("Type: long, Value: %d", val);
        } else if (obj instanceof Double val) {
            value = String.format("Type: double, Value: %f", val);
        } else if (obj instanceof String val) {
            value = String.format("Type: string, Value: %s", val);
        }
        return value;
    }

    static String formatAfter(Object obj) {
        return switch (obj) {
            case Integer val -> String.format("Type: int, Value: %d", val);
            case Long val -> String.format("Type: long, Value: %d", val);
            case Double val -> String.format("Type: double, Value: %f", val);
            case String val -> String.format("Type: string, Value: %s", val);
            default -> "unknown";
        };
    }

}
