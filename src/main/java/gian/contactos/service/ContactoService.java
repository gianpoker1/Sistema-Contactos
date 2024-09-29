package gian.contactos.service;

import gian.contactos.model.Contacto;
import gian.contactos.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService implements IContactoService{

    @Autowired
    private ContactoRepository contactoRepository;

    @Override
    public List<Contacto> listarContactos() {
        return contactoRepository.findAll();
    }

    @Override
    public Contacto findByIdContacto(Integer idContacto) {
        Contacto contacto = contactoRepository.findById(idContacto).orElse(null);
        return contacto;
    }

    @Override
    public void saveContacto(Contacto contacto) {
        contactoRepository.save(contacto);

    }

    @Override
    public void deleteContacto(Contacto contacto) {
        contactoRepository.delete(contacto);
    }
}
