package test;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

public class RestWebserviceTest {

    @Test
    public void testRestWSPostRequest() {

        HttpResponse httpResponse = null;
        HttpUriRequest httpUriRequest = RequestBuilder.get().setUri("http://localhost:8080".toString()).build();

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            httpResponse = httpClient.execute(httpUriRequest);
            String response = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
            //responseAndStatus.put(gson.fromJson(json, classOfT),
              //      String.valueOf(httpResponse.getStatusLine().getStatusCode()));


        } catch (IOException e) {
//            throw new ApiException(String.format(
//                    "Unable to get the response for %s api, with end point url %s.The status code received was %s",
//                    classOfT.getSimpleName(), httpUriRequest.getRequestLine().getUri(), httpResponse.getStatusLine()
//                            .getStatusCode()));
        }
    }
}
