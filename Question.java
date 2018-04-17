package pro;

public class Question extends Test{
	public Question(String string) {
		super(string);
		this.otazku = "a";
		// TODO Auto-generated constructor stub
	}


	public Question() {
		// TODO Auto-generated constructor stub
		this.otazku ="ako";
		this.odpoved = "nie";
		this.spravnaOdpoved = "ano";
	}


	public String otazku;
	public String spravnaOdpoved;
	public String odpoved;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void set(String[] lol) {
		// TODO Auto-generated method stub
		this.otazku = lol[0];
		this.odpoved = lol[2];
		this.spravnaOdpoved = lol[1];
		
	}

}
