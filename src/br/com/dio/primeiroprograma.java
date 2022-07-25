package br.com.dio;

import br.com.dio.model.Gato;
public class primeiroprograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println("hello world!!");
        System.out.println(gato);
        Livro Livro = new Livro("minha versão de você", 350);
        System.out.println(Livro);

    }
}

class Livro {
    private String nome;
    private Integer numPáginas;

    public Livro(String nome, Integer numPáginas) {
        this.nome = nome;
        this.numPáginas = numPáginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPáginas() {
        return numPáginas;
    }

    public void setNumPáginas(Integer numPáginas) {
        this.numPáginas = numPáginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPáginas=" + numPáginas +
                '}';
    }
}