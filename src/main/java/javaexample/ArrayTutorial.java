package javaexample;

public class ArrayTutorial {

    public static void main(String[] args) {
        double[] mylist = {1.9, 2.9, 3.4, 3.5};

        //Print all the array elements
        for (int i = 0; i < mylist.length; i++) {
            System.out.println(mylist[i] + " ");
        }
            //Summing all elements
            double total = 0;
            for(int b = 0; b< mylist.length; b++) {
                total+= mylist[b];
            }
            System.out.println("Total is: " + total);

            //Finding trhe largest element
            double max = mylist[0];
            for ( int c = 0; c < mylist.length; c++) {
                if(mylist[c] > max ) max = mylist[c];
            }
            System.out.println("Max is: " + max);
        }

    }


