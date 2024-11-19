package BAI1;

public class Test {
	public static void main(String[] args) {
		Person a=new Person("Nguyen The Vinh","2005","Nghe An",'F',"ngvinh26992005@gmail.com","0967032357");
		System.out.println(a);
		
		a.setName("NGUYEN THE VINH");
        System.out.println(a.getName());

		a.setDob("26/09/2005");
        System.out.println(a.getDob());

		a.setPod("Vinh City, Nghe An");
        System.out.println(a.getPod());

		a.setGender('M');
        System.out.println(a.getGender());

		a.setEmail("ntv2609@gmail.com");
        System.out.println(a.getEmail());
        
		a.setPhone("0987654321");
        System.out.println(a.getPhone());
	}
}