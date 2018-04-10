/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pennstateschedule;

/**
 *
 * @author cjd258
 */
public class Course {
    String id;
    private String program;
    private String programNo;
    private String name;
    private String prerequisite;
    private String classAttribute;
    private String credit;
    
    public void Course()
    {
        
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    
    public String getId(String id)
    {
        return this.id;
    }

    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * @return the programNo
     */
    public String getProgramNo() {
        return programNo;
    }

    /**
     * @param programNo the programNo to set
     */
    public void setProgramNo(String programNo) {
        this.programNo = programNo;
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
     * @return the prerequisite
     */
    public String getPrerequisite() {
        return prerequisite;
    }

    /**
     * @param prerequisite the prerequisite to set
     */
    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    /**
     * @return the classAttribute
     */
    public String getClassAttribute() {
        return classAttribute;
    }

    /**
     * @param classAttribute the classAttribute to set
     */
    public void setClassAttribute(String classAttribute) {
        this.classAttribute = classAttribute;
    }

    /**
     * @return the credit
     */
    public String getCredit() {
        return credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(String credit) {
        this.credit = credit;
    }
}
