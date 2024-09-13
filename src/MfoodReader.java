
import javax.net.ssl.*;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.cert.X509Certificate;

public class MfoodReader{

    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {

        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public X509Certificate[] getAcceptedIssuers() {
                        return new X509Certificate[]{};
                    }
                    public void checkClientTrusted(X509Certificate[] certs, String authType) {
                    }
                    public void checkServerTrusted(X509Certificate[] certs, String authType) {
                    }
                }
        };

        try {
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            // Создаем все доверяющий hostname verifier
            HostnameVerifier allHostsValid = new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);

            // Теперь вы можете установить соединение с URL, который ранее вызывал ошибку SSL
            URL url = new URL("https://master-food.pro/deserts");
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            // Дальнейшие действия с соединением
            InputStream input = url.openStream();
            byte[] buffer = input.readAllBytes();
            String str = new String(buffer);
            System.out.println(str);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


