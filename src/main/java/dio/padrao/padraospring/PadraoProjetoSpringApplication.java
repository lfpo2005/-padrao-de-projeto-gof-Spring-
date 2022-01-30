package dio.padrao.padraospring;
/*
* Projeto Spring Boot inicializado com intellij IDE
* Os seguintes modulos foram selecionados
* - Spring Data JPA
* - Spring Web
* - H2 DataBase
* - OpenFeign
* - Lombok
*
* @author lfpo2005
*
* */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadraoProjetoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PadraoProjetoSpringApplication.class, args);
    }

}
