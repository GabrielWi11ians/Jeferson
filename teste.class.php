<?php

require_once("pessoa.class.php");

class Teste{
	private $pessoa;

	public function __construct(){
		$pessoa = new Pessoa();

		echo ("Nome: ");
		$pessoa->setNome("Gabriel Willians da Silva Alves");
		echo $pessoa->getNome()."<br>";

		echo ("Endereço: ");
		$pessoa->setEndereco("Rua Aloândia, 41");
		echo $pessoa->getEndereco()."<br>";

		echo ("Bairro: ");
		$pessoa->setBairro("Jd. Nordeste");
		echo $pessoa->getBairro()."<br>";

		echo ("Cep: ");
		$pessoa->setCep("03688-060");
		echo $pessoa->getCep()."<br>";

		echo ("Cidade: ");
		$pessoa->setCidade("São Paulo");
		echo $pessoa->getCidade()."<br>";

		echo ("Estado: ");
		$pessoa->setEstado("SP");
		echo $pessoa->getEstado();


	}
}new Teste();

?>