package com.example.lab3_gtics_20182693;

import com.example.lab3_gtics_20182693.beans.Auto;
import com.example.lab3_gtics_20182693.beans.Sede;
import com.example.lab3_gtics_20182693.beans.Seguro;
import com.example.lab3_gtics_20182693.beans.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
public class Lab3Controller {

    private List<Auto> autos = new ArrayList<>();


    // Mostrar el formulario de autos usando databinding
    @GetMapping("/autos")
    public String mostrarFormAutos(Model model) {

        model.addAttribute("auto", new Auto());
        return "form_autos";
    }

    // Guardar el formulario de autos usando databinding
    @PostMapping("/guardar_auto")
    public String guardarAuto(Auto auto, Model model) {
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Color: " + auto.getColor());
        System.out.println("Kilometraje: " + auto.getKilometraje());
        System.out.println("Sede: " + auto.getSede());
        System.out.println("Costo: " + auto.getCosto());

        // Añadir auto
        autos.add(auto);

        // Pasar a la lista de autos
        model.addAttribute("autos", autos);
        return "lista_autos";
    }

    private List<Seguro> seguros = new ArrayList<>();


    // Mostrar el formulario de seguros usando databinding
    @GetMapping("/seguros")
    public String mostrarFormSeguros(Model model) {

        model.addAttribute("seguro", new Seguro());
        return "form_seguros";
    }

    // Guardar el formulario de seguros usando databinding
    @PostMapping("/guardar_seguro")
    public String guardarSeguro(Seguro seguro, Model model) {
        System.out.println("Empresa: " + seguro.getEmpresa());
        System.out.println("Cobertura: " + seguro.getCobertura());
        System.out.println("Tarifa: " + seguro.getTarifa());


        // Añadir seguro
        seguros.add(seguro);

        // Pasar a la lista de seguros
        model.addAttribute("seguros", seguros);
        return "lista_seguros";
    }


    private List<Sede> sedes = new ArrayList<>();


    // Mostrar el formulario de sedes usando databinding
    @GetMapping("/sedes")
    public String mostrarFormSedes(Model model) {

        model.addAttribute("sede", new Sede());
        return "form_sedes";
    }

    // Guardar el formulario de sedes usando databinding
    @PostMapping("/guardar_sede")
    public String guardarSede(Sede sede, Model model) {
        System.out.println("Distrito: " + sede.getDistrito());
        System.out.println("Direccion: " + sede.getDireccion());

        // Añadir sede
        sedes.add(sede);

        // Pasar a la lista de sedes
        model.addAttribute("sedes", sedes);
        return "lista_sedes";
    }

    private List<Usuario> usuarios = new ArrayList<>();


    // Mostrar el formulario de usuarios usando databinding
    @GetMapping("/usuarios")
    public String mostrarFormUsuarios(Model model) {

        model.addAttribute("usuario", new Usuario());
        return "form_usuarios";
    }

    // Guardar el formulario de usurios usando databinding
    @PostMapping("/guardar_usuario")
    public String guardarUsurios(Usuario usuario, Model model) {
        System.out.println("Nombres: " + usuario.getNombres());
        System.out.println("Apellidos: " + usuario.getApellidos());
        System.out.println("Contraseña: " + usuario.getContraseña());


        // Añadir usuario
        usuarios.add(usuario);

        // Pasar a la lista de usuarios
        model.addAttribute("usuarios", usuarios);
        return "lista_usuarios";
    }
}
