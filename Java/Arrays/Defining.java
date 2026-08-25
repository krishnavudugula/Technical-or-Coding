package Arrays;

public class Defining {
    public static void main(String[] args) {
        
        int[] marks = new int[3];
        //int marks[] = new int[3];
        marks[0] = 80;
        marks[1] = 91;
        marks[2] = 98;

        //int marks[] = {80,91, 98};
        System.out.println(marks); //this prints Garbage - Jargon Value

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for(int i=0; i<3; i++){
            System.out.print(marks[i] + " ");
        }


        
    }
}