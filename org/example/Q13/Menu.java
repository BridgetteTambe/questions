package org.example.Q13;

public class Menu {
    enum Machine{


       // AUTO("Truck"),MEDICAL("Scanner");

//        private String type;
//        private Machine(String type){
//           this. type = type;
//        }
//
//        private String getType() {
//            return type;
//        }
//
//        private void setType(String type) {
//            this. type = type;
//
//
//        }
//    }
//
//    public static void main(String[] args) {
//        Machine.AUTO.setType("Toyota");
//        for(Machine p : Machine.values()){
//            System.out.println(p + ": " + p.getType());
//        }     // B is the correct answer

//        AUTO("Vehicle"), MEDICAL("Scanner"); // line 1
//
//
//        private String type;
//
//        Machine(String vehicle) {
//            this.type = type;
//        }
//
//        private void setType(String type) {
//            this.type = type; // line 1
//        }
//
//        private String getType() {
//            return type;
//        }
//    }
//
//    public static void main(String[] args) {
//        Machine.AUTO.setType("Toyota"); // line 1
//        for (Machine machine : Machine.values()) {
//            System.out.println(machine +": " + machine.getType());
//        }       // D is the correct answer
//

        AUTO("Vehicle"), MEDICAL("Scanner");
        private String type;

        private Machine(String type) {
            this.type = type; // line 1
        }

        private void setType(String type) {
            this.type = type; // line 2
        }

        private String getType() {
            return type;
        }
    }

    public static void main(String[] args) {
        Machine.AUTO.setType("Toyota"); // line 3
        for (Machine machine : Machine.values()) {
            System.out.println(machine +": " + machine.getType());
        }
    }



    }



