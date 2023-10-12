package org.example.Q114;

public interface TestInterface {



        default void samplingProbeProcedure () {
            probeProcedure();
            System.out.println("Collect Sample");
            System.out.println("Leave Asteriod");
            System.out.println("Dock with main Craft");
        }

        default void explosionProbeProcedure () {
            probeProcedure();
            System.out.println("Explode");
        }




    default void probeProcedure () {

        System.out.println("Luanch Probe");
        System.out.println("Land as Asteroid");
    }

    public static void main(String[] args) {

    }

}
