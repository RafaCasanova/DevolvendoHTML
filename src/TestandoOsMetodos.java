import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class TestandoOsMetodos {
    public static void main(String[] args) throws IOException, InterruptedException {

        //conectaERetornaHTML("https://github.com/RafaCasanova");
        String num = "10";
        System.out.println(num.repeat(10));

    }

    public static void conectaERetornaHTML(String URL) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(URL)).build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> response = httpClient.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println("Status " + response.statusCode());
        System.out.println("Headers " + response.headers());
        System.out.println(response.body());

    }

}


