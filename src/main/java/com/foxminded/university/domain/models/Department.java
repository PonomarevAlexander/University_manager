package com.foxminded.university.domain.models;

import java.util.List;
import javax.persistence.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue()
    private int id;
    
    @Column(name = "name")
    private String name;
    
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Teacher> teacherList;
    
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Group> groupList;
    
    public Department() {}

    public Department(String name) {
        this.name = name;
    }

    public Department(int id, String name, List<Teacher> teacherList, List<Group> groupList) {
        super();
        this.id = id;
        this.name = name;
        this.teacherList = teacherList;
        this.groupList = groupList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((groupList == null) ? 0 : groupList.hashCode());
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((teacherList == null) ? 0 : teacherList.hashCode());
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
        Department other = (Department) obj;
        if (groupList == null) {
            if (other.groupList != null)
                return false;
        } else if (!groupList.equals(other.groupList))
            return false;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (teacherList == null) {
            if (other.teacherList != null)
                return false;
        } else if (!teacherList.equals(other.teacherList))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + ", teacherList=" + teacherList + ", groupList=" + groupList
                + "]";
    }
    
}
