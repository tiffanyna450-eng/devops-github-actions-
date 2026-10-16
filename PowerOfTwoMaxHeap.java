public class Main {
    public static void main(String[] args) {

        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(2);

        heap.insert(10);
        heap.insert(50);
        heap.insert(20);
        heap.insert(80);
        heap.insert(30);

        while (!heap.isEmpty()) {
            System.out.println(heap.popMax());
        }
    }
}
