/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ducha
 */
public class Taikhoan {
    private String Username;
    private String Password;

    public Taikhoan() {
    }

    public Taikhoan(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
