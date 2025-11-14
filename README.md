# Global Solution - Microservice and Web Engineering

## Membros do Grupo

- **Eduarda Quagliareli Shiratsu** - RM551188
- **Felipe Cortez** - RM551665

## Tema

**Ferramentas de monitoramento de bem-estar e saúde mental**  

Explora soluções digitais que ajudam a acompanhar o bem-estar emocional e promover hábitos saudáveis por meio de tecnologias acessíveis e intuitivas.

## Finalidade da API

A API disponibiliza um endpoint REST (`/info`) que retorna informações básicas sobre o tema.  
É um ponto de partida para aplicações que precisam expor dados relacionados à saúde mental e bem-estar.  
A documentação está disponível via Swagger.

## Stack Utilizada

- Java 17/18
- Spring Boot 3.1.5
- Maven
- Docker

**Dependências:**
- Spring Web
- SpringDoc OpenAPI

## Execução Local

### A partir da imagem no Docker Hub

1. **Container:**
```bash
docker run -d --name tema-api --network app-networks -p 8081:8081 eduardashiratsu/gs3-wellbeing-monitor:latest
```

#### URL da imagem no Docker Hub:
eduardashiratsu/gs3-wellbeing-monitor:latest

### A partir do docker-compose

1. Subir os serviços:
```bash
 docker-compose up -d
```

### Swagger
```
http://localhost:8081/swagger-ui.html

http://localhost:8081/swagger-ui/index.html
````
### Workflows CI/CD Implementados

O repositório possui pipelines configurados para automatizar o versionamento e o processo de build da aplicação.

#### 1. Release-Please (Maven)

Workflow responsável por gerenciar releases automaticamente a partir dos commits na branch `main`:

- Gera tags e releases automaticamente.
- Atualiza a versão no `pom.xml`.
- Mantém o arquivo `CHANGELOG.md` atualizado.
- A execução pode ser acompanhada na aba **Actions** do GitHub.

#### 2. Build e Testes (Maven)

Workflow focado na validação do projeto antes da geração de uma release:

- Executa o build completo da aplicação.
- Roda os testes automatizados.
- Garante que apenas código funcional e validado seja publicado.

### Referências

SpringDoc OpenAPI

...