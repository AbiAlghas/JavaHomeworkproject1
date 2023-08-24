public class ProjectNumber3 {
    // Create a 2D array or integer type where you will store odd and even
    //numbers. Develop a program which will identify/print the even
    //numbers only.
    public static void main(String[] args) {
        int [][] numbers=
                {{2,4,5,6},
                {7,8,12,14},
                {15,19,8,9}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(numbers[i][j]%2==0) {
                    System.out.print(numbers[i][j]+" ");
                }
            }

        }
        }
    }

