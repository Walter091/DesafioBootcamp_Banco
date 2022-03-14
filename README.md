# DesafioBootcamp_Banco
Primeiro desafio de código do bootcamp da GFT (Banco)

Domínio: Um banco oferece aos seus clientes dois tipos de contas (correntes e poupança), 
as quais possuem as funcionalidades de; depósito, saque e transferência entre contas da mesma instituição.

Nome do projeto: Caixi.

Conceitos aplicados neste programa: 

	POO e seus pilares;
	Mestre e detalhe;
	Herança e implementação de interfaces;
	Enumerados com interfaces;
	Organização de pacotes.

Extras: 
	Além do saque comum, adicionei a classe "ContaCorrente" um outro atributo,
	"CartaoCredito" que é uma classe que herda de "CartaoBase". 
	O intuito disso foi adicionar ao cliente uma nova forma de pagamento e de 
	retirada de dinheiro além do saque. Onde ele usa a operação "Cartao de crédito" e 
	consequentemente o valor não é debitado de seu saldo e sim do limite do cartão.
	(O valor é abatido de acordo com a quantidade de parcela: limite -= valor/qtdParcelas. 
