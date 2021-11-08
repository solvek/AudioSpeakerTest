package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p000.C0612i9;

/* renamed from: h9 */
public abstract class C0561h9 extends BaseAdapter implements Filterable, C0612i9.C0613a {

    /* renamed from: b */
    public boolean f2440b;

    /* renamed from: c */
    public boolean f2441c;

    /* renamed from: d */
    public Cursor f2442d;

    /* renamed from: e */
    public Context f2443e;

    /* renamed from: f */
    public int f2444f;

    /* renamed from: g */
    public C0562a f2445g;

    /* renamed from: h */
    public DataSetObserver f2446h;

    /* renamed from: i */
    public C0612i9 f2447i;

    /* renamed from: h9$a */
    public class C0562a extends ContentObserver {
        public C0562a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            Cursor cursor;
            C0561h9 h9Var = C0561h9.this;
            if (h9Var.f2441c && (cursor = h9Var.f2442d) != null && !cursor.isClosed()) {
                h9Var.f2440b = h9Var.f2442d.requery();
            }
        }
    }

    /* renamed from: h9$b */
    public class C0563b extends DataSetObserver {
        public C0563b() {
        }

        public void onChanged() {
            C0561h9 h9Var = C0561h9.this;
            h9Var.f2440b = true;
            h9Var.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C0561h9 h9Var = C0561h9.this;
            h9Var.f2440b = false;
            h9Var.notifyDataSetInvalidated();
        }
    }

    public C0561h9(Context context, Cursor cursor, boolean z) {
        C0563b bVar;
        boolean z2 = true;
        char c = z ? (char) 1 : 2;
        if ((c & 1) == 1) {
            c |= 2;
            this.f2441c = true;
        } else {
            this.f2441c = false;
        }
        z2 = cursor == null ? false : z2;
        this.f2442d = cursor;
        this.f2440b = z2;
        this.f2443e = context;
        this.f2444f = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((c & 2) == 2) {
            this.f2445g = new C0562a();
            bVar = new C0563b();
        } else {
            bVar = null;
            this.f2445g = null;
        }
        this.f2446h = bVar;
        if (z2) {
            C0562a aVar = this.f2445g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f2446h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo1552a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public void mo1553b(Cursor cursor) {
        Cursor cursor2 = this.f2442d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0562a aVar = this.f2445g;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.f2446h;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f2442d = cursor;
            if (cursor != null) {
                C0562a aVar2 = this.f2445g;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.f2446h;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f2444f = cursor.getColumnIndexOrThrow("_id");
                this.f2440b = true;
                notifyDataSetChanged();
            } else {
                this.f2444f = -1;
                this.f2440b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: c */
    public abstract CharSequence mo1554c(Cursor cursor);

    /* renamed from: d */
    public abstract View mo1555d(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f2440b || (cursor = this.f2442d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f2440b) {
            return null;
        }
        this.f2442d.moveToPosition(i);
        if (view == null) {
            C0669j9 j9Var = (C0669j9) this;
            view = j9Var.f2850l.inflate(j9Var.f2849k, viewGroup, false);
        }
        mo1552a(view, this.f2443e, this.f2442d);
        return view;
    }

    public Filter getFilter() {
        if (this.f2447i == null) {
            this.f2447i = new C0612i9(this);
        }
        return this.f2447i;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f2440b || (cursor = this.f2442d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f2442d;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f2440b || (cursor = this.f2442d) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f2442d.getLong(this.f2444f);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f2440b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f2442d.moveToPosition(i)) {
            if (view == null) {
                view = mo1555d(this.f2443e, this.f2442d, viewGroup);
            }
            mo1552a(view, this.f2443e, this.f2442d);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }
}
