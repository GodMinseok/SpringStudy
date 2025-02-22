package hello.Inflearn_Spring_MVC_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // 서블릿 자동 등록
@SpringBootApplication
public class InflearnSpringMvc1Application {

	public static void main(String[] args) {
		SpringApplication.run(InflearnSpringMvc1Application.class, args);
	}

}
