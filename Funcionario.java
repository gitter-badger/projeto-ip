
public class Funcionario extends Pessoa {
	String nome;
	String cpf;
	String cargo;
	String datanasc;
	String endereco;
	
	public Funcionario(String nome, String cpf, String cargo) {
		//super(nome, cpf); impl�cito por causa do construtor em Pessoa?
		this.cargo = cargo;
	}
	public Funcionario(String nome, String cpf, String cargo, String datanasc, String endereco) {
		super(nome, cpf, datanasc, endereco);
		this.cargo = cargo;
	}
	
	public void atualizarFuncionario() {
		
		
	}
	public Funcionario getFuncionario() {
		return new Funcionario(this.nome, this.cpf, this.cargo, this.datanasc, this.endereco);
	}
	//TODO: fazer um m�todo gen�rico para getters e setters 
	/*public void getFuncionario() {
		super.getPessoa();	
	}*/
	public Livro procurarLivro(String nome) {
		super.procurarLivro(nome);
	}
	super.procurarLivro(String autor);
}
