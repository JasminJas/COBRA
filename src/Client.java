import MedicineServicePackage.Medicine;
import MedicineServicePackage.MedicineHelper;
import MedicineServicePackage.medicine_listHelper;
import MedicineServicePackage.not_found_exception;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class Client {
    public static void main(String[] args) throws InvalidName, org.omg.CosNaming.NamingContextPackage.InvalidName, CannotProceed, NotFound {
        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);

        org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
        NamingContext ncRef = NamingContextHelper.narrow(objRef);
        NameComponent nc = new NameComponent("MedicineService", "");
        NameComponent path[] = {nc};

/*        MedicineService proxy = medicine_listHelper.narrow(ncRef.resolve(path));

        Medicine medicine1 = new Medicine(0, "Ibuprom", "Ibuprofen", 200.0);
        Medicine medicine2 = new Medicine(1, "Apap", "Paracetamol", 200.0);
        Medicine medicine3 = new Medicine(2, "Ketonal Active", "Ketoprofenum", 50.0);

        proxy.addMedicine(medicine1);
        proxy.addMedicine(medicine2);
        proxy.addMedicine(medicine3);

        Medicine[] medicineArray = proxy.getMedicines();
        for(Medicine m : medicineArray) {
            System.out.println(m);
        }

        try {
            proxy.getMedicineById(0);
        }catch(not_found_exception e){
            e.printStackTrace();
        }

        try {
            proxy.getMedicineByName("Ibuprom");
        }catch(not_found_exception e){
            e.printStackTrace();
        }

        try {
            proxy.getMedicineByNameDose("Ibuprom", 200);
        }catch(not_found_exception e){
            e.printStackTrace();
        }*/
    }
}
