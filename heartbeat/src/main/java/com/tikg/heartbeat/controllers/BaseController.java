package com.tikg.heartbeat.controllers;

//import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class BaseController {

    @GetMapping("/ping")
    public ResponseEntity<?> ping() {
        return new ResponseEntity<>("SMASH", HttpStatus.OK);
    }

//    @GetMapping("/whoami")
//    public ResponseEntity<?> getWhoAmI(HttpServletRequest request) {
//        String ipAddress = request.getRemoteAddr();
//
//        try {
//            String hostIp = InetAddress.getLocalHost().getHostAddress();
//
//            return new ResponseEntity<>("Client IP: " + ipAddress + ", Server IP: " + hostIp,
//                    HttpStatus.OK);
//        } catch(RuntimeException | UnknownHostException exception) {
//            return new ResponseEntity<>("Client IP: " + ipAddress + ", Server IP: Unknown",
//                    HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}
