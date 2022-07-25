![image](https://user-images.githubusercontent.com/102323652/180563163-064cb677-b8d0-45fa-9009-34235969003a.png)

<h1 align="center"> Imersão Java - Alura-Stickers 💻🔥 </h1>

| 🪧 Vitrine.Dev |     |
| -------------  | --- |
| ✨ Nome        | Imersão Java - Alura Sticker 💻🔥
| 🏷️ Tecnologias | Java, Spring, MongoDB, Heroku, Git
| 🚀 URL         | https://linguagens-imersao-alura-api.herokuapp.com/linguagens
| 🤿 Desafio | https://www.alura.com.br/imersao-java

## Dia 01 - CONSUMINDO UMA API DE FILMES COM JAVA 🔨

O objetivo foi consumir a API do IMDb (até derubar) e exibir os filmes mais populares, destacando seus pôsteres e visualizando sua classificação.
## :hammer: Desafios:
- Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.

- Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais!

- Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente

![image](https://user-images.githubusercontent.com/102323652/179871765-73efc750-92e3-4f28-a23a-c474432ef0da.png)


## Dia 02 - GERANDO FIGURINHAS PARA WHATSAPP 🔨

O objetivo foi criar um gerador de figurinhas explorando outras bibliotecas nativas do Java, para que possamos enviar por Whatsapp os nossos filmes preferidos!
## :hammer: Desafios:
- Ler a documentação da classe abstrata InputStream.

- Centralizar o texto na figurinha.

- Fazer um pacote no Whatsapp e/ou Telegram com as suas próprias figurinhas!

- Criar diretório de saída das imagens, se ainda não existir.

- Colocar contorno (outline) no texto da imagem.

- Tratar as imagens retornadas pela API do IMDB para pegar uma imagem maior ao invés dos thumbnails. Opções: pegar a URL da imagem e remover o trecho mostrado durante a aula ou consumir o endpoint de posters da API do IMDB (mais trabalhoso), tratando o JSON retornado.

- Fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.

![image](https://user-images.githubusercontent.com/102323652/179871035-426b6a34-3dde-4368-87d9-43992c9e334e.png)

## Dia 03 - LIGANDO AS PONTAS, REFATORAÇÃO E ORIENTAÇÃO A OBJETOS 🔨

O objetivo foi melhorar nosso código com as refatorações necessárias para torná-lo mais flexível e fácil de entender.
## :hammer: Desafios:
- Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16

- Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP

- Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra

- Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado

- Desafio supremo: consumir outras APIs que contém imagens, como a da Marvel, que é bem diferente. Repositório com APIs públicas: clique aqui.

## Dia 04 - CRIANDO NOSSA PRÓPRIA API COM SPRING 🔨

O objetivo foi construir uma API REST para expor nosso próprio conteúdo, utilizando ferramentas profissionais como o Spring Framework e um banco de dados NoSQL.
## :hammer: Desafios:
- Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma linguagem cadastrada;

- Devolver a listagem ordenada pelo ranking;

- Criar na sua API um modelo de entidade com nomes diferentes de title e image e criar seu próprio extrator de informações personalizado OU, manter com o nome title e image e traduzir para que seja retornado como título e imagem através do uso de DTO (Data Transfer Object);

- Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST;

- Desafio supremo: Aplicar modificações parciais no recurso através do método PATCH, por exemplo, modificando o número de votos ou de pessoas que utilizam cada linguagem de programação.

📁 Resultados:
![image](https://user-images.githubusercontent.com/102323652/180560708-0f64d482-f6ff-4596-a2ea-b13c8424b6f1.png)
![image](https://user-images.githubusercontent.com/102323652/180557228-cade641d-2110-4ee6-acbd-e8ba92e86785.png)

## Dia 05 - PUBLICANDO NOSSA API NO CLOUD ⚡

Vamos tornar nossa aplicação acessível por qualquer pessoa, fazendo o deploy na nuvem. Além disso, vamos gerar figurinhas a partir do conteúdo dessa nossa API.

## :hammer: Desafios:
- Compartilhe com seus amigos a sua URL do Heroku, para que eles possam consumir a sua API (com o padrão de atributos title e image) e gerar figurinhas do conteúdo que você utilizou (linguagens de programação, filmes, músicas);

- Colocar a aplicação no cloud da Oracle;

- Implementar algum mecanismo de votação na API, para que outros amigos votem nas linguagens preferidas para que se possa fazer um ranking;

- Desafio supremo: Evoluir o projeto das três primeiras aula para que ele gere um bundle de stickers, para que se possa fazer o download e já incluir vários stickers no WhatsApp; Usar os conhecimentos aprendidos em alguma imersão React da Alura e fazer uma aplicação front-end para gerar esse bundle, onde possa se passar a URL do conteúdo e já visualizar os stickers;


## :hammer: Links para acessar a API

- `Link da API`: https://linguagens-imersao-alura-api.herokuapp.com
- `Link do Repositório`: https://github.com/getmarcos/linguagens-api
## 🛠️ Abrir e rodar o projeto

**Com a URL da API, basta adicionar /linguagens e você para que o resultado retorne para você**

**Para mais operações, como DELETE, PUT, PATCH basta adicionar /linguagens/{id}**

## ✔️ Técnicas e tecnologias utilizadas

- ``Java 17``
- ``Visual Studio Code``
- ``Spring``
- ``Paradigma de orientação a objetos``

## Agradecimentos
É um prazer participar de uma intensa semana de aprendizado, com pessoas muito qualificadas. Sem dúvidas essa semana foi fundamental e decisiva na reafirmação da minha escolha, é aqui que devo investir.
E agora, ALURA + ONE!
