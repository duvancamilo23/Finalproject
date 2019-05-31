package entity;

import entity.Cliente;
import entity.Inventario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-24T19:40:14")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, String> marca;
    public static volatile SingularAttribute<Factura, String> fecha;
    public static volatile SingularAttribute<Factura, Integer> precio;
    public static volatile SingularAttribute<Factura, String> direccion;
    public static volatile SingularAttribute<Factura, String> producto;
    public static volatile CollectionAttribute<Factura, Inventario> inventarioCollection;
    public static volatile SingularAttribute<Factura, String> nombre;
    public static volatile SingularAttribute<Factura, Integer> idfactura;
    public static volatile CollectionAttribute<Factura, Cliente> clienteCollection;

}