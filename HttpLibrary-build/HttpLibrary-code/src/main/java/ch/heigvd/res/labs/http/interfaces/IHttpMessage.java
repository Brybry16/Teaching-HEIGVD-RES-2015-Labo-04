package ch.heigvd.res.labs.http.interfaces;

import java.util.Map;

/**
 * Created by Brybry on 22.04.2015.
 */
public interface IHttpMessage {
    public Map<String, IHttpHeader> getHeaders();
    public IHttpHeader getHeader(String header);
    public byte[] getBody();
    public int getContentLength();
    public String getProtocolVersion();
}
