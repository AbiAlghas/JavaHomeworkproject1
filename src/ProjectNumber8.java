public class ProjectNumber8 {
    public static void main(String[] args) {
        //. Maximum and minimum number in the array
        int[] number = {4, 5, 6, 14, 85, 14, 2, 5, 41, 4};

        int maximum = number[0];
        int minimum = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > maximum) {
                maximum = number[i];
            }
            if (number[i] < minimum) {
                minimum = number[i];

            }

        }
        System.out.println(maximum);
        System.out.println(minimum);
    }
}