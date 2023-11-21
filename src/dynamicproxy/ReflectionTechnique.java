package dynamicproxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTechnique {

    //This is called reflectionTechnique
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //This loads the class
        Class<StudentInfo> studentInfo = (Class<StudentInfo>) Class.forName("dynamicproxy.StudentInfo");
        //This instantiates
        StudentInfo studentInfo1 = studentInfo.newInstance();

        Class[] methodArgTypes = new Class[]{String.class};

        Method method = studentInfo1.getClass().getDeclaredMethod("attendSession", methodArgTypes);
        method.invoke(studentInfo1, "Krishna");
    }
}
