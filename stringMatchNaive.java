package stringMatchAlgo;

import javax.swing.*;
import java.util.Scanner;

public class stringMatchNaive {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String text = JOptionPane.showInputDialog("Enter text!!");
        String pattern = JOptionPane.showInputDialog("Enter pattern to search in text!!");

        int n = text.length();
        int m = pattern.length();

        for(int i=0; i<n-m; i++){
            int count = 0;
            for(int j=0; j<m; j++){
                if(text.charAt(i+j)==pattern.charAt(j)) count++;
                else break;
            }
            if(count==m) {
//                System.out.println("match found at " + i);
                JOptionPane.showMessageDialog(null,"Found "+pattern+" in "+text+" at "+i);
                break;
            }

        }
    }
}
