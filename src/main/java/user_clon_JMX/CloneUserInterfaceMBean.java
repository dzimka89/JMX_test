package user_clon_JMX;

/**
 * Created by Dmitriy on 25.02.2016.
 */
public interface CloneUserInterfaceMBean {

    User clone() throws CloneNotSupportedException;

    void setParameters(String name, int age, boolean marriage, User parent);

    String getObjectInfo();

    void printObjectInfo();

}
