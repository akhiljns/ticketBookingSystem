package com.assignment.ticketbooking.model;

public class User {

    private int userId;
    private String name;
    private int mobNo;
    private String emailId;

    public User() {
    }

    public User(int userId, String name, int mobNo, String emailId) {
        this.userId = userId;
        this.name = name;
        this.mobNo = mobNo;
        this.emailId = emailId;
    }

    /**
     * @return int return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return String return the name
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
     * @return String return the mobNo
     */
    public int getMobNo() {
        return mobNo;
    }

    /**
     * @param mobNo the mobNo to set
     */
    public void setMobNo(int mobNo) {
        this.mobNo = mobNo;
    }

    /**
     * @return String return the emailId
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * @param emailId the emailId to set
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

}