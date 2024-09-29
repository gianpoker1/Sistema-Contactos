package gian.contactos.controller;

import gian.contactos.model.Contacto;
import gian.contactos.service.ContactoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ContactoController {

    private static final Logger logger = LoggerFactory.getLogger(ContactoController.class);

    @Autowired
    private ContactoService contactoService;

    @GetMapping("/")
    public String iniciar(ModelMap modelo){
        List<Contacto> contactos = contactoService.listarContactos();
        contactos.forEach((contacto) -> logger.info(contacto.toString()));
        modelo.put("contactos", contactos);
        return "index";//index.html
    }

    @GetMapping("/agregar")
    public String mostrarAgregar(){
        return "agregar";//agregar.html
    }

    @PostMapping("/agregar")
    public String agregar(@ModelAttribute("contactoForma") Contacto contacto){
        logger.info("Contacto a agregar: " + contacto);
        contactoService.saveContacto(contacto);
        return "redirect:/";//redirigimos al controlador el path "/"
    }

    @GetMapping("/editar/{id}")
    public String mostrarEditar(@PathVariable(value = "id") int idContacto, ModelMap modelo){
        Contacto contacto = contactoService.findByIdContacto(idContacto);
        logger.info("Contacto a editar: " + contacto);
        modelo.put("contacto", contacto);
        return "editar";
    }

    @PostMapping("/editar")
    public String editar(@ModelAttribute("contacto") Contacto contacto){
        logger.info("Contacto actualizar: " + contacto);
        contactoService.saveContacto(contacto);
        return "redirect:/";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") int idContacto){
        Contacto contacto = new Contacto();
        contacto.setIdContacto(idContacto);
        contactoService.deleteContacto(contacto);
        return "redirect:/";
    }


}
