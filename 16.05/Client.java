import java.util.ArrayList;
public class Client {
    public static void main(String args[])  {
        ArrayList<Student> students = new ArrayList<Student>();
        Student james = new Student("James Corbeau", 90, 80, 75, 85, 95);
        students.add(james);
        Student nick = new Student("Nick Sparco", 90, 100, 105, 95, 80);
        students.add(nick);
        Student arman = new Student("Arman Brembo", 80, 70, 75, 60, 95);
        students.add(arman);
        Student ethan = new Student("Ethan Enjuku", 80, 75, 100, 80, 95);
        students.add(ethan);
        Student drew = new Student("Drew Pirelli", 50, 100, 100, 85, 90);
        students.add(drew);

        System.out.println("Initial Run: \n");
        studentList(students);

        System.out.println("\n\n Replaced Name: ");
        replaceName(students, "Arman Brembo", "Daniel Greddy");
        studentList(students);

        System.out.println("\n\n Replaced Grade: ");
        replaceGrade(students, "Drew Pirelli", 2, 95);
        studentList(students);

        System.out.println("\n\n Replaced Student: ");
        replaceStudent(students, "Nick Sparco", "Jack Falken", 90, 80, 75, 75, 100);
        studentList(students);

        System.out.println("\n\n Inserted Student: ");
        students = insertStudent(students, "Jack Falken", "Roger Enkei", 100, 90, 95, 95, 80);
        studentList(students);

        System.out.println("\n\n Removed Student: ");
        students = removeStudent(students, "Ethan Enjuku");
        studentList(students);
    }

    public static void replaceName(ArrayList<Student> students, String oldName, String newName) {
        String tempName;
        for(int i = 0; i < students.size(); i++)    {
            tempName = students.get(i).getName();
            if(tempName.equals(oldName))    {
                students.get(i).setName(newName);
            }
        }
    }

    // The directions state that I need to input the data structure, among others, for this method. However, one of those is not the students name, so how am I
    // supposed to tell which grade to change? I decided to fix this by requiring a name input, which is not stated in the directions.
    // I could do this by not using the data type, in which case the method would simply be:
    // student.setScore(quizNum, newScore);

    public static void replaceGrade(ArrayList<Student> students, String name, int quizNum, int newScore) {
        String tempName;
        for(int i = 0; i < students.size(); i++)    {
            tempName = students.get(i).getName();
            if(tempName.equals(name))   {
                students.get(i).setScore(quizNum, newScore);
            }
        }
    }

    public static void replaceStudent(ArrayList<Student> students, String nameToReplace, String newName, int score1, int score2, int score3, int score4, int score5)   {
        String tempName;
        for(int i = 0; i < students.size(); i++)    {
            tempName = students.get(i).getName();
            if(tempName.equals(nameToReplace))  {
                students.get(i).setName(newName);
                students.get(i).setScore(1, score1);
                students.get(i).setScore(2, score2);
                students.get(i).setScore(3, score3);
                students.get(i).setScore(4, score4);
                students.get(i).setScore(5, score5);
            }
        }
    }

    public static ArrayList<Student> insertStudent(ArrayList<Student> students, String existingStudent, String newName, int score1, int score2, int score3, int score4, int score5)   {
        Student inserted = new Student(newName, score1, score2, score3, score4, score5);
        String tempName;
        int pos = 0;
        for(int i = 0; i < students.size(); i++)    {
            tempName = students.get(i).getName();
            if(tempName.equals(existingStudent))  {
                pos = i;
            }
        }
        students.add(pos, inserted);
        return students;
    }

    public static ArrayList<Student> removeStudent(ArrayList<Student> students, String name)   {
        String tempName;
        int pos = 0;
        for(int i = 0; i < students.size(); i++)    {
            tempName = students.get(i).getName();
            if(tempName.equals(name))   {
                pos = i;
            }
        }
        students.remove(pos);
        return students;
    }

    public static void studentList(ArrayList<Student> students)    {
        System.out.println("Table of Students");
        System.out.printf("%-20s", "Name: ");
        System.out.printf("%-10s", "Q1");
        System.out.printf("%-10s", "Q2");
        System.out.printf("%-10s", "Q3");
        System.out.printf("%-10s", "Q4");
        System.out.printf("%s", "Q5\n");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        for(int i = 0; i < students.size(); i++)    {
            System.out.printf("%-20s", students.get(i).getName());
            System.out.printf("%-10s", students.get(i).scoreQuery(1));
            System.out.printf("%-10s", students.get(i).scoreQuery(2));
            System.out.printf("%-10s", students.get(i).scoreQuery(3));
            System.out.printf("%-10s", students.get(i).scoreQuery(4));
            System.out.printf("%s", students.get(i).scoreQuery(5));
            System.out.println("");
        }
    }

}
