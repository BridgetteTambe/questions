package org.example.Q176;

public class Test {
    public static void main(String[] args) {


        String[][] arr = {{"Red", "White"}, {"Black"}, {"Blue", "Yellow", "Green", "Voilet"}};


        {
            for (int row = 0; row < arr.length; row++) {
                int column = 0;
                for (; column < arr[row].length; column++) {
                    System.out.println("[" + row + "," + column + "] = " + arr[row][column]);
                    break;
                }
            }

        }
    }
}
