package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public int countStudents(int[] students, int[] sandwiches) {
        int counter = 0;
        while (sandwiches.length > 0){
            if (counter == students.length){
                return students.length;
            }
            if (sandwiches[0] == students[0]){
                sandwiches = removeFirstElement(sandwiches);
                students = removeFirstElement(students);
                counter = 0;
            }else{
                shiftToLeft(students);
                counter++;
            }
        }
        return 0;
    }

    public void shiftToLeft(int[] arr){

        int temp = arr[0];
        for (int i = 0; i <arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }
    
    public int[] removeFirstElement(int[] arr){
        int[] newArr = new int[arr.length-1];
        System.arraycopy(arr, 1,newArr,0,newArr.length);
        return newArr;
    }
}