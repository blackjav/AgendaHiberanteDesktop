/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.test;

import controlador.HibernateUtil;
import java.util.List;
import modelo.entity.Contacto;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author javs
 */
public class ContactosDAO {
    
    private Session sesion;
    private Transaction tx;
    
    
    private void iniciaOperacion() throws HibernateException
    {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }
    
    private void manejaExcepcion(HibernateException he) throws HibernateException
    {
         tx.rollback();
         throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }
    
    public long guardaContacto(Contacto contacto)
    {
        long id = 0;
        try
        {
            iniciaOperacion();
            sesion.save(contacto);
            tx.commit();
        }catch(HibernateException he)
            
        {
            manejaExcepcion(he);
            throw he;
        }finally{
            sesion.close();
//            System.out.println("Entro a esta parte del bloque"+ sesion.getSessionFactory());
        }
        
    return id;
    }
    
    public void actualizaContacto(Contacto contacto) throws HibernateException
    {
        try
        {
            iniciaOperacion();
            sesion.update(contacto);
            tx.commit();
        }catch (HibernateException he)
        {
            manejaExcepcion(he);
            throw he;
        }finally
        {
            sesion.close();
        }
        
       
    }
    
    public void eliminaContacto(Contacto contacto) throws HibernateException
    {
        try
        {
            iniciaOperacion();
            sesion.delete(contacto);
            tx.commit();
        } catch (HibernateException he)
        {
            manejaExcepcion(he);
            throw he;
        }
    }
    
    public Contacto obtenContacto(long idContacto) throws HibernateException
    {
        Contacto contacto = null;
        
            iniciaOperacion();
            contacto = (Contacto) sesion.get(Contacto.class, idContacto);
        
    return contacto;
    }
    
    public List<Contacto> obtenListaContactos() throws HibernateException
    {
        List<Contacto> listaContactos = null;
        
        
            iniciaOperacion();
            listaContactos = sesion.createQuery("from Contacto").list();
        
    return listaContactos;
    }
    
}
