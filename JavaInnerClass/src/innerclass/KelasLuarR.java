/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclass;

/**
 *
 * @author rosinaribka
 */
public class KelasLuarR {
private static class Programming{
        private String language;
        private void setLanguage(String language){
            this.language = language;
        }
        private String getLanguage(){
            return language;
        }
    }
    
    public static void main(String[] args){
        KelasLuarR.Programming MyLanguage = new KelasLuarR.Programming();
        MyLanguage.setLanguage("Java");
        
        System.out.println("Saya Sedang Mempelajari: "+MyLanguage.getLanguage());
    }
}