# Projeto Microsserviços 

### Arquitetura de software em microsserviços

### Criação do Projeto

1. Primeiro passo
   * https://start.spring.io/
2. Segundo passo
   * Selecionar o tipo de projeto e a linguaguem.
     * Esse projeto foi desenvolvido em Gradle com Java.
3. Selecionar as dependências

- ElasticSearch 
- Redis 
- Docker
- Spring Boot 
- Spring Cloud
- Spring Cloud Netflix
- Spring Boot Actuator

### OBJETIVO

O objetivo deste projeto foi de aprender como funciona uma arquitetura de micro serviços, fazendo a interligação de API's com Servers de configuração e criando um Gateway para controlar as requisições e o fluxo de dados de uma aplicação com este tipo de arquitetura.

### INSTALAÇÃO LOCAL

- Faça um git clone deste Repositório

- Suba os servidores no docker que estão no arquivo docker-compose.yml através do comando:

  ```
  docker -compose up
  ```

- Importe os projetos como módulos em sua IDE de preferência e Rode primeiro os projetos: config-server e service-discovery. Após isso os outros projetos podem ser abertos.
