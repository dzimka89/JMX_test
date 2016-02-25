package user_clon_JMX;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class JMX_test {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, CloneNotSupportedException {
        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
        User cloneUser = new User("Vasya", 25, true, new User("Valera", 42, true, null));
        StandardMBean userMBean = new StandardMBean(cloneUser, CloneUserInterfaceMBean.class);
        ObjectName objectName = new ObjectName("CloneUserInterfaceMBean:name=userClone");
        platformMBeanServer.registerMBean(userMBean, objectName);

        while(true);
        
//        User parent = new User("Vasya", 25, true, new User("Valera", 42, true, null));
//        User parentClone = parent.clone();
//        parent.printObjectInfo();
//        parentClone.setParameters("Koka", 2 , false, new User("Kuka", 57, true, null));
//        System.out.println();
//        parentClone.printObjectInfo();
//        System.out.println(parentClone.toString());
//
//        Object object = new Object();
//        object.toString();

    }
}
