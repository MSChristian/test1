package com.example.test1.domain.urlshortener;

public class TooLongShortenerUrlSeoKeyword extends RuntimeException {
    public TooLongShortenerUrlSeoKeyword() {
        super("Url Seo keyword is too long (max 20 character)");
    }
}
