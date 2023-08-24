public class ProjectNumber9 {
    public static void main(String[] args) {
        //9. Write a java program to find the  number in the array?
        int[] number = {4, 5, 6, 14, 85, 14, 2, 5, 41, 4};
        int max=0;
        int secondmax =0;
        for (int num:number) {
            if (num > max) {
                secondmax = max;
                max=num;
            }else if(num>secondmax){
                secondmax=num;
            }

        }
        System.out.println("The second largest number in the given array is " +secondmax);

    }
}