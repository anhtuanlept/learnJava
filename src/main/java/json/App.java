package json;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import nl.altindag.ssl.SSLFactory;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class App {

    public static void main(String[] args) throws IOException, JSONException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        TrustStrategy acceptingTrustStrategy = (cert, authType) -> true;
        SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();
        SSLFactory sslFactory = SSLFactory.builder().withTrustingAllCertificatesWithoutValidation()
                /*.withDefaultTrustMaterial()*/
                .build();

        HttpClient httpClient = HttpClients.custom()
                .setSSLContext(sslFactory.getSslContext())
                .setSSLHostnameVerifier((a,b)->{return true;}/*sslFactory.getHostnameVerifier()*/)
                .build();

        HttpGet request = new HttpGet("https://14.248.89.9:80");
        //request.a

        HttpResponse response = httpClient.execute(request);
        //String chuckNorrisJoke = new JSONObject(EntityUtils.toString(response.getEntity())).getString("value");

        System.out.println(String.format("Received the following status code: %d", response.getStatusLine().getStatusCode()));
        System.out.println(String.format("Received the following joke: %s", EntityUtils.toString(response.getEntity())));
    }

}