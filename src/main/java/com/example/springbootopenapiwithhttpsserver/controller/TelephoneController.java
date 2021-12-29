package com.example.springbootopenapiwithhttpsserver.controller;

import com.example.springbootopenapiwithhttpsserver.dto.TelephoneDTO;
import com.example.springbootopenapiwithhttpsserver.model.Telephone;
import com.example.springbootopenapiwithhttpsserver.service.TelephoneService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;


@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("api/v1/devices")

public class TelephoneController  {


    final Environment environment;
    final TelephoneService telephoneService;

    @PostMapping("/telephone")
    public Telephone saveTelephone(@RequestBody TelephoneDTO telephoneDTO){
        return telephoneService.save(telephoneDTO);
    }

    @GetMapping("/telephone/{id}")
    public Telephone getTelephone(@PathVariable("id") int id) throws MalformedURLException {

        return telephoneService.getTelephone(id);
    }

    @GetMapping("/LocalHostAddress")
    public String somePlaceInTheCode() throws UnknownHostException, MalformedURLException {
        // Port
        environment.getProperty("server.port");

        // Local address
       String getHostAddress= InetAddress.getLocalHost().getHostAddress();
        String getHostName=InetAddress.getLocalHost().getHostName();

        // Remote address
        String getLoopbackHostAddress =InetAddress.getLoopbackAddress().getHostAddress();
        String getLooopbackHostName=InetAddress.getLoopbackAddress().getHostName();

        String url = MvcUriComponentsBuilder.fromController(TelephoneController.class).toUriString();
        URL requestURL= new URL(url);
        String port = requestURL.getPort() == -1 ? "" : ":" + requestURL.getPort();
        String baseURL=requestURL.getProtocol()+"://"+requestURL.getHost() + port+requestURL.getPath();



        String baseUrl="getHostAddres:"+getHostAddress+
                "\ngetHostName:"+getHostName
                +"\ngetLoopbackHostAddress:"+getLoopbackHostAddress+
                "\ngetLoopbackHostName:"+getLooopbackHostName+
                "\nYour url without protocol:"+baseURL;
        return baseUrl;
    }


}
