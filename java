import com.google.gson.JsonObject; //만약 오류가 생긴다면 Json을 JSON으로 바꾸기
import com.google.gson.JsonParser;
import okhttp3.*;

import java.io.IOException;

public class OpenAIApiExample {

    private static final String API_KEY = "API키 입력";
    private static final String API_URL = "https://api.openai.com/v1/chat/completions";

    public static void main(String[] args) throws IOExeptions {
      String userMessage = " 질문 넣기"

      String response = getOpenAIResponse(String userMessage);
      system.out.printIn("OpenAI 응답: " + response);
    }
    private static String getOpenAIResponse(String userMessage) throws IOException {
      OKHttpClint client = new OKHttpClient();

      JsonObject message = new JsonObject();//만약 오류가 생긴다면 Json이 아닌 JSON으로 고치기
      message.addProperty(" role", "user");
      
