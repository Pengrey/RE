package p212l2;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: l2.c */
/* loaded from: classes.dex */
public abstract class AbstractC6967c extends AbstractC6962a {

    /* renamed from: E */
    private int f18508E;

    /* renamed from: F */
    private int f18509F;

    /* renamed from: G */
    private LayoutInflater f18510G;

    @Deprecated
    public AbstractC6967c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f18509F = i;
        this.f18508E = i;
        this.f18510G = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p212l2.AbstractC6962a
    /* renamed from: g */
    public View mo19692g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f18510G.inflate(this.f18509F, viewGroup, false);
    }

    @Override // p212l2.AbstractC6962a
    /* renamed from: h */
    public View mo19691h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f18510G.inflate(this.f18508E, viewGroup, false);
    }
}
