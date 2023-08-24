public class ProjectNumber1 {
    //1. Create a program that uses an array to store a list of temperatures for
    //a week, and then uses a loop to find the highest and lowest
    //temperature for the week.

    public static void main(String[] args) {
        int[] temp = {10, 15, 25, 35, 14, 50, 47};
        int highest = temp[0];
        int lowest = temp[0];

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > highest) {
                highest = temp[i];
            }
                if (temp[i] < lowest) {
                    lowest = temp[i];


                }
            }
            System.out.println(highest);
            System.out.println(lowest);


        }


    }



