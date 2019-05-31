package entity;

import entity.Empleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-24T19:40:14")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, Integer> idproveedor;
    public static volatile SingularAttribute<Proveedor, String> ordendecompra;
    public static volatile CollectionAttribute<Proveedor, Empleado> empleadoCollection;
    public static volatile SingularAttribute<Proveedor, String> direccion;
    public static volatile SingularAttribute<Proveedor, Integer> telefono;
    public static volatile SingularAttribute<Proveedor, String> nombre;

}