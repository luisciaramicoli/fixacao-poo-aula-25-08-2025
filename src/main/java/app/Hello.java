package app;

public class Hello {
    public static void main(String[] args) {
        // System.out.println("Olá Mundo!!");

        // Genero g1 = new Genero();
        // g1.setNome("Joao");
        // System.out.println(g1.getNome());

        // Genero id = new Genero();
        // id.setId(1);
        // System.out.println(id.getId());

        // Genero g = new Genero(2, "Luis");
        // System.out.println(g.getNome());

        // Genero g2 = new Genero(0, "");
        // System.out.println(g2.getId());
        // System.out.println(g2.getNome());

        Genero policial = new Genero(1,"Policial");
        Genero Aventura = new Genero(2,"Aventura");
        Genero Terror = new Genero(3,"Terror");

        Filme f1 = new Filme();
        f1.setId(1);
        f1.setTitulo("A Sociedade do Anel");
        f1.setGenero(Aventura);

        // System.out.println(f1.getTitulo());
        
        Filme f2 = new Filme(2,"Duna", Aventura);
        Filme f3 = new Filme(2,"Entre Facas e Segredos", policial);

        System.out.println(f1);
        System.out.println(f2.getTitulo());
        System.out.println(f3.getTitulo());
    }
        
}

