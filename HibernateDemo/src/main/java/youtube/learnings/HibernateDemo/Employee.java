package youtube.learnings.HibernateDemo;





import javax.persistence.Entity;
import javax.persistence.Id;
//@Entity(name="entityname") - to create entity with any other name than that specified
//@Table(name="tablename") - to create table with any other name than that specified
@Entity
public class Employee {
	@Id
	int eid;
	String ename;
	//annotating column name
	//@Column(name="employee_age")
	int eage;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", getEid()=" + getEid()
				+ ", getEname()=" + getEname() + ", getEage()=" + getEage() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
