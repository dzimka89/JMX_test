package user_clon_JMX;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class JMX_test {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
        CloneUserInterfaceMBean cloneUserInterfaceMBean = new User("Vasya", 25, true, new User("Valera", 42, true, null));
        ObjectName objectName = new ObjectName("CloneUserInterfaceMBean:name=userClone");
        platformMBeanServer.registerMBean(cloneUserInterfaceMBean, objectName);

        while(true);

    }
}
