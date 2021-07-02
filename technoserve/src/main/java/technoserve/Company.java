package technoserve;
@Entity
public class Company {
	@Id
	int Cid;
	@Column(name="cname")
	String Name;
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	

}
