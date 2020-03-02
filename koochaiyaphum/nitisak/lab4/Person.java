/**
*
* Author: Nitisak Koochaiyaphum
* ID: 613040502-9
* Sec: 2
* Date: January 12, 2012
*
**/

package koochaiyaphum.nitisak.lab4;
public class Person  {
    String name;
    protected static double height;
    protected static double weight;
    static double numberOfPerson = 0;

  public Person() {// i
    name = "unknown";
    weight = 0.0;
    height = 0.0;
    numberOfPerson += 1;
  }

  public Person(String name) {// ii
    this.name = name;
    numberOfPerson += 1;
  }

  public Person(String name, double height, double weight) {// iii
    this.name = name;
    this.weight = weight;
    this.height = height;
    numberOfPerson += 1;
  }

  //
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  //
  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    Person.height = height;
  }
  public double getWeight() {
    return weight;
  }
  public void setWeight(double weight) {
    Person.weight = weight;
  }
  @Override
  public String toString() {
    return "person [height=" + height + ", name=" + name + ", numberOfPerson=" + numberOfPerson + ", weight=" + weight
        + "]";
  }
  public String getBMI() {
    double H_100 = height / 100;
    double BMI = (weight / (H_100 * H_100));
    return String.format("%.2f", BMI);
  }
  public static int getNumberOfPerson() {
    return (int) numberOfPerson;
	}
    
}