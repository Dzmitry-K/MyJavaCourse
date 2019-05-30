/**
 *   Видоизмените класс из предыдущего упражнения, введя методы mах() и min() для получения наибольшего
 *   и наименьшего из двух элементов. Наложите соответствующее ограничение на обобщенный тип Е.
 */

package _3_generics._hw._hw_1_generics;


public class getMax<T extends Comparable<T>> extends Pair<T>{

    public getMax(T firstElem, T secondElem) {
        super(firstElem, secondElem);
    }

    public getMax(Pair <T> pair) {
        super(pair.getFirstElem(), pair.getSecondElem());
    }

    public T maxPair(){
        return super.getFirstElem().compareTo(super.getSecondElem()) > 0 ? super.getFirstElem() : super.getSecondElem();
    }

    public T minPair() {
        return super.getFirstElem().compareTo(super.getSecondElem()) < 0 ? super.getFirstElem() : super.getSecondElem();
    }
}
