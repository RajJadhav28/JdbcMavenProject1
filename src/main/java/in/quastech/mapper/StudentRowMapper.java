package in.quastech.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.quastech.bean.Student;

public class StudentRowMapper implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student std=new Student();
		std.setRollno(rs.getInt(1));
		std.setName(rs.getString(2));
		std.setMarks(rs.getDouble(3));
		return std;
	}
	
	

}
