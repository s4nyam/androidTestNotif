package com.example.sanyam.androidtestnotif;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import android.util.Log;
/**
 * Created by Sanyam on 24-09-2017.
 */

public class testnotif extends FirebaseInstanceIdService {

    private static final String REG_TOKEN="REG_TOKEN";
    public void onTokenRefresh() {
        String recentToken=FirebaseInstanceId.getInstance().getToken();
        Log.d(REG_TOKEN,recentToken);
    }
}
