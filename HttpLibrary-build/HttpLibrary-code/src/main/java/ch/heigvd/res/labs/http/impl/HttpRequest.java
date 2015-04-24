package ch.heigvd.res.labs.http.impl;

import ch.heigvd.res.labs.http.interfaces.IHttpHeader;
import ch.heigvd.res.labs.http.interfaces.IHttpRequest;

import java.net.URI;
import java.util.Map;

/**
 * Created by Brybry on 22.04.2015.
 */
public class HttpRequest implements IHttpRequest {

    private String method;
    private String protocolVersion;
    private String uri;
    private Map<String, IHttpHeader> headers;
    private byte[] body;
    private int contentLength = 0;

    public HttpRequest(HttpRequest r) {
        setMethod(r.getMethod());
        setProtocolVersion(r.getProtocolVersion());
        setURI(r.getURI());
    }

    public void parseURI() {
        
    }

    @Override
    public String getMethod() {
        return method;
    }

    @Override
    public String getURI() {
        return uri;
    }

    @Override
    public Map<String, IHttpHeader> getHeaders() {
        return headers;
    }

    @Override
    public IHttpHeader getHeader(String header) {
        return headers.get(header);
    }

    @Override
    public byte[] getBody() {
        return body;
    }

    @Override
    public int getContentLength() {
        return contentLength;
    }

    @Override
    public String getProtocolVersion() {
        return protocolVersion;
    }

    @Override
    public void setProtocolVersion(String version) {
        this.protocolVersion = version;
    }

    @Override
    public void setURI(String URI) {
        this.uri = URI;
    }

    @Override
    public void setMethod(String method) {
        this.method = method;
    }
}
