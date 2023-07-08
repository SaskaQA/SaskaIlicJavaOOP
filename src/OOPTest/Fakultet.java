package OOPTest;

import java.util.ArrayList;

public class Fakultet implements Studije{
    ArrayList<Departman> listaDepartmana;

    public Fakultet(ArrayList<Departman> listaDepartmana) {
        this.listaDepartmana = listaDepartmana;
    }
    public Fakultet(){
        this.listaDepartmana = new ArrayList<>();
    }

    @Override
    public void dodajStudenta(Departman d, Student s) {
        int indexDepartmana = listaDepartmana.indexOf(d);
        listaDepartmana.get(indexDepartmana).getListaStudenata().add(s);
    }

    @Override
    public void izbaciStudenta(Departman d, Student s) {
        int indexDepartmana = listaDepartmana.indexOf(d);
        listaDepartmana.get(indexDepartmana).getListaStudenata().remove(s);
    }

    @Override
    public Departman najvecaZarada() {
        if (listaDepartmana.size() == 0){
            return null;
        }
        Departman max = listaDepartmana.get(0);
        for (Departman d : listaDepartmana){
            if (d.finansije() > max.finansije())
                max = d;
        }
        return max;
    }

    @Override
    public ArrayList<Student> sviApsolventi() {
        ArrayList<Student> apsolventi = new ArrayList<>();
        for (Departman d : listaDepartmana){
            for (Student s : d.listaStudenata){
                if (s.getTrenutnaGodinaStudiranja() == 4){
                    apsolventi.add(s);
                }
            }
        }
        return apsolventi;
    }

    public ArrayList<Departman> getListaDepartmana() {
        return listaDepartmana;
    }

    public void setListaDepartmana(ArrayList<Departman> listaDepartmana) {
        this.listaDepartmana = listaDepartmana;
    }

    @Override
    public String toString() {
        return "Ovaj fakultet ima departmane: " + listaDepartmana;
    }
}
