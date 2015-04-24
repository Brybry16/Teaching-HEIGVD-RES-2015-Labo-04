package ch.heigvd.res.labs.http.interfaces;

/**
 * Created by Brybry on 22.04.2015.
 */
public interface IHttpRequest extends IHttpHeader {
    public String getMethod();
    public String getURI();

    public String setProtocolVersion(String version);
    public String setURI(String URI);
    public String setMethod(String method);
}
