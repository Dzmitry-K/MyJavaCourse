/**
 *       Создать класс Point, описывающий точку в двумерных координатах.
 *       Полями этого класса должны быть координаты x и y. Класс должен иметь один конструктор,
 *       принимающий координаты x и y. Сделайте информацию о координатах скрытой, а получить её
 *       можно только с помощью методов доступа (getById/set). Создать метод distance,
 *       принимающий объект Point и определяющий расстояние до неё.
 *
 *       -(Дополнительно) Сделайте этот класс неизменяемым(пример неизменяемого класса - java.lang.String).
 *       Предоставьте методы translate() и scale(). В частности, метод translate() должен перемещать точку на
 *       определенное расстояние в направлении координат х и у , а метод scale() — изменять масштаб по обеим
 *       координатам на заданный коэффициент. Реализуйте эти методы таким образом, чтобы они возвращали новые
 *       точки в качестве результата. Например, в следующей строке кода:\
 *
 *       Point р = new Point(3, 4).translate(1, 3).scale(2);
 *
 *       в переменной р должна быть установлена точка с координатами Point(8, 14), т.е. new Point(3, 4).translate(1, 3)
 *       == new Point(4, 7), а new Point(4, 7).scale(2) == Point(8, 14).
 */

package _2_oop._hw._hw_1_class;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow((point.x - this.x),2) + Math.pow((point.y - this.y),2));
    }

    public Point translate(int x, int y) {
        return new Point(this.x + x, this.y + y);
    }

    public Point scale(int s) {
        return new Point(this.x * s, this.y * s);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
