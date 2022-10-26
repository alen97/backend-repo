package com.proyecto.api.controller;
import com.proyecto.api.model.request.LoginRequest;
import com.proyecto.api.model.response.GetDataResponse;
import com.proyecto.api.model.response.LoginResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ApiController {

    // @Value("${current.version}")
    // private String currentVersion;

    // Se hace post para poder obviar el RequestBody
    @CrossOrigin
    @GetMapping("/getData")
    public GetDataResponse getData(){

        GetDataResponse getDataResponse = new GetDataResponse();

        getDataResponse.setMsg("TRAJE LA DATA");

        return getDataResponse;
    }

    @GetMapping("/login")
    public LoginResponse login(){

        LoginResponse loginResponse = new LoginResponse();

            loginResponse.setMsg("Login correcto.");
            loginResponse.setToken("123XC90123MXV901NV0");

        return loginResponse;
    }

}