package TestSpring;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class ServiceStudent
{
	public List<Student> getStudent(){
		return List.of(
				new Student(
						"cheikh",
                        "diop",
                        LocalDate.of(2002, Month.APRIL, 11)
						),
				new Student(
						"fallou",
						"gueye",
						LocalDate.of(2000, Month.AUGUST, 23))
				
				);
	}
}
