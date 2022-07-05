package br.edu.fafic.example.restconsumospring.service;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonOjectLeitor {

    JsonElement municipioElement = JsonParser.parseReader(new FileReader("D:\\tonin\\Documents\\IBGE-BASE-DE-DADOS\\municipios.json"));
    JsonObject municipioObject = municipioElement.getAsJsonObject();

    private long id = municipioObject.get("id").getAsLong();
    private String name = municipioObject.get("nome").getAsString();

    public JsonOjectLeitor() throws FileNotFoundException {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
