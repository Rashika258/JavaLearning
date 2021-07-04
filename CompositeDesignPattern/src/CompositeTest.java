
public class CompositeTest {
	public static void main(String[] args) {
		Component hd=new Leaf(4500,"harddrive");
		Component mouse=new Leaf(500,"Mouse");
		Component monitor=new Leaf(5500,"Monitor");
		Component ram=new Leaf(50000,"Ram");
		Component cpu=new Leaf(45000,"CPU");
		
		Composite ph=new Composite("Peri");
		Composite cabinet=new Composite("Cabinet");
		Composite mb=new Composite("MB");
		Composite computer=new Composite("Computer");
		
		mb.addComponent(mouse);
		mb.addComponent(ram);
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		ram.showPrice();
	}
}
