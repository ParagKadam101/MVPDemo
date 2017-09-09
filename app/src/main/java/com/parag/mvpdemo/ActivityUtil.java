package com.parag.mvpdemo;

import android.content.Context;
import android.content.Intent;

public class ActivityUtil {
    private Context context;
    public ActivityUtil(Context context)
    {
        this.context = context;
    }
    public void startMainActivity()
    {
        context.startActivity(new Intent(context,SuccessActivity.class));
    }
}
