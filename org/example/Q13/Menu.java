package org.example.Q13;

public class Menu {
    enum Machine{
        AUTO("Truck"),MEDICAL("Scanner");

        private String type;
        private Machine(String type){
           this. type = type;
        }

        public String getType() {
            return type;
        }

        private void setType(String type) {
            this. type = type;


        }
    }

    public static void main(String[] args) {
      //  Machine.AUTO.setType("Sedan");
        for(Machine p : Machine.values()){
            System.out.println(p + ": " + p.getType());
        }
    }
}
