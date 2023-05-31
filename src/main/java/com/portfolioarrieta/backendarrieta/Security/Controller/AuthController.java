/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioarrieta.backendarrieta.Security.Controller;

//import com.portfolioarrieta.backendarrieta.Security.Dto.LoginUsuario;
//import com.portfolioarrieta.backendarrieta.Security.Dto.NuevoUsuario;
//import com.portfolioarrieta.backendarrieta.Security.Entity.Rol;
//import com.portfolioarrieta.backendarrieta.Security.Entity.Usuario;
//import com.portfolioarrieta.backendarrieta.Security.Enums.RolNombre;
//import com.portfolioarrieta.backendarrieta.Security.Service.RolService;
//import com.portfolioarrieta.backendarrieta.Security.Service.UsuarioService;
//import java.util.HashSet;
//import java.util.Set;
//import javax.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/auth")
//@CrossOrigin(origins = "https://backendarrieta.onrender.com")
//public class AuthController {
    //@Autowired
    //PasswordEncoder passwordEncoder;
    //@Autowired
    //AuthenticationManager authenticationManager;
    //@Autowired
    //UsuarioService usuarioService;
    //@Autowired
    //RolService rolService;
    //@Autowired
    //JwtProvider jwtProvider;
    
    //@PostMapping("/nuevo")
    //public ResponseEntity<?> nuevo(@Valid @RequestBody NuevoUsuario nuevoUsuario, BindingResult bindingResult){
        //if(bindingResult.hasErrors())
            //return new ResponseEntity(new Mensaje("Campos mal puestos o email invalido"),HttpStatus.BAD_REQUEST);
        
        //if(usuarioService.existsByNombreUsuario(nuevoUsuario.getNombreUsuario()))
            //return new ResponseEntity(new Mensaje("Ese nombre de usuario ya existe"), HttpStatus.BAD_REQUEST);
        
        //if(usuarioService.existsByEmail(nuevoUsuario.getEmail()))
            //return new ResponseEntity(new Mensaje("Ese email ya existe"), HttpStatus.BAD_REQUEST);
        
        //Usuario usuario = new Usuario(nuevoUsuario.getNombre(), nuevoUsuario.getNombreUsuario(),
            //nuevoUsuario.getEmail(), passwordEncoder.encode(nuevoUsuario.getPassword()));
        
        //Set<Rol> roles = new HashSet<>();
        //roles.add(rolService.getByRolNombre(RolNombre.ROLE_USER).get());
        
        //if(nuevoUsuario.getRoles().contains("admin"))
            //roles.add(rolService.getByRolNombre(RolNombre.ROLE_ADMIN).get());
        //usuario.setRoles(roles);
        //usuarioService.save(usuario);
        
        //return new ResponseEntity(new Mensaje("Usuario guardado"),HttpStatus.CREATED);
    //}
    
    //@PostMapping("/login")
    //public ResponseEntity<?> login(@Valid @RequestBody LoginUsuario loginUsuario, BindingResult bindingResult) {
        //if (bindingResult.hasErrors())
           //return new ResponseEntity(new Mensaje("Campos mal puestos"), HttpStatus.BAD_REQUEST);

        // if (!isValidCredentials(loginUsuario.getNombreUsuario(), loginUsuario.getPassword())) {
         //  return new ResponseEntity(new Mensaje("Credenciales inválidas"), HttpStatus.UNAUTHORIZED);
        //}

        //return new ResponseEntity(new Mensaje("Autenticación exitosa"), HttpStatus.OK);
    //}
    //private boolean isValidCredentials(String nombreUsuario, String password){
       //if (nombreUsuario.equals("usuario") && password.equals("contraseña")) {
        //return true;
        //}  
        //return false; 
    //}
    
  