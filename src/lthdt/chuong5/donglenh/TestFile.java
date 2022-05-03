/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong5.donglenh;

import java.io.File;
import lthdt.chuong5.logic.FileAndDirecOperations;

/**
 *
 * @author thang
 */
public class TestFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileAndDirecOperations fo = new FileAndDirecOperations();
//        File[] content = fo.getDirectoryContent("D:\\KPDL");
//        System.out.println(fo.DisplayContent(content));
//        File[] thumuc = fo.getSubDirectories(content);
//        System.out.println("Danh sach cac thu muc con: \n"+fo.DisplayContent(thumuc));
//        
//        File[] taptin = fo.getFile(content);
//        System.out.println("Danh sach cac tap tin: \n"+fo.DisplayContent(taptin));

        fo.getContentRecurs("D:\\\\KPDL");
    }
    
}
