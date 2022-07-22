## Imersão Java - Alura-Stickers 💻

## Dia 01

CONSUMINDO UMA API DE FILMES COM JAVA ⚡

- O objetivo foi consumir a API do IMDb (até derubar) e exibir os filmes mais populares, destacando seus pôsteres e visualizando sua classificação.
- Desafios:
> Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.

> Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais!

> Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente

![image](https://user-images.githubusercontent.com/102323652/179871765-73efc750-92e3-4f28-a23a-c474432ef0da.png)


## Dia 02
GERANDO FIGURINHAS PARA WHATSAPP 🔥

- O objetivo foi criar um gerador de figurinhas explorando outras bibliotecas nativas do Java, para que possamos enviar por Whatsapp os nossos filmes preferidos!
- Desafios:
> Ler a documentação da classe abstrata InputStream.

> Centralizar o texto na figurinha.

> Fazer um pacote no Whatsapp e/ou Telegram com as suas próprias figurinhas!

> Criar diretório de saída das imagens, se ainda não existir.

> Colocar contorno (outline) no texto da imagem.

> Tratar as imagens retornadas pela API do IMDB para pegar uma imagem maior ao invés dos thumbnails. Opções: pegar a URL da imagem e remover o trecho mostrado durante a aula ou consumir o endpoint de posters da API do IMDB (mais trabalhoso), tratando o JSON retornado.

> Fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.

![image](https://user-images.githubusercontent.com/102323652/179871035-426b6a34-3dde-4368-87d9-43992c9e334e.png)

## Dia 03
LIGANDO AS PONTAS, REFATORAÇÃO E ORIENTAÇÃO A OBJETOS 🔥

- O objetivo foi melhorar nosso código com as refatorações necessárias para torná-lo mais flexível e fácil de entender.
- Desafios:
> Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16

> Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP

> Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra

> Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado

> Desafio supremo: consumir outras APIs que contém imagens, como a da Marvel, que é bem diferente. Repositório com APIs públicas: clique aqui.

## Dia 04
CRIANDO NOSSA PRÓPRIA API COM SPRING 💻

- O objeito foi construir uma API REST para expor nosso próprio conteúdo, utilizando ferramentas profissionais como o Spring Framework e um banco de dados NoSQL.
> Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma linguagem cadastrada;

> Devolver a listagem ordenada pelo ranking;

> Criar na sua API um modelo de entidade com nomes diferentes de title e image e criar seu próprio extrator de informações personalizado OU, manter com o nome title e image e traduzir para que seja retornado como título e imagem através do uso de DTO (Data Transfer Object);

> Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST;

> Desafio supremo: Aplicar modificações parciais no recurso através do método PATCH, por exemplo, modificando o número de votos ou de pessoas que utilizam cada linguagem de programação.
![image](https://user-images.githubusercontent.com/102323652/180332677-cfe7210d-004d-45cb-910a-f3e661e8998f.png)
<<<<<<< HEAD
![JavaScript](https://user-images.githubusercontent.com/102323652/180333197-6efe531e-b098-423d-a6df-8b618baa4286.png)
![Java](https://user-images.githubusercontent.com/102323652/180333554-28f60ab8-3b8b-4187-9597-fa2d6b7419a1.png)