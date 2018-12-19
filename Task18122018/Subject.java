package Task18122018;

import java.util.ArrayList;

public class Subject {
    private String name;
    private boolean isMandatory;

    public Subject() {
    }

    public Subject(String name, boolean isMandatory) {
        this.name = name;
        this.isMandatory = isMandatory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMandatory() {
        return isMandatory;
    }

    public void setMandatory(boolean mandatory) {
        isMandatory = mandatory;
    }

    public ArrayList<Subject> listOfSubjects(String[] subjects) {
        ArrayList<Subject> listOfSubjects = new ArrayList<>(5);
        Subject s;
        for (String subject : subjects) {
            if (subject.equals("Ethics")) {
                s = new Subject(subject, false);
                listOfSubjects.add(s);
            } else {
                s = new Subject(subject, true);
                listOfSubjects.add(s);
            }
        }
        return listOfSubjects;
    }
    @Override // method was overrided for results checks
    public String toString() {
        return  name + " " + " " + isMandatory;
    }
}
