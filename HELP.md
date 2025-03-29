# Getting Started
docker pull dpage/pgadmin4  
pgadmin admin image to look at pg DB
http://localhost:88/open-ai-home
-- ollama chat clients  below --
http://localhost:88
http://localhost:88/index.html
http://localhost:88/stream.html
Testing Flux streaming with Rest Client call:
windows CREATE REQUEST in HTTP Client: Works OK
GET http://localhost:88/rest-ollama-stream?message="Tell me what is machine learning ML."
this is test -  in mac os
http --stream :8080/stream message=="Tell me what machine learning ML is"
http --stream :88/rest-ollama-stream message=="Tell me what machine learning ML is"
root:  localhost:88
PS C:\APP_DEV\ollama-advisor> ollama ls
NAME            ID              SIZE      MODIFIED
codellama:7b    8fdf8f752f6e    3.8 GB    3 days ago
llama3.2:1b     baf6a787fdff    1.3 GB    3 days ago
PS C:\APP_DEV\ollama-advisor> 
ollama pull llama3.2:1b
ollama pull mxbai-embed-large:latest
ollama pull mxbai-embed-large:335m

http://localhost:88/api-ollama/fact
http://localhost:88/api-ollama?question="Give me names of 5 pirates."
### Reference Documentation
https://platform.openai.com/api-keys
entry point:
0) docker build -f Dockerfile -t igr025/openai-ollama-21-img:v0.1 .
1) open-ai> docker build -f Dockerfile -t igr025/openai-clone-21-img:v0.1 .
2) open-ai> docker push igr025/openai-clone-21-img:v0.1
3) open-ai> docker run --name openai-clone-v01-cnr -p 82:82 openai-clone-21-img:v0.1

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.0/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.0/maven-plugin/build-image.html)
* [Docker Compose Support](https://docs.spring.io/spring-boot/3.4.0/reference/features/dev-services.html#features.dev-services.docker-compose)
* [Ollama](https://docs.spring.io/spring-ai/reference/api/chat/ollama-chat.html)
* [PDF Document Reader](https://docs.spring.io/spring-ai/reference/api/etl-pipeline.html#_pdf_page)
* [PGvector Vector Database](https://docs.spring.io/spring-ai/reference/api/vectordbs/pgvector.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.0/reference/web/servlet.html)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Docker Compose support

This project contains a Docker Compose file named `compose.yaml`.
In this file, the following services have been defined:

* ollama: [`ollama/ollama:latest`](https://hub.docker.com/r/ollama/ollama)
* pgvector: [`pgvector/pgvector:pg16`](https://hub.docker.com/r/pgvector/pgvector)

Please review the tags of the used images and set them to the same as you're running in production.

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the
parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

