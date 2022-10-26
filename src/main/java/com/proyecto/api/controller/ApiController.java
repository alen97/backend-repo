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
    public LoginResponse login(@RequestBody LoginRequest loginRequest){

        LoginResponse loginResponse = new LoginResponse();

        if(loginRequest.getUser().equals("user123") && loginRequest.getPassword().equals("123123")) {
            loginResponse.setMsg("Login correcto.");
            loginResponse.setToken("123XC90123MXV901NV0");
        }
        else {
            loginResponse.setMsg("Login fallido.");
            loginResponse.setToken(null);
        }

        return loginResponse;
    }

}