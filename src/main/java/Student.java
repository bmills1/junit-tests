import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;

import java.util.ArrayList;

public class Student {

    private long id;
    public String name = "";
    private ArrayList<Integer> grades;
    public Student(long id, String name) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<Integer>();
    }

    public long getId() {
        return this.id;

    }

    public String getName() {

        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
    public void addGrades(int grade) {
        this.grades.add(grade);
    }

    public double getAverageGrade(){
        double avg = 0;
        for(int grade: this.grades){
            avg += grade;
        }
        return avg/this.grades.size();
    }


}
