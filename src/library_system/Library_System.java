/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library_system;

/**
 *
 * @author ASUS
 */
public class Library_System {

    /**
     * @param args the command line arguments
     * 
     */
    public void panggillogin(){
        new loginForm().setVisible(true);
    }
    public void panggilmenu(){
        new menuForm_1().setVisible(true);
    }
    public void panggilcari(){
        new pencarianForm().setVisible(true);
    }
    public void panggilpinjam(){
        new peminjamanForm().setVisible(true);
    }
    public void panggilkembali(){
        new pengembalianForm().setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
