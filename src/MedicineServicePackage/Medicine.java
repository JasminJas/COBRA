package MedicineServicePackage;


/**
* MedicineServicePackage/Medicine.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from MedicineService.idl
* wtorek, 14 czerwca 2022 12:41:24 CEST
*/

public final class Medicine implements org.omg.CORBA.portable.IDLEntity
{
  public int id = (int)0;
  public String name = null;
  public String api = null;
  public double dose = (double)0;

  public Medicine ()
  {
  } // ctor

  public Medicine (int _id, String _name, String _api, double _dose)
  {
    id = _id;
    name = _name;
    api = _api;
    dose = _dose;
  } // ctor

} // class Medicine
