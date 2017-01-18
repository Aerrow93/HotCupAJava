/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment1.hotcupajava;

/**
 *
 * @author c0600299
 */
public class CSD4464Assignment1HotCupAJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    public static String stringPower(String s, int num ) {
		if (num < 1) {
			return null;
		}
                else if (num != 0 && !s.isEmpty()) {
                    return s;
                }
		else {
			if (s == ""){
			   String str = "";  
			   return str;
			}
			else {
				String str = s;
				return str;
			}
                
		}
	}
}
