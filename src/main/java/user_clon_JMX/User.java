package user_clon_JMX;


public class User implements Cloneable, CloneUserInterfaceMBean {
    private String name;
    private int age;
    boolean marriage;
    User parent;

    public User() {
    }

    public User(String name, int age, boolean marriage, User parent) {
        this.name = name;
        this.age = age;
        this.marriage = marriage;
        this.parent = parent;
    }

    public void setParameters(String name, int age, boolean marriage, User parent){
        this.name = name;
        this.age = age;
        this.marriage = marriage;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getMarriage() {
        return marriage;
    }

    public void setMarriage(boolean marriage) {
        this.marriage = marriage;
    }

    public User getParent() {
        return parent;
    }

    public void setParent(User parent) {
        this.parent = parent;
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        User clone = (User)super.clone();
        User parentClone = clone.getParent()==null ? null : clone.getParent().clone();
        clone.setParent(parentClone);
        return clone;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marriage=" + marriage +
                ", parent=" + parent +
                '}';
    }

    public String getObjectInfo() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marriage=" + marriage +
                ", parent=" + parent.toString() +
                '}';
    }

    public void printObjectInfo() {
        System.out.println("User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marriage=" + marriage +
                ", parent=" + parent.toString() +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (marriage != user.marriage) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return !(parent != null ? !parent.equals(user.parent) : user.parent != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (marriage ? 1 : 0);
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        return result;
    }



}
