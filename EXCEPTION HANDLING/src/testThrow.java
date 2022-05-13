/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author predator
 */
class AgeInvalid extends Exception{
    AgeInvalid(String s){
        super(s);
    }
}

public class testThrow {
    static void validate(int umur)throws AgeInvalid{
        if(umur<17)
            throw new AgeInvalid ("not valid");
            else
            System.out.println("welcome");
    }
    public static void main (String args[]){
        try{
            validate(13);
        }
        catch(Exception i){
            System.out.println("Exception aktif" + i);
        }
        System.out.println("out ");
    }
}



//punya pano umur<17 validate 13
