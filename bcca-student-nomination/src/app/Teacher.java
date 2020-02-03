package app;

import java.io.Serializable;

public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    String email;
    String schoolDistrict;
    String position;
    String relationshipToNominee;

    public Teacher(String name, String email, String schoolDistrict, String position, String relationshipToNominee) {
        this.name = name;
        this.email = email;
        this.schoolDistrict = schoolDistrict;
        this.position = position;
        this.relationshipToNominee = relationshipToNominee;
    }
}