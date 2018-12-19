package Task18122018;

import java.util.ArrayList;

public class Mark {
    private Student student;
    private Subject subject;
    private int rank;

    public Mark() {
    }

    public Mark(Student student, Subject subject, int rank) {
        this.student = student;
        this.subject = subject;
        this.rank = rank;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public ArrayList<Mark> addMarkForStudents(Student[] listOfStudents,String[] subjects) {
        int markObligatory = 3; // for obligatory subjects
        int markOptional = 0; // according to task's example: mark's output for not-mandatory subjects will be shown as "0". Can be changed for String "null" if required.
        int markMaria = 5; // for Maria's subjects differ from other students
        ArrayList<Mark> arrayListOfMarks = new ArrayList();
        Subject s = new Subject();
        for (int i = 0; i < listOfStudents.length; i++) {
            // checking for non-typical students
            if (!listOfStudents[i].getFirstName().equals("Maria") && !listOfStudents[i].getLastName().equals("Semenova")) {
                for (int j = 0; j < subjects.length; j++) {
                    if (s.listOfSubjects(subjects).get(j).isMandatory()) {
                        Mark m = new Mark(listOfStudents[i], s.listOfSubjects(subjects).get(j), markObligatory);
                        arrayListOfMarks.add(m);
                    } else {
                        Mark m = new Mark(listOfStudents[i], s.listOfSubjects(subjects).get(j), markOptional);
                        arrayListOfMarks.add(m);
                    }
                }
            } else {  // Maria's block
                for (int j = 0; j < subjects.length; j++) {
                    if (subjects[j].equals("History") || subjects[j].equals("Ethics")) {
                        Mark m = new Mark(listOfStudents[i], s.listOfSubjects(subjects).get(j), markMaria);
                        arrayListOfMarks.add(m);
                    } else {
                        Mark m = new Mark(listOfStudents[i], s.listOfSubjects(subjects).get(j), markObligatory);
                        arrayListOfMarks.add(m);
                    }
                }
            }
        }
        return arrayListOfMarks;
    }

    public void printMarks(Student[] listOfStudents,String[] subjects) {
        ArrayList<Mark> arrayInternalListOfMarks = addMarkForStudents(listOfStudents, subjects);
        for (Student studentsList : listOfStudents) {
            System.out.print("\n" + studentsList + " ");
            for (int j = 0; j < arrayInternalListOfMarks.size(); j++) {
                Mark m = (Mark) arrayInternalListOfMarks.get(j);
                if (m.getStudent().getLastName().equals(studentsList.getLastName())) {
                    switch (m.getRank()) {
                        case 0:
                            break;
                        default:
                            System.out.print(m.getSubject().getName() + "-" + m.getRank() + " ");
                            break;
                    }
                }
            }
        }
    }

    @Override // method was overrided for results checks
    public String toString() {
        return  getStudent() + " " + getSubject().getName() + "-" + getRank() + " ";
    }
}

