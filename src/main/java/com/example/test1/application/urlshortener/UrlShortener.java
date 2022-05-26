package com.example.test1.application.urlshortener;

import com.example.test1.domain.urlshortener.UrlShortenerData;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;

@Service
public class UrlShortener {

    private static final String SHORT_COM = "short.com";
    private static final String SLASH = "/";
    public URL execute(UrlShortenerData urlShortenerData) throws MalformedURLException {
        var url = urlShortenerData.getUrl();
        var stringUrl = urlShortenerData.getUrl().toString();

        stringUrl = stringUrl
                .replace(url.getAuthority(), SHORT_COM)
                .replace(url.getFile(), SLASH + urlShortenerData.getSetKeyword());

        return new URL(stringUrl);
    }
}
