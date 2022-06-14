import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class Server {

    public static void main(String[] args) throws InvalidName, org.omg.CosNaming.NamingContextPackage.InvalidName, CannotProceed, NotFound, InterruptedException {
        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);
        MedicineServant as = new MedicineServant();
        orb.connect(as);

        org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
        NamingContext ncRef = NamingContextHelper.narrow(objRef);
        NameComponent nc = new NameComponent("MedicineService", "");
        NameComponent path[] = {nc};
        ncRef.rebind(path, as);

        java.lang.Object sync = new java.lang.Object();
        synchronized (sync) {
            sync.wait();
        }
    }
}
