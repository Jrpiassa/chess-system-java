package utils;

public enum Mensagens {
	LINHAECOLUNAMAIORQUEZERO("Erro ao criar tabuleiro, a linha e coluna deve ser maior que zero"),
	POSITIONNOTONTHEBOARD("Posição não existe no tabuleiro!"),
	JAEXISTEUMAPECANESTAPOSICAO("Nesta posição já existe uma peça! "),
	POSICAODEXADREZINVAIDA("Posição de Xadrez inválida, os valores válidos são de A1 ate H8 e Coluna1 ate Coluna8 !"),
	ERROAOLERPOSICAODOXADREZ("Erro ao ler posição do xadrez. Os valores válidos são de A1 ate H8 e Coluna1 ate Coluna8 !."),
	NAOHAPECANAPOSICAODEORIGEM("Não há peça na posição de origem"),
	SOURCE("Origem: "), 
	TARGET("Destino: "),
	NAOHAMOVIMENTOSPOSSIVEISPARAAPECAESCOLHIDA("Não existe movimentos possiveis para a peça escolhida!");

	private String msg;

	private Mensagens(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}
