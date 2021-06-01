package Java.Core.Concretes;

import Java.Core.Abstractes.ValidatorService;
import Java.Entities.Concretes.User;

import java.util.ArrayList;

public class RepeatMailValidator implements ValidatorService {
   private ArrayList<String> mails= new ArrayList<String>();

    public RepeatMailValidator() {
    }

    @Override
    public boolean checkUser(User user) {

        if (mails.isEmpty()){
            mails.add(user.geteMail());
            return true;
        }
        for (String mail : mails){
            if (mail== user.geteMail()){
                System.out.println("Repeat mail adress please add new mail adress");
                return false;
            }
        }
        mails.add(user.geteMail());
        return true;
    }
}
