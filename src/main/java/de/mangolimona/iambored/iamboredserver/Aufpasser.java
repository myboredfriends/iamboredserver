package de.mangolimona.iambored.iamboredserver;

public class Aufpasser {
    boolean checkIdentity(final String id,final  String challenge,final  String response){
        //tbd for now validation is always true :))))
        return true;
    }
    boolean chekIsBanned(final String id){
        //right now we do not ban people
        return false;
    }
}
