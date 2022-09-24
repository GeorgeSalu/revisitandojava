package classe;

public class EqualsHashcode {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "pedro silva";
		u1.email = "pedro.silva@gamil.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "pedro silva";
		u2.email = "pedro.silva@gamil.com";
		
		System.out.println(u1 == u2);
	}
}
