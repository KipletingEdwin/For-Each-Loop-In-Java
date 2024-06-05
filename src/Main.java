import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String [] cars = { "BMW M2", "Veloster N", "GTI", "Harrier"};
        char[] characterNames = { 'E', 'G', 'F', 'R'};
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(2);
        numbers.add(5);
        numbers.add(7);

//        for loop
        for(int i=0; i <=cars.length - 1; i++){
            System.out.println(cars[i]);
        }

        System.out.println("--------------------------------");

        //        for each loop
        for ( String car : cars ){
            System.out.println(car);
        }

        System.out.println("--------------------------------");

        for( char name : characterNames){
            System.out.println(name);
        }

        System.out.println("--------------------------------");

        for( int num : numbers){
            System.out.println(num);

        }






    }
}