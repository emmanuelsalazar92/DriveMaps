// Instituto Tecnologico de Costa Rica
// Escuela de Ingenieria en Computacion 
// Componenetes en Comunicaciones en Internet
// Profesor Rodrigo Nuñez Nuñez
// Alumnos:
//      Cesar Peralta
//      Emmanuel Salazar
// BackEnd Primer Proyecto.

package Logic;

//Monngo Scheme

import MongoDataAccess.MissionDataAccess;
import org.bson.types.ObjectId;

//
//Mision
//{
//_id: <MissionID>,
//UserOwner: <UserID>,						
//Item: <ItemID>,						
//Start: 
//	{ 
//		X: <Latitude>,
//		Y: <Length>,
//	},
//Destiny: 
//	{ 
//		nameDestiny: <nameDestiny>,
//		X: <Latitude>,
//		Y: <Length>,
//	},
//ActualPosition: 
//	{ 
//		X: <Latitude>,
//		Y: <Length>,
//	},
//Pauses: <Pauses>,
//Points: <Points>,
//Time: <Time>,
//Recieved: <Recieved>,
//Finished: <Finished>
//}
public class Mission {
    private ObjectId Id;
    private ObjectId UserId;
    private ObjectId ItemId;
    private float[] Start;
    private float[] Destiny;
    private float[] ActualPosition;
    private int Pauses;
    private int Points;
    private int Time;
    private String Recieved;
    private String Finished;

    public ObjectId getId() {
            return Id;
    }
    public void setId(ObjectId id) {
            Id = id;
    }
    public ObjectId getUserId() {
            return UserId;
    }
    public void setUserId(ObjectId userId) {
            UserId = userId;
    }
    public ObjectId getItemId() {
            return ItemId;
    }
    public void setItemId(ObjectId itemId) {
            ItemId = itemId;
    }
    public float[] getStart() {
            return Start;
    }
    public void setStart(float[] start) {
            Start = start;
    }
    public float[] getDestiny() {
            return Destiny;
    }
    public void setDestiny(float[] destiny) {
            Destiny = destiny;
    }
    public float[] getActualPosition() {
            return ActualPosition;
    }
    public void setActualPosition(float[] actualPosition) {
            ActualPosition = actualPosition;
    }
    public int getPauses() {
            return Pauses;
    }
    public void setPauses(int pauses) {
            Pauses = pauses;
    }
    public int getPoints() {
            return Points;
    }
    public void setPoints(int points) {
            Points = points;
    }
    public int getTime() {
            return Time;
    }
    public void setTime(int time) {
            this.Time = time;
    }
    public String getRecieved() {
            return Recieved;
    }
    public void setRecieved(String recieved) {
            Recieved = recieved;
    }
    public String getFinished() {
            return Finished;
    }
    public void setFinished(String finished) {
            Finished = finished;
    }
    public static int getNumberPauses(String pMissionID)
    {   
        MissionDataAccess _Mission = new MissionDataAccess();
        int _NumberOfPauses;
        _NumberOfPauses = _Mission.getPauses(pMissionID);
        return _NumberOfPauses;
    }
    public static int getPauseMission(String pMissionID)
    {
       int _MissionID = Integer.parseInt(pMissionID);
       // Call the Mongo Data Access
       int _OKValue = 0;
       return _OKValue;
    }
    public static int getDeleteMission(String pMissionID)
    {
       int _MissionID = Integer.parseInt(pMissionID);
       // Call the Mongo Data Access
       int _OKValue = 0;
       return _OKValue;        
    }
    public static int getPointsHit(String pMissionID)
    {
       MissionDataAccess _Mission = new MissionDataAccess();
       int _PointsHit;
      _PointsHit = _Mission.getPoints(pMissionID);
       return _PointsHit; 
    }
    public static int getPointsMissionCancel(String pMissionID)
    {
       int _MissionID = Integer.parseInt(pMissionID);
       // Call the Mongo Data Access
       int _PointsMissionCancel = 0;
       return _PointsMissionCancel;     
    }
    public static int getPointsDrivingOutStreet(String pMissionID)
    {
       int _MissionID = Integer.parseInt(pMissionID);
       // Call the Mongo Data Access
       int _PointsDrivingOut = 0;
       return _PointsDrivingOut; 
    }
    public static void createMission(String pUserId,String pItemId,String pDestinyId, String pLatitudeOrigin, String pLengthOrigin)
    {
        MissionDataAccess _Mission = new MissionDataAccess();
        ObjectId _Insert = _Mission.insertMission(pUserId,pItemId,pDestinyId,pLatitudeOrigin,pLengthOrigin);
        if (_Insert.equals(null)){
            System.out.println("Error al ingresar la mision");
        }else{
            System.out.println("Mision ID: " + _Insert);
        }
    }
    public static int calculateTime(String pStartTime, String pCurrentTime)
    {
        int _StartTime = Integer.parseInt(pStartTime);
        int _CurrentTime = Integer.parseInt(pCurrentTime);
        int _MissionTime = 0;
        _MissionTime = _CurrentTime - _StartTime;
        return _MissionTime;
    }
}
