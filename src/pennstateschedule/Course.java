/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pennstateschedule;

import java.util.Arrays;
import java.util.HashMap;

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
    private HashMap hm;
    
    public Course(SQLConnection sc)
    {
        hm = sc.getAttributes("COURSE");
        
        System.out.println(Arrays.asList(hm));
        
        this.id = (String)hm.get("id");
        this.program = (String)hm.get("program");
        this.programNo = (String)hm.get("programNo");
        this.name = (String)hm.get("name");
        this.prerequisite = (String)hm.get("prerequisite");
        this.classAttribute = (String)hm.get("classAttribute");
        this.credit = (String)hm.get("credit");
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
