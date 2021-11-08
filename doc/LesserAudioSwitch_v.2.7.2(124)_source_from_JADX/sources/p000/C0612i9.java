package p000;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: i9 */
public class C0612i9 extends Filter {

    /* renamed from: a */
    public C0613a f2636a;

    /* renamed from: i9$a */
    public interface C0613a {
    }

    public C0612i9(C0613a aVar) {
        this.f2636a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return ((C0206b3) this.f2636a).mo1554c((Cursor) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            i9$a r0 = r4.f2636a
            b3 r0 = (p000.C0206b3) r0
            r0.getClass()
            if (r5 != 0) goto L_0x000c
            java.lang.String r5 = ""
            goto L_0x0010
        L_0x000c:
            java.lang.String r5 = r5.toString()
        L_0x0010:
            androidx.appcompat.widget.SearchView r1 = r0.f1212m
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L_0x0030
            androidx.appcompat.widget.SearchView r1 = r0.f1212m
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L_0x0022
            goto L_0x0030
        L_0x0022:
            android.app.SearchableInfo r1 = r0.f1213n     // Catch:{ RuntimeException -> 0x0030 }
            r3 = 50
            android.database.Cursor r5 = r0.mo1558g(r1, r5, r3)     // Catch:{ RuntimeException -> 0x0030 }
            if (r5 == 0) goto L_0x0030
            r5.getCount()     // Catch:{ RuntimeException -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r5 = r2
        L_0x0031:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L_0x0041
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L_0x0046
        L_0x0041:
            r5 = 0
            r0.count = r5
            r0.values = r2
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0612i9.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        C0613a aVar = this.f2636a;
        Cursor cursor = ((C0561h9) aVar).f2442d;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((C0206b3) aVar).mo1553b((Cursor) obj);
        }
    }
}
