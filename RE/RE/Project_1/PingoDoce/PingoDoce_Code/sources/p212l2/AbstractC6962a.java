package p212l2;

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
import p212l2.C6965b;

/* renamed from: l2.a */
/* loaded from: classes.dex */
public abstract class AbstractC6962a extends BaseAdapter implements Filterable, C6965b.InterfaceC6966a {

    /* renamed from: A */
    protected int f18497A;

    /* renamed from: B */
    protected C6963a f18498B;

    /* renamed from: C */
    protected DataSetObserver f18499C;

    /* renamed from: D */
    protected C6965b f18500D;

    /* renamed from: w */
    protected boolean f18501w;

    /* renamed from: x */
    protected boolean f18502x;

    /* renamed from: y */
    protected Cursor f18503y;

    /* renamed from: z */
    protected Context f18504z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CursorAdapter.java */
    /* renamed from: l2.a$a */
    /* loaded from: classes.dex */
    public class C6963a extends ContentObserver {
        C6963a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AbstractC6962a.this.m19698i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CursorAdapter.java */
    /* renamed from: l2.a$b */
    /* loaded from: classes.dex */
    public class C6964b extends DataSetObserver {
        C6964b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC6962a abstractC6962a = AbstractC6962a.this;
            abstractC6962a.f18501w = true;
            abstractC6962a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC6962a abstractC6962a = AbstractC6962a.this;
            abstractC6962a.f18501w = false;
            abstractC6962a.notifyDataSetInvalidated();
        }
    }

    public AbstractC6962a(Context context, Cursor cursor, boolean z) {
        m19699f(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public void mo19696a(Cursor cursor) {
        Cursor m19697j = m19697j(cursor);
        if (m19697j != null) {
            m19697j.close();
        }
    }

    @Override // p212l2.C6965b.InterfaceC6966a
    /* renamed from: b */
    public Cursor mo19695b() {
        return this.f18503y;
    }

    /* renamed from: c */
    public abstract CharSequence mo19694c(Cursor cursor);

    /* renamed from: e */
    public abstract void mo19700e(View view, Context context, Cursor cursor);

    /* renamed from: f */
    void m19699f(Context context, Cursor cursor, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.f18502x = true;
        } else {
            this.f18502x = false;
        }
        boolean z = cursor != null;
        this.f18503y = cursor;
        this.f18501w = z;
        this.f18504z = context;
        this.f18497A = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f18498B = new C6963a();
            this.f18499C = new C6964b();
        } else {
            this.f18498B = null;
            this.f18499C = null;
        }
        if (z) {
            C6963a c6963a = this.f18498B;
            if (c6963a != null) {
                cursor.registerContentObserver(c6963a);
            }
            DataSetObserver dataSetObserver = this.f18499C;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo19692g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f18501w || (cursor = this.f18503y) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f18501w) {
            this.f18503y.moveToPosition(i);
            if (view == null) {
                view = mo19692g(this.f18504z, this.f18503y, viewGroup);
            }
            mo19700e(view, this.f18504z, this.f18503y);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f18500D == null) {
            this.f18500D = new C6965b(this);
        }
        return this.f18500D;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f18501w || (cursor = this.f18503y) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f18503y;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f18501w && (cursor = this.f18503y) != null && cursor.moveToPosition(i)) {
            return this.f18503y.getLong(this.f18497A);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f18501w) {
            if (this.f18503y.moveToPosition(i)) {
                if (view == null) {
                    view = mo19691h(this.f18504z, this.f18503y, viewGroup);
                }
                mo19700e(view, this.f18504z, this.f18503y);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    /* renamed from: h */
    public abstract View mo19691h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: i */
    protected void m19698i() {
        Cursor cursor;
        if (!this.f18502x || (cursor = this.f18503y) == null || cursor.isClosed()) {
            return;
        }
        this.f18501w = this.f18503y.requery();
    }

    /* renamed from: j */
    public Cursor m19697j(Cursor cursor) {
        Cursor cursor2 = this.f18503y;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C6963a c6963a = this.f18498B;
            if (c6963a != null) {
                cursor2.unregisterContentObserver(c6963a);
            }
            DataSetObserver dataSetObserver = this.f18499C;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f18503y = cursor;
        if (cursor != null) {
            C6963a c6963a2 = this.f18498B;
            if (c6963a2 != null) {
                cursor.registerContentObserver(c6963a2);
            }
            DataSetObserver dataSetObserver2 = this.f18499C;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f18497A = cursor.getColumnIndexOrThrow("_id");
            this.f18501w = true;
            notifyDataSetChanged();
        } else {
            this.f18497A = -1;
            this.f18501w = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
