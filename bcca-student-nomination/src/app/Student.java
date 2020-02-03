package app;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    Integer age;
    String contactInfo;
    String gradDate;
    String aptitude;
    String perseverance;
    String dedication;
    String workEthic;
    String anythingElse;

    public Student(String name, Integer age, String contactInfo, String gradDate, String aptitude, String perseverance,
            String dedication, String workEthic, String anythingElse) {
        this.name = name;
        this.age = age;
        this.contactInfo = contactInfo;
        this.gradDate = gradDate;
        this.aptitude = aptitude;
        this.perseverance = perseverance;
        this.dedication = dedication;
        this.workEthic = workEthic;
        this.anythingElse = anythingElse;
    }
}