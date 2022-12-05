import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList <String> mass = new LinkedList<>();

        mass.add("Cherry");
        mass.add("belly");
        mass.add("smelly");
        System.out.println(mass);
        System.out.println();
        System.out.println(Reverser(mass));
    }

    public static LinkedList<String> Reverser(LinkedList<String> array){
        LinkedList<String> reversed = new LinkedList<String>();
        for (int i = array.size()-1; i>=0; i--){
            reversed.add(array.get(i));
        }
        return reversed;
    }
}