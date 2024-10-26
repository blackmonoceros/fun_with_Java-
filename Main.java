class Ksiazka {
    private String tytul;
    private String autor;
    private int rokWydania;

    public Ksiazka(String tytul, String autor, int rokWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }
}

class Autor extends Ksiazka {
    private String autor;

    public Autor(String tytul, String autor, int rokWydania, String autorKsiazki) {
        super(tytul, autor, rokWydania);
        this.autor = autorKsiazki;
    }

    public String getAutorKsiazki() {
        return autor;
    }
}

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Lalka", "B. Prus", 1887, "Prus");

        System.out.println("Tytuł: " + autor.getTytul());
        System.out.println("Autor: " + autor.getAutor());
        System.out.println("Rok wydania: " + autor.getRokWydania());
        System.out.println("Autor książki: " + autor.getAutorKsiazki());
    }
}
