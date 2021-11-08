package com.nordskog.LesserAudioSwitch.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;

public class WidgetProvider extends AppWidgetProvider {
    public void onDeleted(Context context, int[] iArr) {
        for (int i : iArr) {
            SharedPreferences.Editor edit = context.getSharedPreferences("com.nordskog.LesserAudioSwitch_widgets", 0).edit();
            edit.remove("widget_config_" + i);
            edit.apply();
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i : iArr) {
            int i2 = context.getSharedPreferences("com.nordskog.LesserAudioSwitch_widgets", 0).getInt("widget_config_" + i, 0);
            boolean z = true;
            if (i2 == 0) {
                i2 = 1;
            }
            HashSet hashSet = new HashSet();
            int i3 = 0;
            while (true) {
                int[] iArr2 = C1478zu.f5370a;
                if (i3 >= iArr2.length) {
                    break;
                }
                int i4 = C1478zu.f5371b[i3];
                if ((i2 & i4) == i4) {
                    hashSet.add(Integer.valueOf(iArr2[i3]));
                }
                i3++;
            }
            if ((i2 & 67108864) != 67108864) {
                z = false;
            }
            appWidgetManager.updateAppWidget(i, C1478zu.m3994a(context, hashSet, z));
        }
    }
}
