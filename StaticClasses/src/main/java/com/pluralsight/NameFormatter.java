package com.pluralsight;

public class NameFormatter {

    private NameFormatter() {
    }

    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String format(String prefix, String firstName, String middleName,
                                String lastName, String suffix) {
        StringBuilder sb = new StringBuilder();
        sb.append(lastName).append(", ");

        if (!prefix.isEmpty()) {
            sb.append(prefix).append(" ");
        }

        sb.append(firstName);

        if (!middleName.isEmpty()) {
            sb.append(" ").append(middleName);
        }

        sb.append(", ").append(suffix);

        return sb.toString();
    }

    public static String format(String fullName) {
        String[] parts = fullName.split(",", 2);
        String namePart = parts[0].trim();
        String suffix = parts.length > 1 ? parts[1].trim() : "";

        String[] nameTokens = namePart.split(" ");
        String prefix = "";
        String firstName = "";
        String middleName = "";
        String lastName = "";

        if (nameTokens.length == 4) {
            firstName = nameTokens[0];
            prefix = nameTokens[1];
            middleName = nameTokens[2];
            lastName = nameTokens[3];
        } else if (nameTokens.length == 3) {
            firstName = nameTokens[0];
            middleName = nameTokens[1];
            lastName = nameTokens[2];
        } else if (nameTokens.length == 2) {
            firstName = nameTokens[0];
            lastName = nameTokens[1];
        }

        return format(prefix, firstName, middleName, lastName, suffix);
    }

}
