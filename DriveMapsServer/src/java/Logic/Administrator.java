// Instituto Tecnologico de Costa Rica
// Escuela de Ingenieria en Computacion 
// Componenetes en Comunicaciones en Internet
// Profesor Rodrigo Nuñez Nuñez
// Alumnos:
//      Cesar Peralta
//      Emmanuel Salazar
// BackEnd Primer Proyecto.

package Logic;

import org.bson.types.ObjectId;
import MongoDataAccess.AdministratorDataAccess;

public class Administrator {
    private ObjectId _Id;
    private String _UserName;
    private String _UserAccount;
    private String _Password;
    private ObjectId[] _Area;
    
    
    
    public ObjectId getId() {
	return _Id;
    }
    public void setId(ObjectId id) {
	_Id = id;
    }
    public String getUserName() {
    	return _UserName;
    }
    public void setUserName(String userName) {
    	_UserName = userName;
    }
    public String getUserAccount() {
    	return _UserAccount;
    }
    public void setUserAccount(String userAccount) {
    	_UserAccount = userAccount;
    }
    public String getPassword() {
    	return _Password;
    }
    public void setPassword(String password) {
    	_Password = password;
    }
    public ObjectId[] getArea() {
    	return _Area;
    }
    public void setArea(ObjectId[] area) {
    	_Area = area;
    } 
    

    
        
    public static void createAdministrator(String pUserName, String pUserAccount, String pPassword){
        AdministratorDataAccess _Admi = new AdministratorDataAccess();
        if(_Admi.VerifyAccount(pUserAccount)){
            ObjectId _Insert = _Admi.InsertAdministrator(pUserName,pUserAccount,pPassword);
            if (_Insert.equals(null)){
            System.out.println("Error al ingresar el administrador");
            }else{
            System.out.println("Administrador ID: " + _Insert);
        }
            
        }else{
            System.out.println("El nombre de la cuenta ya esta registrado");
        }
        

    }
}
