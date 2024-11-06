package in.quastech.Test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.quastech.bean.Student;
import in.quastech.mapper.StudentRowMapper;
import in.quastech.resource.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	int stdrollno=103;
//    	String stdname="Raj";
//    	double stdmarks=45.0;
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
//        String sql="insert into student values(?,?,?)";
//        int count=jdbcTemplate.update(sql,stdrollno,stdname,stdmarks);
//        if(count>0) {
//        	System.out.println("Successfully added");
//        }else {
//        	System.out.println("Row not added");
//        }
        
//        String stdname="Yuvraj";
//        int stdrollno=103;
//    	double stdmarks=45.0;
//        String sql="update student set stdname=?,stdmarks=? where stdrollno=?";
//        int count=jdbcTemplate.update(sql,stdname, stdmarks, stdrollno);
//        if(count>0) {
//        	System.out.println("updated successfully");
//        }else {
//        	System.out.println("Not updated");
//        }
        
//        String stdname = "Yuvraj";
//        int stdrollno = 103;
//        double stdmarks = 45.0;
//        String sql = "delete from student where stdrollno=?";
//        int count = jdbcTemplate.update(sql, stdrollno);  // Correct method and argument
//
//        if (count > 0) {
//            System.out.println("Deleted successfully");
//        } else {
//            System.out.println("Failed to delete");
//        }
        
        
//        String sql="select * from student";
//        List<Student>list=jdbcTemplate.query(sql, new StudentRowMapper());
//        for(Student li:list) {
//        	System.out.println("Stdroll:"+li.getRollno());
//        	System.out.println("Stdname:"+li.getName());
//        	System.out.println("Stdmarks:"+li.getMarks());
//        	System.out.println("-----------------------------------");
//        }
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rollno");
        int stdrollno=sc.nextInt();
        String sql="select * from student where stdrollno=?";
        List<Student>list=jdbcTemplate.query(sql, new StudentRowMapper(),stdrollno);
        for(Student li:list) {
        	System.out.println("Stdroll:"+li.getRollno());
        	System.out.println("Stdname:"+li.getName());
        	System.out.println("StdMarks:"+li.getMarks());
        	System.out.println("-----------------------");
        }
        
        
        
        
    }
}
