package org.example.Q78;

public class Test {
    public static void doThings() throws GeneralException{
        try{
            throw new RuntimeException("Something happened");
        }catch(Exception e){
            throw new GeneralException.SpecificException(e.getMessage());

        }
    }

    public static void main(String[] args) {
        try{
            Test.doThings();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class GeneralException extends Exception {
    public GeneralException(String s) {

    }

   static class SpecificException extends GeneralException{
        public SpecificException(String s) {
            super(s);

        }
    }
}
