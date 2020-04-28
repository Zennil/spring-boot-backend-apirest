package com.zenil.springboot.backend.apirest.springbootbackendapirest.auth;

import java.util.HashMap;
import java.util.Map;

import com.zenil.springboot.backend.apirest.springbootbackendapirest.models.entity.Usuario;
import com.zenil.springboot.backend.apirest.springbootbackendapirest.models.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

/**
 * InfoAdicionalToken
 */
@Component
public class InfoAdicionalToken implements TokenEnhancer {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {

        Usuario usuario = usuarioService.findByUsername(authentication.getName());

        Map<String, Object> info = new HashMap<>();

        info.put("nombre", usuario.getNombre());
        info.put("apellido", usuario.getApellido());
        info.put("email", usuario.getEmail());

        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);

        return accessToken;
    }

}