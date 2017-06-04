package ptj;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/student")
public class StudentResource {
	@GET
	@Produces({ MediaType.TEXT_XML })
	public Student getHTML() {
		Student student = instanteStudent();
		student.setMime(MediaType.TEXT_XML.toString());
		return student;
	}

	private Student instanteStudent() {
		Student student = new Student();
		student.setFirstName("Jan");
		student.setLastName("Nowak");
		student.setIndexNo(268817);
		student.setMime(MediaType.APPLICATION_XML.toString());
		return student;
	}
}