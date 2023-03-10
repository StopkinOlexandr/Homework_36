//    Задача 1
//    Создайте класс Soda (для определения типа газированной воды).
//
//    У класса должен быть конструктор, принимающий 1 аргумент при инициализации -
//    строку добавка (например, "малина"), отвечающий за добавку к выбираемому лимонаду.
//
//    В этом классе реализуйте метод public String GetMyDrinkString(),
//    возвращающий строку Газировка и {добавка} в случае наличия добавки.
//
//    Если добавки нет, нужно вернуть строку "Обычная газировка".
public class Soda {
  private String additive;

  public Soda() {

  }

  public Soda(String additive) {
    this.additive = additive;
  }

  public String getMyDrinkString() {
    if (additive == null) {
      return "Обычная газировка";
    }
    return "Газировка и " + additive;
  }
}
