Public
class Paliwo()
{
  public String typ = "Benzyna";
}

public class Silnik {
public void zatankuj(Paliwo p) {
  System.out.println("TAnkowanie typu:" p.typ);

  }
}

public class Main {
  public static void main(String[] args) {
    Silnik s = new Silnik();
    Paliwo bak = new Paliwo();
    s.zatankuj(bak);
  }
}
