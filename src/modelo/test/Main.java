/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.test;

import java.util.List;
import modelo.entity.Contacto;

/**
 *
 * @author javs
 */
public class Main { 
    
    public static void main(String args[]){
        
        ContactosDAO contactosDAO = new ContactosDAO();
        Contacto contactoRecuperado = null;
        long idAEliminar = 0;
        //Creamos tes instancias de Contacto
        Contacto contacto1 = new Contacto("Javier","hernandez","55555550","El jefe");
        Contacto contacto2 = new Contacto("Pedrito","perez","7878","Puton");
        Contacto contacto3 = new Contacto("Jaime","Cano","9696","Puñetas");
        //Guardamos las tres instancias, guardamos el id del contacto1 para usarlo posteriormente
        contactosDAO.guardaContacto(contacto1);
        contactosDAO.guardaContacto(contacto2);
        contactosDAO.guardaContacto(contacto3);
        //Modificamos el contacto 2 y lo actualizamos
        contacto2.setNombre("Nuevo Contacto 2");
        contactosDAO.actualizaContacto(contacto2);
        //Recuperamos el contacto1 de la base de datos
//        contactoRecuperado = contactosDAO.obtenContacto(idAEliminar);
//        System.out.println("Recuperamos a " + contactoRecuperado.getNombre());
        //Eliminamos al contactoRecuperado (que es el contacto3)
//        contactosDAO.eliminaContacto(contactoRecuperado);
        //Obtenemos la lista de contactos que quedan en la base de datos y la mostramos
        List<Contacto> listaContactos = contactosDAO.obtenListaContactos();
        System.out.println("Hay " + listaContactos.size() + "contactos en la base de datos");
//        
//        for(Contacto c : listaContactos)
//        {
//            System.out.println("-> " + c.getNombre());
//        }
    }   
    
}
