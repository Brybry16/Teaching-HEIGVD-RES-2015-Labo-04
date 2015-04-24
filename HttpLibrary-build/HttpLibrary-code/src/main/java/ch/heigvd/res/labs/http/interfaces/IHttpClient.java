package ch.heigvd.res.labs.http.interfaces;

/**
 * Created by Brybry on 22.04.2015.
 */
public interface IHttpClient {
    public IHttpResponse sendRequest(IHttpRequest request);
}
