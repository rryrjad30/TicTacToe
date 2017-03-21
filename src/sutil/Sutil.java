/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sutil;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author COMPUTER
 */
public class Sutil {
    
    public static void msg(Component parent, String message){
        JOptionPane.showMessageDialog(parent,
                message,
                "App Info",
                1); // 1 = InformationIcon
    }
    
    public static void mse(Component parent, String message){
        JOptionPane.showMessageDialog(parent,
                message,
                "App Info",
                2); // 2 = ErrorIcon
    }
    
    public static int msq(Component parent, String message){
        int respon = JOptionPane.showOptionDialog(parent,
                message,
                "App Info",
                JOptionPane.YES_NO_OPTION,
                3,
                null,null,null); // 3 = QuestionIcon
        return respon;
    }
    
}
