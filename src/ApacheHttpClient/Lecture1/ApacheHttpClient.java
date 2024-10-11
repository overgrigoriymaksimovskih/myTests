package ApacheHttpClient.Lecture1;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

/*
Опять POST, а не GET
*/

public class ApacheHttpClient {
    public static void main(String[] args) throws Exception {
        ApacheHttpClient solution = new ApacheHttpClient();
        solution.sendPost("https://eo1tw862ocg5zuf.m.pipedream.net", "&name=zapp&mood=good&locale=&id=777");
    }

    public void sendPost(String url, String urlParameters) throws Exception {
        HttpClient client = getHttpClient();
        HttpPost request = new HttpPost(url);
//---------------------------------------------------------------------------
        List<NameValuePair> decodedParams = URLEncodedUtils.parse(urlParameters, StandardCharsets.UTF_8);
        request.setEntity(new UrlEncodedFormEntity(decodedParams));


        request.addHeader("Grisha", "Mozilla/5.0");

        HttpResponse response = client.execute(request);

        System.out.println("Response Code: " + response.getStatusLine().getStatusCode());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String responseLine;
        while ((responseLine = bufferedReader.readLine()) != null) {
            result.append(responseLine);
        }

        System.out.println("Response: " + result);
    }

    protected HttpClient getHttpClient() {
        return HttpClientBuilder.create().build();
    }
}

