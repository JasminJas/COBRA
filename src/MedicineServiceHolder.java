
/**
* MedicineServiceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from MedicineService.idl
* wtorek, 14 czerwca 2022 12:41:24 CEST
*/

public final class MedicineServiceHolder implements org.omg.CORBA.portable.Streamable
{
  public MedicineService value = null;

  public MedicineServiceHolder ()
  {
  }

  public MedicineServiceHolder (MedicineService initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MedicineServiceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MedicineServiceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MedicineServiceHelper.type ();
  }

}
