package p303q1;

import java.text.CharacterIterator;
import p181jd.Intrinsics;

/* renamed from: q1.b */
/* loaded from: classes.dex */
public final class CharSequenceCharacterIterator implements CharacterIterator {

    /* renamed from: w */
    private final CharSequence f25199w;

    /* renamed from: x */
    private final int f25200x;

    /* renamed from: y */
    private final int f25201y;

    /* renamed from: z */
    private int f25202z;

    public CharSequenceCharacterIterator(CharSequence charSequence, int i, int i2) {
        Intrinsics.isThisObjectNull(charSequence, "charSequence");
        this.f25199w = charSequence;
        this.f25200x = i;
        this.f25201y = i2;
        this.f25202z = i;
    }

    public Object clone() {
        try {
            Object clone = super.clone();
            Intrinsics.checkIfNull(clone, "{\n            @Suppress(…  super.clone()\n        }");
            return clone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public char current() {
        int i = this.f25202z;
        if (i == this.f25201y) {
            return (char) 65535;
        }
        return this.f25199w.charAt(i);
    }

    public char first() {
        this.f25202z = this.f25200x;
        return current();
    }

    public int getBeginIndex() {
        return this.f25200x;
    }

    public int getEndIndex() {
        return this.f25201y;
    }

    public int getIndex() {
        return this.f25202z;
    }

    public char last() {
        int i = this.f25200x;
        int i2 = this.f25201y;
        if (i == i2) {
            this.f25202z = i2;
            return (char) 65535;
        }
        int i3 = i2 - 1;
        this.f25202z = i3;
        return this.f25199w.charAt(i3);
    }

    public char next() {
        int i = this.f25202z + 1;
        this.f25202z = i;
        int i2 = this.f25201y;
        if (i >= i2) {
            this.f25202z = i2;
            return (char) 65535;
        }
        return this.f25199w.charAt(i);
    }

    public char previous() {
        int i = this.f25202z;
        if (i <= this.f25200x) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f25202z = i2;
        return this.f25199w.charAt(i2);
    }

    public char setIndex(int i) {
        int i2 = this.f25200x;
        boolean z = false;
        if (i <= this.f25201y && i2 <= i) {
            z = true;
        }
        if (z) {
            this.f25202z = i;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
