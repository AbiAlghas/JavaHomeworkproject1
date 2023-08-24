public class ProjectNumber4 {
    //4. Create a 2D array of integers. Develop a program which will calculate
    //the sum of even and odd numbers for that array
    public static void main(String[] args) {
        int [][]numbers= {
                {2, 4, 5, 6},
                {7, 8, 12, 14},
                {15, 19, 8, 9}};
        int sumeven=0;
        int sumodd=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    sumeven += numbers[i][j];

                }else {
                    sumodd+=numbers[i][j];


                }

            }
        }
        System.out.println("Total sum of even numbers is " +sumeven);
        System.out.println("Total sum of even numbers is " +sumodd);
    }
}

