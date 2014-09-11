// Instituto Tecnologico de Costa Rica
// Escuela de Ingenieria en Computacion 
// Componenetes en Comunicaciones en Internet
// Profesor Rodrigo Nuñez Nuñez
// Alumnos:
//      Cesar Peralta
//      Emmanuel Salazar
// BackEnd Primer Proyecto.

package Logic;
import MongoDataAccess.UserDataAccess;
import org.bson.types.ObjectId;


//Usuario
//{
//_id: <UserID>,
//UserName: <UserName>,
//Account: <UserAccount>,					// FB o email
//Password: <Password>,
//TotalPoints: <TotalPoints>,
//Missions: 
//	[ {
//		MissionID: <MissionID>
//	} ],
//UnfinishedMissions:					// la mision actual se guarda aqui por si suceden problemas de conectividad (se actualiza cada x minutos/segundos) 
//	[ {
//		MissionID: <MissionID>
//	} ],
//GainedItems:						// Id y cantidad de iconos ganados (un jugador puede ganar el mismo item varias veces) 
//	[ {
//		ItemID: <ItemID>,
//		Quantity: <Quantity>
//	} ],
//TimePlayed: <Time>,
//Area: <AreaID>,
//FBFriends: 						//para sacar un ranking de FB mas rapido
//	[ {
//		UserID: <UserID>,
//		Points: <Points>
//	} ],
//Car: <UserCar>,
//Active: <Active>
//}
public class User {
	private ObjectId Id;
	private String UserName;
	private String UserAccount;
	private String Password;
	private String IMEI;
	private int TotalPoints;
	private ObjectId[] Missions;
	private ObjectId[] UnfinishedMissions;
	private ObjectId[] GainedItems;
	private int TimePlayed;
	private ObjectId Area;
	private ObjectId[] FbFriends;
	private int UserCar;
	private String Active;
	
	
	public User(String name, String account, String password, String imei, ObjectId area){
		this.UserName = name;
		this.UserAccount = account;
		this.Password = password;
		this.IMEI= imei;
		this.Area = area;
		this.TotalPoints = 0;
		this.Missions = new ObjectId[0];
		this.UnfinishedMissions = new ObjectId[0];
		this.GainedItems = new ObjectId[0];
		this.TimePlayed = 0;
		this.FbFriends = new ObjectId[0];
		this.UserCar = 0;
		this.Active = "true";		
	}
	
	
	
	public ObjectId getId() {
		return Id;
	}
	public void setId(ObjectId id) {
		Id = id;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserAccount() {
		return UserAccount;
	}
	public void setUserAccount(String userAccount) {
		UserAccount = userAccount;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getIMEI() {
		return IMEI;
	}
	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}
	public int getTotalPoints() {
		return TotalPoints;
	}
	public void setTotalPoints(int totalPoints) {
		TotalPoints = totalPoints;
	}
	public ObjectId[] getMissions() {
		return Missions;
	}
	public void setMissions(ObjectId[] missions) {
		Missions = missions;
	}
	public ObjectId[] getUnfinishedMissions() {
		return UnfinishedMissions;
	}
	public void setUnfinishedMissions(ObjectId[] unfinishedMissions) {
		UnfinishedMissions = unfinishedMissions;
	}
	public ObjectId[] getGainedItems() {
		return GainedItems;
	}
	public void setGainedItems(ObjectId[] gainedItems) {
		GainedItems = gainedItems;
	}
	public int getTimePlayed() {
		return TimePlayed;
	}
	public void setTimePlayed(int timePlayed) {
		TimePlayed = timePlayed;
	}
	public ObjectId getArea() {
		return Area;
	}
	public void setArea(ObjectId area) {
		Area = area;
	}
	public ObjectId[] getFbFriends() {
		return FbFriends;
	}
	public void setFbFriends(ObjectId[] fbFriends) {
		FbFriends = fbFriends;
	}
	public int getUserCar() {
		return UserCar;
	}
	public void setUserCar(int userCar) {
		UserCar = userCar;
	}
	public String getActive() {
		return Active;
	}
	public void setActive(String active) {
		Active = active;
	}    
        
    public static void createUser(String pUserName, String pUserAccount, String pPassword, String pIMEI, String pArea){
        UserDataAccess _User = new UserDataAccess();
        if(_User.VerifyAccount(pUserAccount)){
            ObjectId _Insert = _User.insertUser(pUserName,pUserAccount,pPassword,pIMEI,pArea);
            if (_Insert.equals(null)){
            System.out.println("Error al ingresar el Usuario");
            }else{
            System.out.println("Usuario ID: " + _Insert);
        }
            
        }else{
            System.out.println("El nombre de la cuenta ya esta registrado");
        }
        

    }
       
        public static int getDeleteAccount(String pUserID)
    {
       int _UserID = Integer.parseInt(pUserID);
       // Call the Mongo Data Access
       int _OKValue = 0;
       return _OKValue;
    }
    public static void saveRanking(String pUserID, String pPoints)
    {
       int _UserID = Integer.parseInt(pUserID);
       int _PointUser = Integer.parseInt(pPoints);
       // Call the Mongo Data Access
    }
    
    //public static void setUserLocation(String pLatitude , String pLength);
    //public static String[] getUserLocation();

}
 