/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ransom.note.hash.tables;

import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author marshall
 */
public class RansomNoteHashTables {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hashtable<String, Integer> magWord = new Hashtable<String, Integer>();
        int m = in.nextInt();
        int n = in.nextInt();
        boolean check = true;
        if(m > n){        
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
            magWord.put(in.next(), 0);
        }
        
        for(int v = 0; v < magazine.length; v++)
            if(magWord.containsKey(magazine[v]))
                magWord.put(magazine[v], magWord.get(magazine[v]) + 1);
        
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        check = true;
        int c = 0;
        for(int i = 0; i < ransom.length; i++){
            if(magWord.containsKey(ransom[i]));
               
            else{
                check = false;
                break;
            }
            
        }
    }
        else 
            check = false;
        if(check == false)
            System.out.println("No");
        else
            System.out.println("Yes");
        
    }
    
}
