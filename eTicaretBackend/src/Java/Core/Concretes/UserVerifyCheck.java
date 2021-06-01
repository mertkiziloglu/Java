package Java.Core.Concretes;

import Java.Core.Abstractes.UserVerifyService;

import java.util.Objects;
import java.util.Scanner;

public class UserVerifyCheck implements UserVerifyService {
    @Override
    public boolean userVerifyService() {
        System.out.println("========Kullanici Dogrulama Ekrani========");
        int codes= (int) (Math.random()*999999);
        System.out.println("Dogrulama kodunuz : "+codes);
        Scanner input=new Scanner(System.in);
        int userCode=input.nextInt();
        System.out.println("Dogrulama kodunuzu girin : ");


        if (codes==userCode) {
            return true;
        }
        else {
        return false;
        }
    }
}
