package com.java8.stream;

public class Score {

    //分数
    private Integer point;

    //课程名称
    private String courseName;

    public Integer getPoint() {
        return point;
    }

    public Score add(Score other) {

        this.point += other.getPoint();

        return this;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}