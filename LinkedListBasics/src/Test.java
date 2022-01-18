public class Test {
    public static void main(String[] args) {
        LinkedList shoppingCart = new LinkedList();
        shoppingCart.add("rolls",2);
        shoppingCart.add("jam", 3);
        shoppingCart.add("milk", 1);
        System.out.println(shoppingCart.size());
        shoppingCart.display();
        System.out.println("******");
        shoppingCart.deleteTheHeadNode();
        shoppingCart.display();
        shoppingCart.contains("jam");
    }
}
