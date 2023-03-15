package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.internal.C3646n;
import java.util.Locale;
import p100f8.C5421d;
import p100f8.C5426i;
import p100f8.C5427j;
import p100f8.C5428k;
import p100f8.C5429l;
import p237m8.C7145a;
import p354s8.C10086c;
import p354s8.C10087d;

/* loaded from: classes.dex */
public final class BadgeState {

    /* renamed from: a */
    private final State f9400a;

    /* renamed from: b */
    private final State f9401b;

    /* renamed from: c */
    final float f9402c;

    /* renamed from: d */
    final float f9403d;

    /* renamed from: e */
    final float f9404e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BadgeState(Context context, int i, int i2, int i3, State state) {
        CharSequence charSequence;
        int i4;
        int i5;
        int i6;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        Locale locale;
        State state2 = new State();
        this.f9401b = state2;
        state = state == null ? new State() : state;
        if (i != 0) {
            state.f9419w = i;
        }
        TypedArray m30600a = m30600a(context, state.f9419w, i2, i3);
        Resources resources = context.getResources();
        this.f9402c = m30600a.getDimensionPixelSize(C5429l.f15237q, resources.getDimensionPixelSize(C5421d.mtrl_badge_radius));
        this.f9404e = m30600a.getDimensionPixelSize(C5429l.f15253s, resources.getDimensionPixelSize(C5421d.mtrl_badge_long_text_horizontal_padding));
        this.f9403d = m30600a.getDimensionPixelSize(C5429l.f15261t, resources.getDimensionPixelSize(C5421d.mtrl_badge_with_text_radius));
        state2.f9422z = state.f9422z == -2 ? 255 : state.f9422z;
        if (state.f9408D != null) {
            charSequence = state.f9408D;
        } else {
            charSequence = context.getString(C5427j.mtrl_badge_numberless_content_description);
        }
        state2.f9408D = charSequence;
        if (state.f9409E != 0) {
            i4 = state.f9409E;
        } else {
            i4 = C5426i.mtrl_badge_content_description;
        }
        state2.f9409E = i4;
        if (state.f9410F != 0) {
            i5 = state.f9410F;
        } else {
            i5 = C5427j.mtrl_exceed_max_badge_number_content_description;
        }
        state2.f9410F = i5;
        state2.f9412H = Boolean.valueOf(state.f9412H == null || state.f9412H.booleanValue());
        if (state.f9406B != -2) {
            i6 = state.f9406B;
        } else {
            i6 = m30600a.getInt(C5429l.f15285w, 4);
        }
        state2.f9406B = i6;
        if (state.f9405A != -2) {
            state2.f9405A = state.f9405A;
        } else {
            int i7 = C5429l.f15293x;
            if (m30600a.hasValue(i7)) {
                state2.f9405A = m30600a.getInt(i7, 0);
            } else {
                state2.f9405A = -1;
            }
        }
        if (state.f9420x != null) {
            intValue = state.f9420x.intValue();
        } else {
            intValue = m30580u(context, m30600a, C5429l.f15221o);
        }
        state2.f9420x = Integer.valueOf(intValue);
        if (state.f9421y != null) {
            state2.f9421y = state.f9421y;
        } else {
            int i8 = C5429l.f15245r;
            if (m30600a.hasValue(i8)) {
                state2.f9421y = Integer.valueOf(m30580u(context, m30600a, i8));
            } else {
                state2.f9421y = Integer.valueOf(new C10087d(context, C5428k.TextAppearance_MaterialComponents_Badge).m9211i().getDefaultColor());
            }
        }
        if (state.f9411G != null) {
            intValue2 = state.f9411G.intValue();
        } else {
            intValue2 = m30600a.getInt(C5429l.f15229p, 8388661);
        }
        state2.f9411G = Integer.valueOf(intValue2);
        if (state.f9413I != null) {
            intValue3 = state.f9413I.intValue();
        } else {
            intValue3 = m30600a.getDimensionPixelOffset(C5429l.f15269u, 0);
        }
        state2.f9413I = Integer.valueOf(intValue3);
        if (state.f9413I != null) {
            intValue4 = state.f9414J.intValue();
        } else {
            intValue4 = m30600a.getDimensionPixelOffset(C5429l.f15301y, 0);
        }
        state2.f9414J = Integer.valueOf(intValue4);
        if (state.f9415K != null) {
            intValue5 = state.f9415K.intValue();
        } else {
            intValue5 = m30600a.getDimensionPixelOffset(C5429l.f15277v, state2.f9413I.intValue());
        }
        state2.f9415K = Integer.valueOf(intValue5);
        if (state.f9416L != null) {
            intValue6 = state.f9416L.intValue();
        } else {
            intValue6 = m30600a.getDimensionPixelOffset(C5429l.f15309z, state2.f9414J.intValue());
        }
        state2.f9416L = Integer.valueOf(intValue6);
        state2.f9417M = Integer.valueOf(state.f9417M == null ? 0 : state.f9417M.intValue());
        state2.f9418N = Integer.valueOf(state.f9418N != null ? state.f9418N.intValue() : 0);
        m30600a.recycle();
        if (state.f9407C != null) {
            state2.f9407C = state.f9407C;
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = Locale.getDefault(Locale.Category.FORMAT);
            } else {
                locale = Locale.getDefault();
            }
            state2.f9407C = locale;
        }
        this.f9400a = state;
    }

    /* renamed from: a */
    private TypedArray m30600a(Context context, int i, int i2, int i3) {
        AttributeSet attributeSet;
        int i4;
        if (i != 0) {
            AttributeSet m19089a = C7145a.m19089a(context, i, "badge");
            i4 = m19089a.getStyleAttribute();
            attributeSet = m19089a;
        } else {
            attributeSet = null;
            i4 = 0;
        }
        return C3646n.m29500h(context, attributeSet, C5429l.f15213n, i2, i4 == 0 ? i3 : i4, new int[0]);
    }

    /* renamed from: u */
    private static int m30580u(Context context, TypedArray typedArray, int i) {
        return C10086c.m9229a(context, typedArray, i).getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m30599b() {
        return this.f9401b.f9417M.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m30598c() {
        return this.f9401b.f9418N.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m30597d() {
        return this.f9401b.f9422z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m30596e() {
        return this.f9401b.f9420x.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m30595f() {
        return this.f9401b.f9411G.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m30594g() {
        return this.f9401b.f9421y.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m30593h() {
        return this.f9401b.f9410F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence m30592i() {
        return this.f9401b.f9408D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m30591j() {
        return this.f9401b.f9409E;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m30590k() {
        return this.f9401b.f9415K.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public int m30589l() {
        return this.f9401b.f9413I.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m30588m() {
        return this.f9401b.f9406B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m30587n() {
        return this.f9401b.f9405A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public Locale m30586o() {
        return this.f9401b.f9407C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public State m30585p() {
        return this.f9400a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public int m30584q() {
        return this.f9401b.f9416L.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public int m30583r() {
        return this.f9401b.f9414J.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m30582s() {
        return this.f9401b.f9405A != -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean m30581t() {
        return this.f9401b.f9412H.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m30579v(int i) {
        this.f9400a.f9422z = i;
        this.f9401b.f9422z = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m30578w(int i) {
        this.f9400a.f9405A = i;
        this.f9401b.f9405A = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m30577x(boolean z) {
        this.f9400a.f9412H = Boolean.valueOf(z);
        this.f9401b.f9412H = Boolean.valueOf(z);
    }

    /* loaded from: classes.dex */
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new C3468a();

        /* renamed from: A */
        private int f9405A;

        /* renamed from: B */
        private int f9406B;

        /* renamed from: C */
        private Locale f9407C;

        /* renamed from: D */
        private CharSequence f9408D;

        /* renamed from: E */
        private int f9409E;

        /* renamed from: F */
        private int f9410F;

        /* renamed from: G */
        private Integer f9411G;

        /* renamed from: H */
        private Boolean f9412H;

        /* renamed from: I */
        private Integer f9413I;

        /* renamed from: J */
        private Integer f9414J;

        /* renamed from: K */
        private Integer f9415K;

        /* renamed from: L */
        private Integer f9416L;

        /* renamed from: M */
        private Integer f9417M;

        /* renamed from: N */
        private Integer f9418N;

        /* renamed from: w */
        private int f9419w;

        /* renamed from: x */
        private Integer f9420x;

        /* renamed from: y */
        private Integer f9421y;

        /* renamed from: z */
        private int f9422z;

        /* renamed from: com.google.android.material.badge.BadgeState$State$a */
        /* loaded from: classes.dex */
        class C3468a implements Parcelable.Creator<State> {
            C3468a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
            this.f9422z = 255;
            this.f9405A = -2;
            this.f9406B = -2;
            this.f9412H = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9419w);
            parcel.writeSerializable(this.f9420x);
            parcel.writeSerializable(this.f9421y);
            parcel.writeInt(this.f9422z);
            parcel.writeInt(this.f9405A);
            parcel.writeInt(this.f9406B);
            CharSequence charSequence = this.f9408D;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f9409E);
            parcel.writeSerializable(this.f9411G);
            parcel.writeSerializable(this.f9413I);
            parcel.writeSerializable(this.f9414J);
            parcel.writeSerializable(this.f9415K);
            parcel.writeSerializable(this.f9416L);
            parcel.writeSerializable(this.f9417M);
            parcel.writeSerializable(this.f9418N);
            parcel.writeSerializable(this.f9412H);
            parcel.writeSerializable(this.f9407C);
        }

        State(Parcel parcel) {
            this.f9422z = 255;
            this.f9405A = -2;
            this.f9406B = -2;
            this.f9412H = Boolean.TRUE;
            this.f9419w = parcel.readInt();
            this.f9420x = (Integer) parcel.readSerializable();
            this.f9421y = (Integer) parcel.readSerializable();
            this.f9422z = parcel.readInt();
            this.f9405A = parcel.readInt();
            this.f9406B = parcel.readInt();
            this.f9408D = parcel.readString();
            this.f9409E = parcel.readInt();
            this.f9411G = (Integer) parcel.readSerializable();
            this.f9413I = (Integer) parcel.readSerializable();
            this.f9414J = (Integer) parcel.readSerializable();
            this.f9415K = (Integer) parcel.readSerializable();
            this.f9416L = (Integer) parcel.readSerializable();
            this.f9417M = (Integer) parcel.readSerializable();
            this.f9418N = (Integer) parcel.readSerializable();
            this.f9412H = (Boolean) parcel.readSerializable();
            this.f9407C = (Locale) parcel.readSerializable();
        }
    }
}
