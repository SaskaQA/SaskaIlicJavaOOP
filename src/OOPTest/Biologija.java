package OOPTest;

import java.util.ArrayList;

public class Biologija extends Departman{
    public Biologija(ArrayList<Student> listaStudenata, String naziv) {
        super(listaStudenata, naziv);
    }

    public Biologija() {
    }

    @Override
    public double finansije() {
        return this.getListaStudenata().size() * 3000;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Finansije su: " + finansije();
    }
}
