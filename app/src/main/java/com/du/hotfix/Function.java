package com.du.hotfix;


import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Function {
    public void test(Context context){
        Toast.makeText(context,"修复完成",Toast.LENGTH_SHORT).show();
//        throw new NullPointerException("My error!");
    }
}
