package com.CJDX.edu.model;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_employee.id
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_employee.chinese_name
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    private String chineseName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_employee.english_name
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    private String englishName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_employee.joined_date
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    private Date joinedDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_employee.salary
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    private BigDecimal salary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_employee.position_level
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    private Integer positionLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_employee.department_id
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    private String departmentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_employee.deltag
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    private String deltag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_employee.leave_date
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    private Date leaveDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_employee.id
     *
     * @return the value of t_employee.id
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_employee.id
     *
     * @param id the value for t_employee.id
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_employee.chinese_name
     *
     * @return the value of t_employee.chinese_name
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public String getChineseName() {
        return chineseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_employee.chinese_name
     *
     * @param chineseName the value for t_employee.chinese_name
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public void setChineseName(String chineseName) {
        this.chineseName = chineseName == null ? null : chineseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_employee.english_name
     *
     * @return the value of t_employee.english_name
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_employee.english_name
     *
     * @param englishName the value for t_employee.english_name
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_employee.joined_date
     *
     * @return the value of t_employee.joined_date
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public Date getJoinedDate() {
        return joinedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_employee.joined_date
     *
     * @param joinedDate the value for t_employee.joined_date
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_employee.salary
     *
     * @return the value of t_employee.salary
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public BigDecimal getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_employee.salary
     *
     * @param salary the value for t_employee.salary
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_employee.position_level
     *
     * @return the value of t_employee.position_level
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public Integer getPositionLevel() {
        return positionLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_employee.position_level
     *
     * @param positionLevel the value for t_employee.position_level
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public void setPositionLevel(Integer positionLevel) {
        this.positionLevel = positionLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_employee.department_id
     *
     * @return the value of t_employee.department_id
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_employee.department_id
     *
     * @param departmentId the value for t_employee.department_id
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_employee.deltag
     *
     * @return the value of t_employee.deltag
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public String getDeltag() {
        return deltag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_employee.deltag
     *
     * @param deltag the value for t_employee.deltag
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public void setDeltag(String deltag) {
        this.deltag = deltag == null ? null : deltag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_employee.leave_date
     *
     * @return the value of t_employee.leave_date
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public Date getLeaveDate() {
        return leaveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_employee.leave_date
     *
     * @param leaveDate the value for t_employee.leave_date
     *
     * @mbggenerated Fri Jun 14 21:11:19 CST 2019
     */
    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }
}