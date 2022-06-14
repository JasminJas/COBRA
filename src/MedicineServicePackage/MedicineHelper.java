package MedicineServicePackage;


/**
* MedicineServicePackage/MedicineHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from MedicineService.idl
* wtorek, 14 czerwca 2022 12:41:24 CEST
*/

abstract public class MedicineHelper
{
  private static String  _id = "IDL:MedicineService/Medicine:1.0";

  public static void insert (org.omg.CORBA.Any a, MedicineServicePackage.Medicine that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static MedicineServicePackage.Medicine extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [4];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "name",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "api",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[3] = new org.omg.CORBA.StructMember (
            "dose",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (MedicineServicePackage.MedicineHelper.id (), "Medicine", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static MedicineServicePackage.Medicine read (org.omg.CORBA.portable.InputStream istream)
  {
    MedicineServicePackage.Medicine value = new MedicineServicePackage.Medicine ();
    value.id = istream.read_long ();
    value.name = istream.read_string ();
    value.api = istream.read_string ();
    value.dose = istream.read_double ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, MedicineServicePackage.Medicine value)
  {
    ostream.write_long (value.id);
    ostream.write_string (value.name);
    ostream.write_string (value.api);
    ostream.write_double (value.dose);
  }

}
