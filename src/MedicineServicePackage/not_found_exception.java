package MedicineServicePackage;


/**
* MedicineServicePackage/not_found_exception.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from MedicineService.idl
* wtorek, 14 czerwca 2022 12:41:24 CEST
*/

public final class not_found_exception extends org.omg.CORBA.UserException
{

  public not_found_exception ()
  {
    super(not_found_exceptionHelper.id());
  } // ctor


  public not_found_exception (String $reason)
  {
    super(not_found_exceptionHelper.id() + "  " + $reason);
  } // ctor

} // class not_found_exception
