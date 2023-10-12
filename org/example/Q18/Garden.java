package org.example.Q18;

public class Garden {

    private static Plant plant;

    public static void main(String[] args) {
        plant = new Tulip();
        feed(plant);
        feed(plant);
    }

    private static void feed(Plant p) {
        p = null;
        if(p instanceof Tulip){
            System.out.println("Take extra care");

    }


    }

}
