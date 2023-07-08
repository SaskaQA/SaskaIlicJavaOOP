package OOPTest;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> listaOcena = new ArrayList<>();
        listaOcena.add(9);
        listaOcena.add(10);
        listaOcena.add(7);
        Student saska = new Student("Saska", listaOcena, 4);
        Student adam = new Student ("Adam", listaOcena, 6);
        System.out.println(saska);
        ArrayList<Student> listaStudenata = new ArrayList<>();
        listaStudenata.add(saska);
        Biologija b = new Biologija(listaStudenata, "Biologija");
        System.out.println(b);
        Hemija h = new Hemija(listaStudenata, "Hemija");
        System.out.println(h);
        System.out.println(h.vredni(7.5));
        Informatika info = new Informatika(listaStudenata, "Informatika");

        ArrayList<Departman> departmani = new ArrayList<>();
        departmani.add(b);
        departmani.add(h);
        departmani.add(info);
        Fakultet beograd = new Fakultet(departmani);
        System.out.println();
        System.out.println(beograd);
        System.out.println(beograd.sviApsolventi());
        System.out.println();
        System.out.println(beograd.najvecaZarada());
        beograd.dodajStudenta(b, adam);
        System.out.println();
        System.out.println(beograd);
        System.out.println();
        beograd.izbaciStudenta(b, adam);
        System.out.println(beograd);
    }

}
