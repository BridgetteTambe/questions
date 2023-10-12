package org.example.Q84;

class CustomerType<T>{
    public <T> int count (T[] anArray, T element){
        int count = 0;
        for(T e : anArray){
            if(e.equals(element)) ++count;
        }
        return count;
    }
}
