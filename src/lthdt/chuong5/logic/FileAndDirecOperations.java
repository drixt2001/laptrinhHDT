/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong5.logic;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author thang
 */
public class FileAndDirecOperations {

    public FileAndDirecOperations() {
    }
    
    //Thao tac 1: Liet ke tat ca thu muc va file trong thu muc
    public File[] getDirectoryContent(String folder){
        File dr = new File(folder);
        if(dr.isFile()){
            return null;
        }
        File[] rs = dr.listFiles();
        return rs;
    }
    
    //Thao tac 2: Xuat KQ
    public String DisplayContent(File[] f){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<f.length;i++){
            sb.append(f[i].getPath()).append(File.separator).append(f[i].getName());
            sb.append("\n");
            
        }
        
       return sb.toString();
    }
    
    //Thao tac 3: Loc cac thu muc
    public File[] getSubDirectories(File[] content){
        ArrayList<File> rs = new ArrayList<>();
        for(int i = 0;i<content.length;i++){
            if(content[i].isDirectory()){
                rs.add(content[i]);
            }
        }
        
        File[] kq = new File[rs.size()];
        return rs.toArray(kq);
    }
    
    //Thao tac 4: Loc cac tap tin
    
    public File[] getFile(File[] content){
        ArrayList<File> rs = new ArrayList<>();
        for(int i = 0;i<content.length;i++){
            if(content[i].isFile()){
                rs.add(content[i]);
            }
        }
        
        File[] kq = new File[rs.size()];
        return rs.toArray(kq);
    }
    
    //Thao tac 5: Duyet de quy xuat tat ca cac tap tin va thu muc
    public void getContentRecurs(String folder){
        File content = new File(folder);
        if(content.isFile()){
            System.out.println(content.getPath()+File.separator + content.getName());
            return;
        }
        //cau goi de quy
        System.out.println("Thu muc: "+folder);
        File[] subcontent  = content.listFiles();
        for(int i = 0; i<subcontent.length;i++){
            getContentRecurs(folder + File.separator + subcontent[i].getName());
        }
    }
}
