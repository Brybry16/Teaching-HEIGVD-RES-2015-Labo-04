package ch.heigvd.res.labs.http.interfaces;

/**
 * Created by Brybry on 22.04.2015.
 */
public interface IHttpRequest extends IHttpMessage {
    public String getMethod();
    public String getURI();

    public void setProtocolVersion(String version);
    public void setURI(String URI);
    public void setMethod(String method);
}
