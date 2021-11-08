package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;

public class ProxyBillingActivity extends Activity {

    /* renamed from: b */
    public ResultReceiver f1407b;

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            int i3 = C0423eh.m1593c(intent, "ProxyBillingActivity").f1384a;
            if (!(i2 == -1 && i3 == 0)) {
                Log.isLoggable("ProxyBillingActivity", 5);
            }
            this.f1407b.send(i3, intent == null ? null : intent.getExtras());
        } else {
            int i4 = C0423eh.f2000a;
            Log.isLoggable("ProxyBillingActivity", 5);
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle == null) {
            int i = C0423eh.f2000a;
            Log.isLoggable("ProxyBillingActivity", 2);
            this.f1407b = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            String str = "BUY_INTENT";
            if (!getIntent().hasExtra(str)) {
                str = "SUBS_MANAGEMENT_INTENT";
                if (!getIntent().hasExtra(str)) {
                    pendingIntent = null;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 100, new Intent(), 0, 0, 0);
                }
            }
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra(str);
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 100, new Intent(), 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                String.valueOf(e).length();
                Log.isLoggable("ProxyBillingActivity", 5);
                this.f1407b.send(6, (Bundle) null);
                finish();
            }
        } else {
            int i2 = C0423eh.f2000a;
            Log.isLoggable("ProxyBillingActivity", 2);
            this.f1407b = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f1407b);
    }
}
