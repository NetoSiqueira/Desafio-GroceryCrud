#language: pt
Funcionalidade:Verificação funcionalidade esxcluir o registro do cliente com sucesso;


  Contexto: Pre-condição Bootstrap v4 Theme selecionado
    Dado Que seleciono Bootstrap v4 Theme selecionado

  Cenario: Excluir registro com sucesso
    Dado que seleciono excluir registro
    E excluo o cliente
    Entao recebo uma mensagem de excluido