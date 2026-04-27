public class Robot {
  String model;
  int poziomBaterii;

  public void przedstawSie() {

  System.out.println("Model: " + model ", Poziom Baterii:" + poziomBaterii); 
  }

  public void static void main(String[] args) {
  Robot robot = new Robot();
    robot.poziomBaterii = 100;
    robot.model = "Xiaomi remi note 10 pro";
    robot.przedstawSie();
  }
}
