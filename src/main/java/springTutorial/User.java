package springTutorial;

/**
 * Created by Daniel_D'AGE on 21.07.2018.
 */
public class User {

    private String name;
    private Address adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", adress=" + adress +
                '}';
    }
}
