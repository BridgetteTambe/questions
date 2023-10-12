package org.example.Q168;

public class Tester {

    public static void main(String[] args) {
        char letter;
        int i=0;

        switch(letter = 'b'){
            case 'a' :
                i++;
                break;
            case 'b':
                i++;
            case 'c' | 'd':
                i++;
                //break;
            case 'e':
                i++;
//                break;
            case 'f' :
                i++;
              //  break;
            default:
                System.out.println(letter);
        }
        //System.out.println(letter);
        System.out.println(i);
    }
}
