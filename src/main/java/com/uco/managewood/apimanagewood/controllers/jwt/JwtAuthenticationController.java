package com.uco.managewood.apimanagewood.controllers.jwt;


import java.util.Objects;


import com.uco.managewood.apimanagewood.domain.colaborador.Colaborador;
import com.uco.managewood.apimanagewood.domain.jwt.JwtRequest;
import com.uco.managewood.apimanagewood.domain.jwt.JwtResponse;
import com.uco.managewood.apimanagewood.jwt.JwtTokenUtil;
import com.uco.managewood.apimanagewood.service.jwt.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin
public class JwtAuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private JwtUserDetailsService userDetailsService;

    @Autowired
    private UserDetailsService jwtInMemoryUserDetailsService;

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest)
            throws Exception {

        authenticate(authenticationRequest.getCorreo(), authenticationRequest.getPassword());

        final UserDetails
                userDetails = userDetailsService
                .loadUserByUsername(authenticationRequest.getCorreo());

        final String token = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new JwtResponse(token));

    }

    @PostMapping("/register")
    public Colaborador  saveUser(@RequestBody Colaborador user)  {
        return userDetailsService.save(user);
    }

    private void authenticate(String correo, String password) throws Exception {
        Objects.requireNonNull(correo);
        Objects.requireNonNull(password);

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(correo, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}