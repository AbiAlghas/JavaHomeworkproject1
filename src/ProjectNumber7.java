public class ProjectNumber7 {
    public static void main(String[] args) {
        //7. Write a Java Program to print the first 10 numbers of Fibonacci series.
      int n=10;
      int first=1;
      int second=2;
        System.out.println("The following is the Fibonacci series: ");

        for (int i = 0; i < n ; i++) {
            System.out.print(first +" ");
            int next=first+second;
            first=second;
            second=next;

        }

    }
}
