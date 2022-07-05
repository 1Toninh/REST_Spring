//import org.json.simple.JSONObject;
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class TesteJsonSimpleWrite {
//    @SuppressWarnings("unchecked")
//    public static void main(String[] args) {
//
//        JSONObject jsonObject = new JSONObject();
//        FileWriter writeFile = null;
//
//        jsonObject.put("name", "Jose");
//        jsonObject.put("sobrenome", "Almeida");
//        jsonObject.put("pais", "Brasil");
//        jsonObject.put("estado", "SP");
//
//        try{
//            writeFile = new FileWriter("names.json");
//            writeFile.write(jsonObject.toJSONString());
//            writeFile.close();
//        } catch (IOException e){
//            System.out.println("Erro: "+e.getMessage());
//        }
//
//        System.out.println(jsonObject);
//
//    }
//
//}
