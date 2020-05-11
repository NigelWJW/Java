package Principle;
import java.util.*;
/**
 * 迪米特法则：又叫最少知道原则。一个类对自己依赖的类知道的越少越好
 * 被依赖的类尽量将逻辑封装在类的内部，或者说只与直接的朋友通信即出现在成员
 * 变量和方法参数返回值的类，出现在局部变量的类不是直接朋友是陌生类
 */
class SchoolEmployee{//学校员工类
    private String id;
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
}
class SchoolManager{//学校员工管理类，这里学院员工类不是直接朋友，是陌生类
    public List<SchoolEmployee> getAllEmployee(){
        List<SchoolEmployee> list = new ArrayList<>();
        for (int i =0;i<5;i++){
            SchoolEmployee schoolEmployee = new SchoolEmployee();
            schoolEmployee.setId("学校总部员工id= "+i);
            list.add(schoolEmployee);
        }
        return list;
    }
    public void print(CollegeManager collegeManager){
        List<CollegeEmployee> list = collegeManager.getAllEmployee();
        for (CollegeEmployee collegeEmployee:list){//输出学院员工
            System.out.println(collegeEmployee.getId());
        }
        List<SchoolEmployee> list1 = this.getAllEmployee();//输出学校员工
        for (SchoolEmployee schoolEmployee:list1){
            System.out.println(schoolEmployee.getId());
        }
    }
}
class CollegeEmployee{//学院员工类
    private String id;
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
}
class CollegeManager{//学院员工管理类
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0;i<10;i++){
            CollegeEmployee e = new CollegeEmployee();
            e.setId("学院员工id: " +i);
            list.add(e);
        }
        return list;
    }
}
public class Demeter {
    public static void main(String[] args) {
        //创建了一个 SchoolManager 对象
        SchoolManager schoolManager = new SchoolManager();
        //输出学院的员工id 和  学校总部的员工信息
        schoolManager.print(new CollegeManager());

    }
}
