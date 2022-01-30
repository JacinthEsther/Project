package diaryApp;

import java.util.ArrayList;
import java.util.Objects;

public class Diary {
    private String ownerName;
    private ArrayList <Gist> gists = new ArrayList<>();
    private String password;

    public Diary(String password, String ownerName){
//        if (password == null || !(password.contains(" "))){
//
//                throw new IllegalArgumentException("invalid password");
//        }
        this.password = password;
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public ArrayList<Gist> getGists(String userPassword) {
        if(Objects.equals(userPassword, password)) {
            return gists;
        }
        throw new IllegalArgumentException("invalid password");
    }

    public void setGists(ArrayList<Gist> gists) {

        this.gists = gists;
    }


    public void setPassword(String passWord) {
        if (passWord == null && checkPassword(passWord) )
            this.password = passWord;
        if (passWord != null) this.password = passWord;

    }

    public String getPassword() {
        return password;
    }

    private boolean checkPassword(String passWord){
        return (password.length() > 3 && password.length() < 12)
                && !(password.contains(" "));
    }

    public void addNewGist(String title, String gistProper,String secretKey) {
        if (secretKey.equals(password)){
            Gist gist = new Gist(title,gistProper);
            gists.add(gist);
        }
        else {
            throw new IllegalArgumentException("invalid password");
        }
    }

    public Gist findGistByTitle(String gistTitle){
        for (Gist gist: gists) {
            if (gist.getTitle().equalsIgnoreCase(gistTitle))
                return  gist;
        }
        throw new IllegalArgumentException("Gist not found");
    }

}
