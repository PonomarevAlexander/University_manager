package com.foxminded.university.domain.models;

import java.time.LocalDateTime;

public class Lesson {

    private int id;
    private String name;
    private LocalDateTime startTime;
    private int lessonDurationSecond;
    private Teacher teacher;
    private Group group;

    public Lesson() {
    }

    public Lesson(String name, LocalDateTime startTime, int lessonDurationSecond) {
        this.name = name;
        this.startTime = startTime;
        this.lessonDurationSecond = lessonDurationSecond;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public int getLessonDurationSecond() {
        return lessonDurationSecond;
    }

    public void setLessonDurationSecond(int lessonDurationSecond) {
        this.lessonDurationSecond = lessonDurationSecond;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((group == null) ? 0 : group.hashCode());
        result = prime * result + id;
        result = prime * result + lessonDurationSecond;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
        result = prime * result + ((teacher == null) ? 0 : teacher.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Lesson other = (Lesson) obj;
        if (group == null) {
            if (other.group != null)
                return false;
        } else if (!group.equals(other.group))
            return false;
        if (id != other.id)
            return false;
        if (lessonDurationSecond != other.lessonDurationSecond)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (startTime == null) {
            if (other.startTime != null)
                return false;
        } else if (!startTime.equals(other.startTime))
            return false;
        if (teacher == null) {
            if (other.teacher != null)
                return false;
        } else if (!teacher.equals(other.teacher))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Lesson [id=" + id + ", name=" + name + ", startTime=" + startTime + ", lessonDurationSecond="
                + lessonDurationSecond + ", teacher=" + teacher + ", group=" + group + "]";
    }

}
