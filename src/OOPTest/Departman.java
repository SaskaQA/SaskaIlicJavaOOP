package OOPTest;

import java.util.ArrayList;

public abstract class Departman {
    ArrayList<Student> listaStudenata;
    String naziv;

    public Departman(ArrayList<Student> listaStudenata, String naziv) {
        this.listaStudenata = listaStudenata;
        this.naziv = naziv;
    }

    public Departman() {
        this.listaStudenata = new ArrayList<>();
    }

    public ArrayList<Student> vredni(double prosek){
        ArrayList<Student> vredniStudent = new ArrayList<>();
        for (Student s : listaStudenata){
            if (s.prosek() > prosek){
                vredniStudent.add(s);
            }
        }
        return vredniStudent;
    }
    public double prosekSvih(){
        int suma = 0;
        for (Student s : listaStudenata){
            suma += s.prosek();
        }
        return suma / listaStudenata.size();
    }
    public abstract double finansije();

    public ArrayList<Student> getListaStudenata() {
        return listaStudenata;
    }

    public void setListaStudenata(ArrayList<Student> listaStudenata) {
        this.listaStudenata = listaStudenata;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "U departmanu " + naziv + " su studenti: " + "\n" +
                listaStudenata;
    }
}
