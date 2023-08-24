public class ProjectNumber10 {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from an Array of
        //Strings
        String[] elements={"apple","Mango","Strawberry","Banana","kiwi","cherry","apple","Mango","Banana"};

        for (int i = 0; i < elements.length ; i++) {
            for (int j = i+1; j < elements.length ; j++) {
                if(elements[i]==elements[j]){
                    System.out.println("Duplicate elements in given array "+elements[i]);
                    break;

                }
                
            }


        }
    }
}
