package stringMatchAlgo;

import javax.swing.*;

public class stringMatchNaive {
    public static void main(String[] args) {
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
            if(m == count) {
                JOptionPane.showMessageDialog(null, "Found " + pattern + " in " + text + " at " + i);
                break;
            }

        }
    }
}
