package ch.heigvd.res.labs.http.impl;

import ch.heigvd.res.labs.http.interfaces.IHttpResponse;

/**
 * Created by Brybry on 22.04.2015.
 */
public class HttpResponse implements IHttpResponse {
    @Override
    public int getStatusCode() {
        return 0;
    }

    @Override
    public String getReasonPhrase() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String[] getValues() {
        return new String[0];
    }
}
