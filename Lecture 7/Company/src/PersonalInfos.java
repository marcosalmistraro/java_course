import java.util.ArrayList;

public class PersonalInfos<T> {

    private ArrayList<T> personalInfos;

    public PersonalInfos() {
        this.personalInfos = new ArrayList<>();
    }

    public void add(T personalInfo) {
        personalInfos.add(personalInfo);
    }

    public void remove(T personalInfo) {
        personalInfos.remove(personalInfo);
    }

    public void printall() {
        for (T personalInfo : personalInfos) {
            System.out.println(personalInfo);
        }
    }
}