package ptj;

import java.io.StringReader;
import java.net.URI;

import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 * @author DOMINIK ORLI—SKI
 */
@Path("test")
public class Test {

	/**
	 * Aplikacja kliencka testuje dzia≥anie polecania GET. 
	 * Dane pobrane ze strony sπ poddane unmarshallingowi w ten sposÛb transformujÍ strukturÍ XML do obiektu Javy.
	 * 
	 */
	public static void main(String[] args){
		try{
			Client client = ClientBuilder.newClient();
			URI uri = UriBuilder.fromUri("http://localhost:8080/RESTful/student").build();
			WebTarget webTarget = client.target(uri);
			String xmlAnswer = webTarget.request().accept(MediaType.TEXT_XML).get(String.class);
			
			JAXBContext jc = JAXBContext.newInstance(Student.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			Student student = (Student) unmarshaller.unmarshal(new StringReader(xmlAnswer));
			student.studentInfo();
			
			System.out.println("\n===== ODPOWIEDè W FORMIE XML =====\n\n"+xmlAnswer);
		}
		
		catch(Exception exception){
			System.out.println(exception.getMessage());
			exception.printStackTrace();
		}
	}
}
