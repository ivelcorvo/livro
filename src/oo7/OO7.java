/*
------------------
Pessoa
------------------
  -nome
  -idade
  -sexo
------------------
  +fazerAniver()
------------------
 |
<>
 |
------------------
Livro
------------------
  -titulo
  -autor
  -totPag
  -pagAtual
  -aberto
  -leitor
-----------------
  +detales()
-----------------

-----------------
<<interface>>
Publicaçao
-----------------
  +abrir()
  +fechar()
  +folhear()
  +avançarPag()
  +voltarPag()
-----------------
    */
package oo7;
public class OO7 {

    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[3];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Levi", 21, "Masculino");
        p[1] = new Pessoa("Isa", 17, "Feminino");
        
        l[0] = new Livro("aliens","ripley", 300,p[0]);
        l[1] = new Livro("casmurro","sei la",200,p[1]);
        l[2] = new Livro("exorcista","evil",150,p[0]);
        
        l[1].abrir();
        l[1].folhear(150);
        //p[0].setNome("levi");
        System.out.println(p[1].getNome());
        System.out.println(l[1].detalhes());
    }
    
}
