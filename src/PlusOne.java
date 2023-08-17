import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{4,3,2,1})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9,8,7,6,5,4,3,2,1,2,3,4,5,6,7,8,9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9})));
    }

    //takes a long value as an array, and add one at the end of it
    private static int[] plusOne(int[] digits) {
        int pos = digits.length-1;
        while (pos >=0){
            if (digits[pos] + 1 == 10){
                digits[pos--] = 0;
            } else {
                digits[pos]++;
                return digits;
            }
        }
        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        System.arraycopy(digits, 0, newDigits, 1, digits.length);
        return newDigits;
    }
}
