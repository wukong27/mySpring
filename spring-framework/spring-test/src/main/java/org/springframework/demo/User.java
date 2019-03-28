package org.springframework.demo;

import java.util.Date;
import java.util.List;

/**
 * @author zy.Lee
 * 2019/3/25 10:04
 */
public class User {
    String name;
    Date birthday;
    List<String> childNmae;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getChildNmae() {
        return childNmae;
    }

    public void setChildNmae(List<String> childNmae) {
        this.childNmae = childNmae;
    }
}
