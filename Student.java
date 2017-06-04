package ptj;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private String firstName;
	private String lastName;
	private Integer indexNo;
	private String mime;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getIndexNo() {
		return indexNo;
	}
	public void setIndexNo(Integer indexNo) {
		this.indexNo = indexNo;
	}
	public String getMime() {
		return mime;
	}
	public void setMime(String mime) {
		this.mime = mime;
	}
	public void studentInfo(){
		System.out.println("Imie: "+firstName+"\nNazwisko: "+lastName+"\nNumer indeksu: "+indexNo+"\nMime: "+mime);
	}
}