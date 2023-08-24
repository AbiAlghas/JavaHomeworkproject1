public class ProjectNumber2 {
    //2. Create an array of integer values. After the array is created, calculate
    //the sum of all stored elements in that array.
    public static void main(String[] args) {
        int[] values={5,10,23,14,25,14,};
        int sum=0;
        for (int i = 0; i < values.length; i++) {
            sum=sum+values[i];

        }
        System.out.println(sum);

    }
}
