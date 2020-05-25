public class PalindromTable {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 3, 2, 1};
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;
        char[] number = numbers[i];
        System.out.println("liczba utworzona z połączenia cyfr z tablicy: "
                + number);
    }
    public static boolean istPalindrom(char[] number) {
        boolean palindrom = false;
        if (number.length % 2 == 0) {
            for (int i = 0; i < number.length / 2 - 1; i++) {
                if (number[i] != number[number.length - i - 1]) {
                    return false;
                } else {
                    palindrom = true;
                }
            }
        } else {
            for (int i = 0; i < (number.length - 1) / 2 - 1; i++) {
                if (number[i] != number[number.length - i - 1]) {
                    return false;
                } else {
                    palindrom = true;
                }
            }
        }
        return palindrom;
    }
}