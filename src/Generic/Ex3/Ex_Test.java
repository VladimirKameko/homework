package Generic.Ex3;

public class Ex_Test {
    public static void main(String[] args) {
        Table<Integer, String> table = new Table<>();
        table.add(new Entry<>(1, "a"));
        table.add(new Entry<>(2, "b"));
        table.add(new Entry<>(3, "c"));
        table.add(new Entry<>(4, "r"));
        table.add(new Entry<>(5, "s"));
        System.out.println(table.getList());
        System.out.println(table.getValue(2));
        System.out.println(table.updateValue(3, "q"));
        table.remove(1);
        System.out.println(table.getList());
    }
}
