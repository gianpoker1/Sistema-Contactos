package gian.contactos.service;

import gian.contactos.model.Contacto;

import java.util.List;

public interface IContactoService {
    public List<Contacto> listarContactos();
    public Contacto findByIdContacto(Integer idContacto);
    public void saveContacto(Contacto contacto);
    public void deleteContacto(Contacto contacto);
}
