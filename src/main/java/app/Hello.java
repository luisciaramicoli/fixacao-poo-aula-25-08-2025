package app;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!!");

        Genero g1 = new Genero();
        g1.setNome("Joao");
        System.out.println(g1.getNome());

        Genero id = new Genero();
        id.setId(1);
        System.out.println(id.getId());

        Genero g = new Genero(2, "Luis");
        System.out.println(g.getNome());

        Genero g2 = new Genero(0, "");
        System.out.println(g2.getId());
        System.out.println(g2.getNome());
    }
        
}

