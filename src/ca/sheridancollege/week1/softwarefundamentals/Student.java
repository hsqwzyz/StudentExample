/*
//Adding a Commit#2
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author Ali Hassan
 */
public class Student {

    private String name;
    private String stdId;

    public Student(String stdId, String name) {
        this.stdId = stdId;
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the stdId
     */
    public String getStdId() {
        return stdId;
    }

    /**
     * @param stdId the stdId to set
     */
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

}
