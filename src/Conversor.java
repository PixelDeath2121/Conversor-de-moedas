import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public MoedaDataTransfer conversorDeMoeda (String MoedaBase, String moedaConversao, double valorConversao){
        URI moeda = URI.create("https://v6.exchangerate-api.com/v6/29e409d36139b177e310497d/pair/" + MoedaBase + "/" + moedaConversao+ "/" + valorConversao);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(moeda)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), MoedaDataTransfer.class);

        } catch (Exception e) {
            throw new RuntimeException("Não foi possivel converter os valores");
        }

    }
}
