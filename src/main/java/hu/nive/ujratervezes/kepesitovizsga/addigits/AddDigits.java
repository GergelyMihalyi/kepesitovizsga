package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    public int addDigits(String input) {
        if (input == null || input.isEmpty()) {
            return -1;
        }
        int sum = 0;
        char character;
        for (int i = 0; i < input.length(); i++) {
            character = input.charAt(i);
            if (Character.isDigit(character)) {
                sum += Character.getNumericValue(character);
            }
        }
        return sum;
    }
}
