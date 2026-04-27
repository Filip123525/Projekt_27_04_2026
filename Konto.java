public class Konto {
  private double saldo;

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double nowaWArtosc){
  if(nowaWArtosc > 0) {
    saldo = nowaWArtosc;
    } else {
    System.out.println("WArtosc musi byc weksza niz 0");
    reutrn;
    }  
}
