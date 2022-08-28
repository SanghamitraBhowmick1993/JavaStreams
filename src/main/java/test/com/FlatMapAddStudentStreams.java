package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	int sid;
	String sname;
	char grade;
	
	public Student(int sid,String sname,char grade) {
		this.sid=sid;
		this.sname=sname;
		this.grade=grade;
	}
}


public class FlatMapAddStudentStreams {

	public static void main(String[] args) {
	List<Student> sl1 = new ArrayList<Student>();
	sl1.add(new Student(1,"tom",'A'));
	sl1.add(new Student(2,"lisa",'B'));
	sl1.add(new Student(1,"mike",'C'));

	List<Student> sl2 = new ArrayList<Student>();
	sl2.add(new Student(1,"scot",'A'));
	sl2.add(new Student(2,"mary",'B'));
	sl2.add(new Student(1,"john",'C'));
	
	List<List<Student>> stuFinal = Arrays.asList(sl1,sl2);
	List<String> lstudent = stuFinal.stream().flatMap(s -> s.stream()).map(s ->s.sname).collect(Collectors.toList());
	System.out.println(lstudent);

	}

}
