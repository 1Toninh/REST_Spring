//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class TesteJsonSimpleRead {
//
//    public static void main(String[] args) {
//
//        JSONObject jsonObject = new JSONObject();
//        JSONParser jsonParser = new JSONParser();
//
//        String nome;
//        String sobrenome;
//        String estado;
//        String pais;
//
//        try{
//            jsonObject = (JSONObject) jsonParser.parse(new FileReader("names.json"));
//            nome = (String) jsonObject.get("name");
//            sobrenome = (String) jsonObject.get("sobrenome");
//            estado = (String) jsonObject.get("estado");
//            pais = (String) jsonObject.get("pais");
//
//            System.out.printf("Nome: %s\nSobrenome: %s\nEstado: %s\nPais: %s", nome, sobrenome, estado, pais);
//
//        } catch (FileNotFoundException e){
//            System.out.println("Erro: "+e.getMessage());
//        } catch (ParseException e){
//            System.out.println("Erro: "+e.getMessage());
//        } catch (IOException e){
//            System.out.println("Erro: "+e.getMessage());
//        }
//
//    }
//}
