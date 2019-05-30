package _3_generics._hw._hw_1_generics;

public class TestTable {
    public static void main(String[] args) {
        Entry<Integer, String> entry1 = new Entry<>(1,"q");
        Entry<Integer, String> entry2 = new Entry<>(2,"w");
        Entry<Integer, String> entry3 = new Entry<>(3,"e");
        Table<Integer, String> table = new Table<>();
        table.add(entry1);
        table.add(entry2);
        table.add(entry3);

        System.out.println(table.getEntryList());
        System.out.println(table.getValue(2));

        table.addValue(1, "a");
        System.out.println(table.getEntryList());

        table.remove(2);
        System.out.println(table.getEntryList());
    }
}
