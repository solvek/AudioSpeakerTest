package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C1167tf tfVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f630a;
        if (tfVar.mo4653i(1)) {
            obj = tfVar.mo4659o();
        }
        remoteActionCompat.f630a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f631b;
        if (tfVar.mo4653i(2)) {
            charSequence = tfVar.mo4652h();
        }
        remoteActionCompat.f631b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f632c;
        if (tfVar.mo4653i(3)) {
            charSequence2 = tfVar.mo4652h();
        }
        remoteActionCompat.f632c = charSequence2;
        remoteActionCompat.f633d = (PendingIntent) tfVar.mo4657m(remoteActionCompat.f633d, 4);
        boolean z = remoteActionCompat.f634e;
        if (tfVar.mo4653i(5)) {
            z = tfVar.mo4650f();
        }
        remoteActionCompat.f634e = z;
        boolean z2 = remoteActionCompat.f635f;
        if (tfVar.mo4653i(6)) {
            z2 = tfVar.mo4650f();
        }
        remoteActionCompat.f635f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C1167tf tfVar) {
        tfVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f630a;
        tfVar.mo4660p(1);
        tfVar.mo4667w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f631b;
        tfVar.mo4660p(2);
        tfVar.mo4663s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f632c;
        tfVar.mo4660p(3);
        tfVar.mo4663s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f633d;
        tfVar.mo4660p(4);
        tfVar.mo4665u(pendingIntent);
        boolean z = remoteActionCompat.f634e;
        tfVar.mo4660p(5);
        tfVar.mo4661q(z);
        boolean z2 = remoteActionCompat.f635f;
        tfVar.mo4660p(6);
        tfVar.mo4661q(z2);
    }
}
