package org.example.Q214;

public abstract class API {
    public abstract void checkValue(Object value) throws IllegalArgumentException;
    protected boolean isValueANumber(Object val){
        if(val instanceof Number){
            return true;
        }else {
            try{
                Double.parseDouble(val.toString());
                return true;
            }catch(NumberFormatException ex){
                return false;
            }
        }
    }

    // correct Answer A E
}
