package org.example.Q132;

public class DNASynth {



        int aCount;
        int tCount;
        int cCount;
        int gCount;
        int getACount ( int aCount){
            return aCount;
        }
        int getTCount ( int tCount){
            return tCount;
        }
        int getCCount () {
            return getTotalCount() - this.aCount - getTCount(0) - gCount;
        }
        int getGCount () {
            return getGCount();
        }
        int getTotalCount () {
            return aCount + getTCount(0) + this.cCount + this.gCount;
        }


    public static void main(String[] args) {

    }

}