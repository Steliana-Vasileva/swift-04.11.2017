package Task2_CredentialsManager;

public class Credentials {
    private String username;
    private String password1; //Милен: Защо има 1 в края ?
    private boolean wrongPass2 = false; //Милен: Интересно решение :) 
                                        // Според мен нямаш нужда от това. Защо функцията setPassword 
                                        // не я направиш да връща true/false ?

    String[] passwords = new String[100];

    public Credentials(String name, String password){
        this.username = name;
        this.password1 = password;
    }

    public void setPassword(String pass1, String pass2) {
        if (this.checkPassword(pass1)){
            for (int i = 0; i <passwords.length; i++) {
                if (passwords[i]==password1) {
                    this.wrongPass2 = true;
                    break;
                }
            }
            if(this.wrongPass2 = false){
                this.password1 =pass2;
            }
        }
    }

    //Милен: Аз бих го кръстил isValidPassword :)
    public boolean checkPassword(String password){
        if (this.password1.equals(password)){
            return true;
        }else {
            return false;
        }
    }

    public String getUsername() {
        return username;
    }

    public boolean getWrongPass2(){
        return this.wrongPass2;
    }
}
