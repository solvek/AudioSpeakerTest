package p000;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import com.nordskog.LesserAudioSwitch.p002ui.WidgetConfigActivity;
import java.util.Set;

/* renamed from: ms */
public final /* synthetic */ class C0849ms implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ WidgetConfigActivity f3323b;

    public /* synthetic */ C0849ms(WidgetConfigActivity widgetConfigActivity) {
        this.f3323b = widgetConfigActivity;
    }

    public final void onClick(View view) {
        WidgetConfigActivity widgetConfigActivity = this.f3323b;
        if (!widgetConfigActivity.f1812q.isEmpty()) {
            Set<Integer> set = widgetConfigActivity.f1812q;
            boolean z = widgetConfigActivity.f1811p;
            int i = widgetConfigActivity.f1810o;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int[] iArr = C1478zu.f5370a;
                if (i2 >= iArr.length) {
                    break;
                }
                if (set.contains(Integer.valueOf(iArr[i2]))) {
                    i3 |= C1478zu.f5371b[i2];
                }
                i2++;
            }
            if (z) {
                i3 |= 67108864;
            }
            SharedPreferences.Editor edit = widgetConfigActivity.getSharedPreferences("com.nordskog.LesserAudioSwitch_widgets", 0).edit();
            edit.putInt("widget_config_" + i, i3);
            edit.apply();
            AppWidgetManager.getInstance(widgetConfigActivity).updateAppWidget(widgetConfigActivity.f1810o, C1478zu.m3994a(widgetConfigActivity, widgetConfigActivity.f1812q, widgetConfigActivity.f1811p));
            Intent intent = new Intent();
            intent.putExtra("appWidgetId", widgetConfigActivity.f1810o);
            widgetConfigActivity.setResult(-1, intent);
        } else {
            widgetConfigActivity.setResult(0);
        }
        widgetConfigActivity.finish();
    }
}
