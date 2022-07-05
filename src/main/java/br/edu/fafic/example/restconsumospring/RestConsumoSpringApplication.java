package br.edu.fafic.example.restconsumospring;

import br.edu.fafic.example.restconsumospring.entity.Municipio;
import br.edu.fafic.example.restconsumospring.repository.MunicipioRepository;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.util.Collection;

@SpringBootApplication
public class RestConsumoSpringApplication {

	@Autowired
	MunicipioRepository mr;

	public static void main(String[] args) {
		SpringApplication.run(RestConsumoSpringApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		File file = new ClassPathResource("municipios.json").getFile();
//		Gson gson = new Gson();
//
//
//		String content = new String(Files.readAllBytes(file.toPath()));
//
//		Type collectionType = new TypeToken<Collection<Municipio>>(){}.getType();
//		Collection<Municipio> res = gson.fromJson(content, collectionType);
//
//		System.out.println("Salvando no bd");
//
//		mr.saveAll(res);
//
//		System.out.println("Operação finalizada!");
////		res.stream().forEach(municipio -> {
////
////		});
//
//	}
}
