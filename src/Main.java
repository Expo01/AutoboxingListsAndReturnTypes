import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var ourList = getList(1, 2, 3, 4, 5); //passing ints
        System.out.println(ourList);

//        var ourList = List.of(1, 2, 3, 4, 5); //can also just use factory method
//        System.out.println(ourList);

        int myUnboxedInt = returnPrimitiveType(9); //passes Integer
    }

//    private static ArrayList<Integer> getList(Integer... varargs) { //autoboxes ints into Integers
//
//        ArrayList<Integer> aList = new ArrayList<>();
//        for (int i : varargs) {
//            aList.add(i);
//        }
//        return aList; //reeturns as ArrayList of Integers
//    }

    private static ArrayList<Integer> getList(int... varargs) {

        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i); //autoboxing takes places here where instance of an int is added to an ArrayList
        }
        return aList; //returns as ArrayList of Integers
    }


    private static int returnPrimitiveType(Integer myInteger){ //Integer parameter but auto-unboxes into int to assign
        // int variable in main
        return myInteger;
    }

}