/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong3.donglenh;

/**
 *
 * @author thang
 */
public class TestString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String content = "Xin chao cac ban den voi lop hoc \n Nho lam bai tap day du nhe!";
        System.out.println(content);
        
        //Thao tac 1
        System.out.println("Vi tri cua ki tu a trong chuoi la "+content.indexOf('a'));
        System.out.println("Vi tri cua tu chao trong chuoi la "+content.indexOf("chao"));
        //Thao tac 2: Kiem tra khoi dau va ket thuc
        System.out.println("Chuoi bat dau bang tu Xin: "+content.startsWith("Xin"));
        System.out.println("Chuoi ket thuc bang dau !: "+content.endsWith("!"));
        //Thao tac 3: cat chuoi theo vi tri
        String temp = content.substring(35, content.length());
        System.out.println("Chuoi con la: "+temp);
        //Thao tac 4: Tach chuoi
        String[] rs = content.split("\n");
        for(int i = 0; i <rs.length;i++){
            System.out.println(rs[i]);
        }
        
        //thao tac 5: loai bo khoang trang dau cuoi
        for(int i = 0; i <rs.length;i++){
            System.out.println(rs[i].trim());
        }
        
        //Thao tac 6: thay the ki tu
        temp =  content.replace('a', 'z');
        System.out.println(temp);
        
        //Thao tac 7: chuyen kieu
        temp = content.toUpperCase();
        System.out.println(temp);
        
        temp = content.toLowerCase();
        System.out.println(temp);
        
        //Thao tac 8: so sanh chuoi
        temp = "Nguyen";
        if(temp.compareToIgnoreCase("nguyen") == 0){
            System.out.println("hai chuoi bang nhau");
        } else{
            System.out.println("hai chuoi khong bang nhau");
        }
        
        //Thao tac 9: noi chuoi
        temp = temp.concat(" Van B");
        System.out.println(temp);
        
        //Thao tac 10: Truy xuat bang chi so
        for(int i =0;i<temp.length();i++){
            System.out.print(temp.charAt(i));
        }
        System.out.println();
        
        //Thao tac 10: Chuyen kieu so
        temp = "155";
        int n = Integer.parseInt(temp);
        System.out.println("n = "+n);
        
        //Thao tac 11: su dung StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Xin chao cac ban den voi lop hoc\n");
        sb.append("Nho lam bai tap day du nhe!");
        temp = sb.toString();
        System.out.println(temp);
    }
    
}
