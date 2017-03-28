package com.mostipan.oauth.resource.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by anton on 04.03.17.
 */
@Service
public class ResourceService {

    @Value("${uris}")
    private String uris;

    public String getAllUris() {

        return uris;
    }
}
