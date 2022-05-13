/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author predator
 */
public class AritmethicExcepion {
    public static void main(String[] args) {

        int nilai = 10;

        try {
            int hasil = nilai / (nilai-10);
            System.out.println(hasil);
        } catch (Exception exception) {
            System.out.println("Tidak boleh dibagi dengan 0");
        }

    }
}

//punya pano nilai 10
