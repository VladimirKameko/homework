package Generic.Ex3;

public class Ex_Test {
    public static void main(String[] args) {
        Table<Integer,String> table = new Table<>();
        table.Add(new Entry<>(1,"a"));
        table.Add(new Entry<>(2,"b"));
        table.Add(new Entry<>(3,"c"));
        table.Add(new Entry<>(4,"r"));
        table.Add(new Entry<>(5,"s"));
        System.out.println(table.getList());
        System.out.println(table.getValue(2));
        System.out.println(table.addValue(3,"q"));
        System.out.println(table.getValue(2));
        table.remove(5);
        System.out.println(table.getList());
    }
}
