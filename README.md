# Métodos Avançados de Programação
## UNIESP Faculdades

## Professora

Drª Alana Morais (alanamm.prof@gmail.com)

## Aluno

Lucas Gabriel de Sousa Maciel.

## Padrão Comportamental:

Chain of Responsibility.

## Chain of Responsibility
É notório que à Chain of Responsibility ele é um padrão GOF, e sua principal função é evitar uma dependência entre um objetos. Tendo em vista um conjunto de série de objetos, como um objeto receptores e um objeto solicitante, isso é onde cada objetos de solicitação possui uma lógica interna, que separa quais são os tipos de objetos receptores que podem ser manipulados. Com isso é um padrão que utiliza a ideia de baixo acoplamento por permitir que outros objetos da cadeia tenham a oportunidade de tratar uma solicitação.

## Problema:
É evidente que quando está trabalhando em POO Programação orientada a objetos temos que tentar ao máximo preservar os objetos com um baixo acoplamento de informações, e fazendo com que falhas sejam evitada. Como função representa um encadeamento de objetos para realizar o processamento de uma série de requisições diferentes. Assim como uma solicitação pode ser tratada por mais de um objeto, essa solicitação poderá ser emitida entre vários objetos e o receptor não é necessário ser especificado explicitamente.

## Solução

É de fundamental que esse padrão permite que inúmeros objetos ajam uma solicitação sem acoplar a classe remetente e às classes concretas dos destinatários. Essa cadeia é capaz de ser composta dinamicamente em tempo de execução com qualquer handler que embora uma interface de handler do seu padrão.

## Consequências

Em razão dessas consequências tem como principal objetivo evitar o baixo acoplamento do transmissor de uma requisição com seus receptores, e com isso fazendo com que mais de um projeto tenha a chance de manipular a requisição. Dessa forma encadeia os objetos receptores e passar as requisições ao longo dessa cadeia e até que os objetos receptores passem a requisição por toda essa cadeia e que o objeto possa manipula-la.

## Exemplo

Código e Diagrama estão disponível no referido Link.


Diagrama: https://github.com/LucasGabriel02/M-T.-AV.-DE-PROGRAMA-O/blob/master/Diagrma%20Chain%20of%20Responsibility.jpg


Código: https://github.com/LucasGabriel02/M-T.-AV.-DE-PROGRAMA-O/tree/master/ProjetoChainOfResponsibility 

Exemplo do referido projeto no padrão Chain of Responsibility na linguagem JAVA.

______________________________________________________________________________________________________________________________


package visao;

import model.Cliente;

import model.Pizza;

import model.Portuguesa;

import model.Queijo;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente client = new Cliente(" Lucas Gabriel"," 81995142607"," lucas@gmail.com");
		
		Pizza pizz = new Pizza(" 4 Queijo"," Tamanho Familia", null, null, null);
		
		Portuguesa portgue =  new Portuguesa(" Cobertura na Borda de Chocolate"," Queijo com Calabresa", null, null, null, null, null);

		Queijo queij = new Queijo ("Sem Cobertura", "Portuguesa", null, null, null, null, null);
		
		System.out.println(client);
		
		System.out.println(pizz);
		
		System.out.println(portgue);
		
		System.out.println(queij);
		
	}

}


______________________________________________________


package model;

public class Cliente {
	
	private String nome;
	
	private String numero;
	
	private String email;

	
	// Construtor
	
	public Cliente(String nome, String numero, String email) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.email = email;
	}
	
	

	// Get e Set

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", numero=" + numero + ", email=" + email + "]";
	}
	
}


_____________________________________________________________________________________________


package model;

public class Pizza extends Cliente {
	
	private String sabor;
	
	private String tamanho;
	
	
	// Construtor
	

	public Pizza(String nome, String numero, String email, String sabor, String tamanho) {
		super(nome, numero, email);
		this.sabor = sabor;
		this.tamanho = tamanho;
	}


	
	// Get e Set
	
	
	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public String getTamanho() {
		return tamanho;
	}


	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}



	@Override
	public String toString() {
		return "Pizza [Sabor: Queijo=" + sabor + ", Tamanho: Tamanho Familia=" + tamanho + "]";
	}
	
}


________________________________________________________________________________________________________


package model;

public class Portuguesa extends Pizza{
	
	private String cobertura;
	
	private String doisSabores;

	
	
	// Construtor
	
	public Portuguesa(String nome, String numero, String email, String sabor, String tamanho, String cobertura,
			String doisSabores) {
		super(nome, numero, email, sabor, tamanho);
		this.cobertura = cobertura;
		this.doisSabores = doisSabores;
	}



	// Get e Set
	
	public String getCobertura() {
		return cobertura;
	}



	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}



	public String getDoisSabores() {
		return doisSabores;
	}



	public void setDoisSabores(String doisSabores) {
		this.doisSabores = doisSabores;
	}



	@Override
	public String toString() {
		return "Portuguesa [ Cobertura na Borda de Chocolate=" + cobertura + ", Sabor: Queijo com Calabresa=" + doisSabores + "]";
	}
	
}


__________________________________________________________________________________________________________________________________



package model;

public class Queijo extends Pizza{
	
	private String cobertura;
	
	private String doisSabores;

	public Queijo(String nome, String numero, String email, String sabor, String tamanho, String cobertura,
			String doisSabores) {
		super(nome, numero, email, sabor, tamanho);
		this.cobertura = cobertura;
		this.doisSabores = doisSabores;
	}
	
	
	// Get e Set
	

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	public String getDoisSabores() {
		return doisSabores;
	}

	public void setDoisSabores(String doisSabores) {
		this.doisSabores = doisSabores;
	}


	@Override
	public String toString() {
		return "Queijo [ Cobertura: Sem Cobertura=" + cobertura + ", Sabor: Portuguesa=" + doisSabores + "]";
	}
	
}
