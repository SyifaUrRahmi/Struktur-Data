import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Menyimpan beberapa nilai di objek stack.
        for (int i = 0; i < 6; i++) {
            stack.push(i);
            System.out.print(i + " ");
        }
        System.out.println();

        // Mencari item dalam tumpukan. Posisi yang dikembalikan sebagai jarak dari
        // puncak
        // tumpukan. Mencari posisi ke-4.
        int position = stack.search(4);
        System.out.println("Search result position: " + position);

        // Nilai teratas tumpukan saat ini
        System.out.println("Stack top: " + stack.peek());

        // Memunculkan semua item objek tumpukan.
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}