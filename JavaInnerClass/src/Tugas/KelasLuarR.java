/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author rosinaribka
 */
public class KelasLuarR {
private static class Ciptaanlagu{
        private String Lagu;
        private void setLagu(String Lagu){
            this.Lagu = Lagu;
        }
        private String getLagu(){
            return Lagu;
        }
    }
    
    public static void main(String[] args){
        KelasLuarR.Ciptaanlagu MyLagu = new KelasLuarR.Ciptaanlagu();
        MyLagu.setLagu("Bondan Prakoso");
        
        System.out.println("Saya Sedang Menyanyikan Lagu Bondan Prakoso: "+MyLagu.getLagu());
    }
}

