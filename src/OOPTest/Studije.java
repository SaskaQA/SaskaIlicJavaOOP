package OOPTest;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public interface Studije {
    void dodajStudenta(Departman d, Student s);
    void izbaciStudenta(Departman d, Student s);
    Departman najvecaZarada();
    ArrayList<Student> sviApsolventi();
}
