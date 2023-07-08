package OOPTest;

import java.util.ArrayList;

public class Student {
    private String ime;
    private ArrayList<Integer> listaOcena;
    private int trenutnaGodinaStudiranja;

    public Student(String ime, ArrayList<Integer> listaOcena, int trenutnaGodinaStudiranja) {
        this.ime = ime;
        this.listaOcena = listaOcena;
        this.trenutnaGodinaStudiranja = trenutnaGodinaStudiranja;
    }

    public Student() {
        this.ime = "";
        this.listaOcena = new ArrayList<>();
    }
    public double prosek(){
        int suma = 0;
        for (int o : listaOcena){
            suma += o;
        }
        return suma / listaOcena.size();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public ArrayList<Integer> getListaOcena() {
        return listaOcena;
    }

    public void setListaOcena(ArrayList<Integer> listaOcena) {
        this.listaOcena = listaOcena;
    }

    public int getTrenutnaGodinaStudiranja() {
        return trenutnaGodinaStudiranja;
    }

    public void setTrenutnaGodinaStudiranja(int trenutnaGodinaStudiranja) {
        this.trenutnaGodinaStudiranja = trenutnaGodinaStudiranja;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student ").append(ime).append(" je na ").append(trenutnaGodinaStudiranja).append(" godini studiranja ").append("\n")
                .append("Ocene su mu/joj: ").append(listaOcena);
        return sb.toString();
    }
}
