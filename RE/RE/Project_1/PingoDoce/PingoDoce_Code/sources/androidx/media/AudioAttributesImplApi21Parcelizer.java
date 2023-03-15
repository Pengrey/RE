package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f4396a = (AudioAttributes) versionedParcel.m35597r(audioAttributesImplApi21.f4396a, 1);
        audioAttributesImplApi21.f4397b = versionedParcel.m35598p(audioAttributesImplApi21.f4397b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.m35593x(false, false);
        versionedParcel.m35612H(audioAttributesImplApi21.f4396a, 1);
        versionedParcel.m35613F(audioAttributesImplApi21.f4397b, 2);
    }
}
