package immutable_student;

public class ImmutableStudent {
    // immutable class je trieda, z ktorej ked vytvorime objekt, jeho stav je mozne nastavit len raz a
    // nasledne ho nie je mozne zmenit


    private int vek;
    private String meno;
    private double priemerZnamok;

//    vytvor viacero kostruktorov

    public ImmutableStudent(int vek, String meno, double priemerZnamok) {
        this.vek = vek;
        this.meno = meno;
        this.priemerZnamok = priemerZnamok;
    }


    // vygeneruj getre a setre pre všetky inštančne premenne


    public int getVek() {
        return vek;
    }



    public String getMeno() {
        return meno;
    }



    public double getPriemerZnamok() {
        return priemerZnamok;
    }


    // to String() - vrati textovu reprezentaciu stavu objektu

    @Override
    public String toString() {
        return "Student{" +
                "vek=" + vek +
                ", meno='" + meno + '\'' +
                ", priemerZnamok=" + priemerZnamok +
                '}';
    }

}
