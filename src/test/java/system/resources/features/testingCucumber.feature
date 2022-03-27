#language: pt

@qualquer
Funcionalidade: Realizar compra

  @automated @chrome
  Esquema do Cenário: Adicionar item no carrinho
	Dado que o usuário acessou o site
	Quando o conteúdo da página principal é mostrado
	Então o usuário clica no menu e no submenu desejado
	  E escolhe o produto para adicionar
      E o usuário entrou no carrinho
	  E o conteúdo do carrinho é mostrado
	Então ele procede para compra
	  E a página de login é exibida
	  E ele digita o "<email>" e "<senha>"
	  E seleciona para iniciar sessão
    Então os enderecos de entrega são mostrados
	E o usuário confirma seu "<endereco>" de entrega para realizar compra

	  Exemplos:
		  | email                 | senha          | endereco                                    |
		  | jepysy@boximail.com   | Abcd1234!      | Noruega 156, Quito, Pichincha EC            |
		  | zisuwuj@inboxbear.com | Poke9876#      | Avenida de los Shyris, Quito, Pichincha EC  |