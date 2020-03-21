package bean;

public class students {
    String name;
    Integer age;
//*********************************
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

