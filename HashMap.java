//класс с колекцией, которая будет хранить пару (тэг,пароль)
public class HashMap {
    private java.util.HashMap<String, String> passwords = new java.util.HashMap<>();
    //Hashmap has a tag + password
    /*private Tag tag;*/
    public void addPass(Tag tag, Password password){
        passwords.put(tag.getTag(), password.getPass());
    }
}
