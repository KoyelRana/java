class Student{
 int roolno;
String name;
 String department;

public void setName(String name){
this.name=name;
}

public String getName(){
System.out.println(name);
return name;
}

public String toString(){
return roolno+" "+name +" "+department;
}
}
class StudentTest {
static Student student = new Student();
public static void main(String[] args) {

addNewStudent("MohanaPriya");

//System.out.println(student);
}

static void addNewStudent(String name) {
student.setName(name);
student.getName();
}
}