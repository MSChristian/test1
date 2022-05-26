package com.example.test1.domain.urlshortener;

import java.net.URL;

public class UrlShortenerData {
    private final URL url;
    private final String setKeyword;

    public UrlShortenerData(URL url, String seoKeyword) {

        if (seoKeyword == null || seoKeyword.isEmpty()) {
            throw new EmptyShortenerUrlSeoKeyword();
        }
        if (seoKeyword.length() > 20) {
            throw new TooLongShortenerUrlSeoKeyword();
        }

        this.url = url;
        this.setKeyword = seoKeyword;
    }

    public URL getUrl() {
        return url;
    }

    public String getSetKeyword() {
        return setKeyword;
    }
}
