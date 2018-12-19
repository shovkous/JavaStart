package Task18122018;
/* Task description:
// Please, do not use internet or any other sources of information during the test
// tast shouldn’t take more than 30 minutes
// There are 3 classes: Student, Subject and Mark
// - Fill the data according to the following conditions (use lists)
// 1. It is known that there are such students in the group: Valery Popov, Semyon Korzhev,
// Peter Ivanov, Maria Semenova and Kolya Nesterenko
// 2. Mathematics, Physics, Astronomy, History and Ethics are learned by this group and all
// subjects are mandatory excluding Ethics. It is optional.
// 3. Fill the data about marks if it is known that students have mark 3 for mandatory subjects
// and Maria has mark 5 for History and Ethics.
// 4. Please print results in a such way:
//   Popova Valeria Mathematics-1 Physics-2 Astronomy-0 History-1 Ethics-3 (do not display the subject
// info if there is no data about it)
*/
public class Test {

    public static void main(String[] args) {
        // 1
        Student[] listOfStudents = {new Student("Valery","Popov"), new Student("Semyon","Korzhev"),new Student("Peter","Ivanov"),new Student("Maria","Semenova"),new Student("Kolya","Nesterenko")};
        // 2
        String[] subjects = {"Mathematics","Physics","Astronomy","History","Ethics"};
        Subject s = new Subject();
        s.listOfSubjects(subjects);
        // 3
        Mark m = new Mark();
        m.addMarkForStudents(listOfStudents,subjects);
        // 4
        m.printMarks(listOfStudents,subjects);
    }
}
