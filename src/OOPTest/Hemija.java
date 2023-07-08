package OOPTest;

import java.util.ArrayList;

public class Hemija extends Departman{
    public Hemija(ArrayList<Student> listaStudenata, String naziv) {
        super(listaStudenata, naziv);
    }

    public Hemija() {
    }

    @Override
    public double finansije() {
        return (listaStudenata.size() / 2) * 4000;
    }
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Finansije su: " + finansije();

    }
}
