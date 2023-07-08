package OOPTest;

import java.util.ArrayList;

public class Informatika extends Departman {
    public Informatika(ArrayList<Student> listaStudenata, String naziv) {
        super(listaStudenata, naziv);
    }

    public Informatika() {
    }

    @Override
    public double finansije() {
        return (listaStudenata.size() / 2) * 5000;
    }
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Finansije su: " + finansije();
    }
}
