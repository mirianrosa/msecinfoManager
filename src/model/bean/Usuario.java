package model.bean;

/**
 *
 * @author mirian.rosa
 */
public class Usuario {
    
    private int id;
    private String username;
    private String passwd;
    private String role;
    private boolean permissaoFunc;
    private boolean permissaoForne;
    private boolean permissaoPaga;
    private boolean permissaoContra;
    private boolean permissaoRela;
    private boolean permissaoUsers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isPermissaoFunc() {
        return permissaoFunc;
    }

    public void setPermissaoFunc(boolean permissaoFunc) {
        this.permissaoFunc = permissaoFunc;
    }

    public boolean isPermissaoForne() {
        return permissaoForne;
    }

    public void setPermissaoForne(boolean permissaoForne) {
        this.permissaoForne = permissaoForne;
    }

    public boolean isPermissaoPaga() {
        return permissaoPaga;
    }

    public void setPermissaoPaga(boolean permissaoPaga) {
        this.permissaoPaga = permissaoPaga;
    }

    public boolean isPermissaoContra() {
        return permissaoContra;
    }

    public void setPermissaoContra(boolean permissaoContra) {
        this.permissaoContra = permissaoContra;
    }

    public boolean isPermissaoRela() {
        return permissaoRela;
    }

    public void setPermissaoRela(boolean permissaoRela) {
        this.permissaoRela = permissaoRela;
    }

    public boolean isPermissaoUsers() {
        return permissaoUsers;
    }

    public void setPermissaoUsers(boolean permissaoUsers) {
        this.permissaoUsers = permissaoUsers;
    }
   
}
