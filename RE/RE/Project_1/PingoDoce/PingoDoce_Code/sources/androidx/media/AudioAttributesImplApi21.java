package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    AudioAttributes f4396a;

    /* renamed from: b */
    int f4397b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f4396a.equals(((AudioAttributesImplApi21) obj).f4396a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4396a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f4396a;
    }
}
