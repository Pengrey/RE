package p212l2;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: l2.b */
/* loaded from: classes.dex */
class C6965b extends Filter {

    /* renamed from: a */
    InterfaceC6966a f18507a;

    /* compiled from: CursorFilter.java */
    /* renamed from: l2.b$a */
    /* loaded from: classes.dex */
    interface InterfaceC6966a {
        /* renamed from: a */
        void mo19696a(Cursor cursor);

        /* renamed from: b */
        Cursor mo19695b();

        /* renamed from: c */
        CharSequence mo19694c(Cursor cursor);

        /* renamed from: d */
        Cursor mo19693d(CharSequence charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6965b(InterfaceC6966a interfaceC6966a) {
        this.f18507a = interfaceC6966a;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f18507a.mo19694c((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo19693d = this.f18507a.mo19693d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo19693d != null) {
            filterResults.count = mo19693d.getCount();
            filterResults.values = mo19693d;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo19695b = this.f18507a.mo19695b();
        Object obj = filterResults.values;
        if (obj == null || obj == mo19695b) {
            return;
        }
        this.f18507a.mo19696a((Cursor) obj);
    }
}
