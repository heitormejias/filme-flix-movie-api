# FilmeFlix
Serviço de Filmes por Streaming

# Swagger e Collections do Postman 
A documentação das API's está disponível sob o diretorio raiz do projeto
- /api


# Buildando a solução:
Para buildar a solução é necessário ter docker e docker-compose disponível:
- Execute o maven para buildar o projeto
```
mvn clean install
```
- Acesse o diretório raiz do projeto via linha de comando e digite:
```
docker-compose up --build -d
```

# Rodando a solução:
Após executar o build da aplicação:
- Abra as collections no postman e execute as chamadas disponíveis

Os serviços estarão disponíveis:
- [GET] http://localhost:8080/filmeflix/movie/
- [GET] http://localhost:8080/filmeflix/movie/recently
- [POST] http://localhost:8080/filmeflix/movie/
- [DELETE] http://localhost:8080/filmeflix/movie/

