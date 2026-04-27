Class Zwierze {
 void wydajDzwiek() {
 System.out.println("Dźwięk zwierzęcia");
 }
}
Class Kot extends Zwierze {
 @Override
 public void wydajDzwiek() {
  System.out.println("Miau");
  }
}
