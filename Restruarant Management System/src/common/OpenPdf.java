/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author risha
 */
public class OpenPdf {
public static void openById(String id){
    try {
        if(new File("D:/pdfCafe/"+id+".pdf").exists()){
Process p=Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler E:\\"+id+".pdf");
}else{
JOptionPane.showMessageDialog(null,"File Not Exist");
}
    } catch (Exception e) {
JOptionPane.showMessageDialog(null, e);
    }
}    
}
