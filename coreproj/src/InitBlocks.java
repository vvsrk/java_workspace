class Game {
	static String s = "-";
	String s2 = "s2";

	Game(String arg) {
		s += arg;
	}
}

public class InitBlocks extends Game {
	InitBlocks() {
		super("s2");
	}

	{
		s += "i ";
	}

	public static void main(String[] args) {
		new InitBlocks();
		System.out.println(s);
	}

	static {
		s += "sb ";
	}
}