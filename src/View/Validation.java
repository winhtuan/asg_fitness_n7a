package View;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Validation {

    private Scanner sc = new Scanner(System.in);
    /**
     * Cách Dùng
     * Type int: int value = valid.getValue("Enter the value: ", Integer.class);
     * Type double: double value = valid.getValue("Enter the value: ", Double.class);
     * @param msg 
     * @param type
     * @return 
     */
    public <T> T getValue(String msg, Class<T> type) { 
        while (true) {
            try {
                System.out.print(msg);
                String input = sc.nextLine().trim();
                if (input.isEmpty()) {
                    throw new IllegalArgumentException("Error: Input can't be empty!");
                }
                if (input.matches(".*[a-zA-Z].*")) {
                    throw new IllegalArgumentException("Error: Input can't contain characters!");
                }
                if (input.matches(".*[^\\d.].")) {
                        throw new IllegalArgumentException("Error: Input can't contain special characters!");
                }
                if (Double.parseDouble(input) < 0) {
                    throw new IllegalArgumentException("Error: Please enter a positive number");
                }

                if (type == Integer.class) {
                    int intValue = Integer.parseInt(input);
                    if (intValue % 1 != 0) {
                        throw new IllegalArgumentException("Error: Please enter an integer number!");
                    }
                    return type.cast(intValue);

                } else if (type == Double.class) {
                    double doubleValue = Double.parseDouble(input);
                    double formValue = (double) type.cast(doubleValue);
                    return (T) getTwoDecimalPlaces(formValue);

                } else {
                    throw new IllegalArgumentException("Error: Unsupported type!");
                }

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getStringValue(String msg, String inputName) {
        while (true) {
            try {
                System.out.print(msg);
                String value = sc.nextLine().trim();
                if (value.isEmpty()) {
                    throw new IllegalArgumentException("Error: " + inputName + " can't be null or empty!");
                }
                if (value.matches("^-?\\d+(\\.\\d+)?$")) {
                    throw new IllegalArgumentException("Error: " + inputName + " can't contain number!");
                }
                if (value.matches(".*\\W.*")) {
                    throw new IllegalArgumentException("Error: " + inputName + " can't contain special characters!");
                }

                if (value.matches("^[a-zA-Z]+$")) {
                    return uppcaseLetter(value);
                } else {
                    throw new IllegalArgumentException("Error: " + inputName + " contains invalid characters!");
                }

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public LocalDate convertStringToLocalDate(String msg) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(getStringValue(msg, "Day"), formatter);
    }

    /**
     * method check input can enter regex
     *
     * @param msg
     * @param regex [a-zA-Z ]+, "[a-zA-Z0-9 ]+"
     * @param inputName EX: origin, name,...
     * @return
     */
    public String getStringValue(String msg, String regex, String inputName) {

        while (true) {
            try {
                System.out.print(msg);
                String value = sc.nextLine().trim();

                if (value.isEmpty()) {
                    throw new IllegalArgumentException("Error: " + inputName + " can't be null or empty!");
                }
                if (value.matches("^-?\\d+(\\.\\d+)?$")) {
                    throw new IllegalArgumentException("Error: " + inputName + " can't contain number!");
                }
                if (value.matches(".*\\W.*")) {
                    throw new IllegalArgumentException("Error: " + inputName + " can't contain special characters!");
                }

                if (value.matches(regex)) {
                    return uppcaseLetter(value);
                } else {
                    throw new IllegalArgumentException("Error: " + inputName + " contains invalid characters!");
                }

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.print(msg);
            }
        }
    }

    public String uppcaseLetter(String string) {
        String[] words = string.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return result.toString().trim();
    }

    public String getTwoDecimalPlaces(double number) {
        number = Math.round(number * 100) / 100;
        return String.format("%.2f", number);
    }

    public <T> void checkNumber(T num) {
        try {
            if (num == null || num.toString().isEmpty()) {
                throw new IllegalArgumentException("Error: Input can't be empty!");
            }
            if (num.toString().matches(".*[a-zA-Z].*")) {
                throw new IllegalArgumentException("Error: Input can't contain characters!");
            }
            if (num instanceof Number && ((Number) num).doubleValue() < 0) {
                throw new IllegalArgumentException("Error: Input can't be negative!");
            }
            if (num.toString().matches(".*\\W.*")) {
                if (num instanceof Double) {
                    return;
                }
                throw new IllegalArgumentException("Error: Input can't contain special characters!");
            }
            if (num instanceof Integer) {
                if ((Integer) num % 1 != 0) {
                    throw new IllegalArgumentException("Error: Please enter an integer number!");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
