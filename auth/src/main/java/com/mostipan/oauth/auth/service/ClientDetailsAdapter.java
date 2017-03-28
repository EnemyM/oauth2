package com.mostipan.oauth.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

/**
 * Created by anton on 26.03.17.
 */

@Service
public class ClientDetailsAdapter implements ClientDetailsService {

    private org.springframework.security.core.userdetails.UserDetailsService userDetailsService;

    @Autowired
    public ClientDetailsAdapter(UserDetailsService detailsService) {
        this.userDetailsService = detailsService;
    }


    @Override
    public ClientDetails loadClientByClientId(String s) throws ClientRegistrationException {
        BaseClientDetails clientDetails = new BaseClientDetails();
        return null;
    }
}
