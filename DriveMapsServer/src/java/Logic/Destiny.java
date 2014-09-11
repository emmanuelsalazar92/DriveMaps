// Instituto Tecnologico de Costa Rica
// Escuela de Ingenieria en Computacion 
// Componenetes en Comunicaciones en Internet
// Profesor Rodrigo Nuñez Nuñez
// Alumnos:
//      Cesar Peralta
//      Emmanuel Salazar
// BackEnd Primer Proyecto.
package Logic;

//Destiny							// donde se colocan los items 

import org.bson.types.ObjectId;

//{
//DestinyID: <DestinyID>,
//Name: <Name>,
//Location: 
//	{ 
//		X: <Latitude>,
//		Y: <Length>,
//	}
//Area: <AreaID>						// diferentes destinos por area (el moderador los agrega para verificar si son alcanzables)
//}
public class Destiny {
    private ObjectId Id;
    private String Name;
    private float[] Location;
    private ObjectId Area;

    public ObjectId getId() {
            return Id;
    }
    public void setId(ObjectId id) {
            Id = id;
    }
    public String getName() {
            return Name;
    }
    public void setName(String name) {
            Name = name;
    }
    public float[] getLocation() {
            return Location;
    }
    public void setLocation(float[] location) {
            Location = location;
    }
    public ObjectId getArea() {
            return Area;
    }
    public void setArea(ObjectId area) {
            Area = area;
    }
}
