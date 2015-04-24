package ch.heigvd.res.labs.http.interfaces;

/**
 * Created by Brybry on 22.04.2015.
 */
public interface IHttpResponse extends IHttpHeader {
    public int getStatusCode();
    public String getReasonPhrase();
}
