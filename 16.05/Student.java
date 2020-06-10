public class Student {
    private String name;
    private int q1, q2, q3, q4, q5;

    public Student(String name, int q1, int q2, int q3, int q4, int q5){
        this.name = name;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
    }

    public int scoreQuery(int quizNum)   {
        if(quizNum == 1) {
            return q1;
        }   else if(quizNum == 2)   {
            return q2;
        }   else if(quizNum == 3)   {
            return q3;
        }   else if(quizNum == 4)   {
            return q4;
        }   else if(quizNum == 5)    {
            return q5;
        }   else    {
            System.out.println("Quiz number not found. Returning -1...");
            return -1;
        }
    }

    public void setScore(int quizNum, int score) {
        if(quizNum == 1) {
            q1 = score;
        }   else if(quizNum == 2)   {
            q2 = score;
        }   else if(quizNum == 3)   {
            q3 = score;
        }   else if(quizNum == 4)   {
            q4 = score;
        }   else if(quizNum == 5)   {
            q5 = score;
        }   else    {
            System.out.println("Quiz number not found.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString()  {
        return "Student Name: " + getName() + " . Scores: + " + q1 + " " + q2 + " " + q3 + " " + q4 + " " + q5 + " ";
    }
}
