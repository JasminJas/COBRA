import MedicineServicePackage.Medicine;
import MedicineServicePackage.not_found_exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedicineServant extends _MedicineServiceImplBase{

    private Medicine[] medicine_list;

    @Override
    public Medicine[] getMedicines() {
        return medicine_list;
    }

    @Override
    public Medicine getMedicineById(int id) throws not_found_exception {
        for(int i = 0; i < medicine_list.length; i++){
            if(medicine_list[i].id == id){
                return medicine_list[i];
            }
        }
        return null;
    }

    @Override
    public void addMedicine(Medicine med) {
        List<Medicine> medicine_list_list = new ArrayList<>(Arrays.asList(medicine_list));
        for(int i = 0; i < medicine_list.length; i++){
            medicine_list_list.add(medicine_list[i]);
        }
        medicine_list_list.add(med);
        this.medicine_list = new Medicine[medicine_list_list.size()];
        medicine_list = medicine_list_list.toArray(medicine_list);

    }

    @Override
    public Medicine getMedicineByName(String name) throws not_found_exception {
         for(int i = 0; i < medicine_list.length; i++){
            if(medicine_list[i].name == name){
                return medicine_list[i];
            }
        }
         return null;
    }

    @Override
    public Medicine getMedicineByNameDose(String name, double dose) throws not_found_exception {
        for(int i = 0; i < medicine_list.length; i++){
            if(medicine_list[i].name == name){
                if(medicine_list[i].dose == dose){
                    return medicine_list[i];
                }
            }
        }
        return null;
    }
}
