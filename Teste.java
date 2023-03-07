
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Teste {
	public static void main(String[] args) {
   /* Aluno i = new Aluno("Gabriel", "123.456.789-00", 12);
    i.matricula = "XXXX99999";
                //System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + i.nome);
		//System.out.println("CPF: " + i.cpf);
		//System.out.println("Data de nascimento: " + i.data_nascimento.toString());
                
    System.out.println("Nome: " + i.nome + "\n" +
    "Idade: " + i.idade + "\n" +
    "Matrícula: " + i.matricula);*/
   
   //Polimorfismo
    Pessoa p1 = new Professor();
    System.out.println("Valor do auxilio recebido pela pessoa: " + p1.obterValorAuxilio());
    Pessoa p2 = new Aluno();
    System.out.println("Valor do auxilio recebido pela pessoa: " + p2.obterValorAuxilio());

	}
}
