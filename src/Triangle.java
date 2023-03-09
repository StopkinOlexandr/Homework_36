//    Задача 2
//    Создайте класс Triangle (треугольник), принимающий три целых значения -
//    длины трёх сторон треугольника.
//
//    В конструкторе нужно проверить введённые значения на корректность (например,
//    длины не могут быть отрицательными).
//
//    В классе должен быть описан отдельный статический метод
//    public static bool checkSides(int a, int b, int c),
//    который должен проверить неравенство треугольника.
//
//    Этот метод необходимо использовать в конструкторе.
//
//    При провале любой из проверок нужно вывести на экран соответствующее сообщение.
public class Triangle {
  private int a;
  private int b;
  private int c;


  public Triangle(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
    String result;
    if (a <= 0 || b <= 0 || c <= 0) {
      result = "Incorrect sides dimensions";
      printTriangleCheck(result);
    } else {
      result = checkSides(a, b, c);
      printTriangleCheck(result);
    }
  }

  public static String checkSides(int a, int b, int c) {
    if (a + b < c || b + c < a || a + c < b) {
      return "Triangle is unequal";
    }
    return null;
  }

  public static void printTriangleCheck(String res) {
    if (res != null) {
      System.out.println(res);
    }
  }
}
