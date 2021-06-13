package com.salmon.design.principle.singleresponsibility;

/**
 * @date 2021-6-13 - 22:58
 * Created by Salmon
 */
//方法层面的单一职责
public class Method {
    private void updateUserInfo(String userName,String address){
        userName = "salmon";
        address = "daisdasiucbnuiask";
    }

    private void updateUserInfo(String userName,String... properties){
        userName = "salmon";
    }

    //以下两个方法是单一且清晰的
    private void updateUsername(String userName){
        userName = "salmon";
    }

    private void updateUserAddress(String address){
        address = "dadadadadafdvrrebe";
    }

    private void updateUserInfo(String userName,String address,boolean bool){
        if(bool){
            userName = "salmon";
            address = "daisdasiucbnuiask";
        }else {
            System.out.println("error");
        }
    }
}
