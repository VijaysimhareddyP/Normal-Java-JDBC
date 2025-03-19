package org.example.model;

public class College {
    private String collegeName;
    private int collegeId;
    private String location;

    public College(String collegeName, int collegeId, String location) {
        this.collegeName = collegeName;
        this.collegeId = collegeId;
        this.location = location;
    }

    public College() {
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "College{" +
                "collegeName='" + collegeName + '\'' +
                ", collegeId=" + collegeId +
                ", location='" + location + '\'' +
                '}';
    }
}