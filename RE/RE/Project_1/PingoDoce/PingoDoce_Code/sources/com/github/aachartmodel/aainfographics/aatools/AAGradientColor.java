package com.github.aachartmodel.aainfographics.aatools;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p181jd.Intrinsics;
import p468yc.C13191r;
import p489zc.C13769l0;

/* compiled from: AAGradientColor.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b7\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bX\u0010YJ\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u0014\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002J\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e0\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003J*\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003J/\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010#¢\u0006\u0004\b\"\u0010%R%\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R%\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R%\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R%\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R%\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b1\u0010)R%\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010)R%\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)R%\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b7\u0010)R%\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b9\u0010)R%\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010'\u001a\u0004\b;\u0010)R%\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010'\u001a\u0004\b=\u0010)R%\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010'\u001a\u0004\b?\u0010)R%\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\bA\u0010)R%\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010'\u001a\u0004\bC\u0010)R%\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010'\u001a\u0004\bE\u0010)R%\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010'\u001a\u0004\bG\u0010)R%\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010'\u001a\u0004\bI\u0010)R%\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010'\u001a\u0004\bK\u0010)R%\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bL\u0010'\u001a\u0004\bM\u0010)R%\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bN\u0010'\u001a\u0004\bO\u0010)R%\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bP\u0010'\u001a\u0004\bQ\u0010)R%\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bR\u0010'\u001a\u0004\bS\u0010)R%\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bT\u0010'\u001a\u0004\bU\u0010)R%\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bV\u0010'\u001a\u0004\bW\u0010)¨\u0006Z"}, m20207d2 = {"Lcom/github/aachartmodel/aainfographics/aatools/AAGradientColor;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "oceanBlueColor", "sanguineColor", "lusciousLimeColor", "purpleLakeColor", "freshPapayaColor", "ultramarineColor", "pinkSugarColor", "lemonDrizzleColor", "victoriaPurpleColor", "springGreensColor", "mysticMauveColor", "reflexSilverColor", "neonGlowColor", "berrySmoothieColor", "newLeafColor", "cottonCandyColor", "pixieDustColor", "fizzyPeachColor", "sweetDreamColor", "firebrickColor", "wroughtIronColor", "deepSeaColor", "coastalBreezeColor", "eveningDelightColor", "Lcom/github/aachartmodel/aainfographics/aatools/AALinearGradientDirection;", "direction", BuildConfig.VERSION_NAME, "linearGradientMap", "startColor", "endColor", "linearGradient", BuildConfig.VERSION_NAME, "stopsArr", "(Lcom/github/aachartmodel/aainfographics/aatools/AALinearGradientDirection;[Ljava/lang/Object;)Ljava/util/Map;", "PixieDust", "Ljava/util/Map;", "getPixieDust", "()Ljava/util/Map;", "PurpleLake", "getPurpleLake", "DeepSea", "getDeepSea", "FizzyPeach", "getFizzyPeach", "NeonGlow", "getNeonGlow", "Sanguine", "getSanguine", "VictoriaPurple", "getVictoriaPurple", "Firebrick", "getFirebrick", "LemonDrizzle", "getLemonDrizzle", "LusciousLime", "getLusciousLime", "PinkSugar", "getPinkSugar", "MysticMauve", "getMysticMauve", "CottonCandy", "getCottonCandy", "NewLeaf", "getNewLeaf", "FreshPapaya", "getFreshPapaya", "EveningDelight", "getEveningDelight", "Ultramarine", "getUltramarine", "SpringGreens", "getSpringGreens", "OceanBlue", "getOceanBlue", "CoastalBreeze", "getCoastalBreeze", "SweetDream", "getSweetDream", "ReflexSilver", "getReflexSilver", "BerrySmoothie", "getBerrySmoothie", "WroughtIron", "getWroughtIron", "<init>", "()V", "charts_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class AAGradientColor {
    private static final Map BerrySmoothie;
    private static final Map CoastalBreeze;
    private static final Map CottonCandy;
    private static final Map DeepSea;
    private static final Map EveningDelight;
    private static final Map Firebrick;
    private static final Map FizzyPeach;
    private static final Map FreshPapaya;
    public static final AAGradientColor INSTANCE;
    private static final Map LemonDrizzle;
    private static final Map LusciousLime;
    private static final Map MysticMauve;
    private static final Map NeonGlow;
    private static final Map NewLeaf;
    private static final Map OceanBlue;
    private static final Map PinkSugar;
    private static final Map PixieDust;
    private static final Map PurpleLake;
    private static final Map ReflexSilver;
    private static final Map Sanguine;
    private static final Map SpringGreens;
    private static final Map SweetDream;
    private static final Map Ultramarine;
    private static final Map VictoriaPurple;
    private static final Map WroughtIron;

    @Metadata(m20209bv = {1, 0, 3}, m20208d1 = {}, m20207d2 = {}, m20206k = 3, m20205mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AALinearGradientDirection.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AALinearGradientDirection.ToTop.ordinal()] = 1;
            iArr[AALinearGradientDirection.ToBottom.ordinal()] = 2;
            iArr[AALinearGradientDirection.ToLeft.ordinal()] = 3;
            iArr[AALinearGradientDirection.ToRight.ordinal()] = 4;
            iArr[AALinearGradientDirection.ToTopLeft.ordinal()] = 5;
            iArr[AALinearGradientDirection.ToTopRight.ordinal()] = 6;
            iArr[AALinearGradientDirection.ToBottomLeft.ordinal()] = 7;
            iArr[AALinearGradientDirection.ToBottomRight.ordinal()] = 8;
        }
    }

    static {
        AAGradientColor aAGradientColor = new AAGradientColor();
        INSTANCE = aAGradientColor;
        OceanBlue = aAGradientColor.oceanBlueColor();
        Sanguine = aAGradientColor.sanguineColor();
        LusciousLime = aAGradientColor.lusciousLimeColor();
        PurpleLake = aAGradientColor.purpleLakeColor();
        FreshPapaya = aAGradientColor.freshPapayaColor();
        Ultramarine = aAGradientColor.ultramarineColor();
        PinkSugar = aAGradientColor.pinkSugarColor();
        LemonDrizzle = aAGradientColor.lemonDrizzleColor();
        VictoriaPurple = aAGradientColor.victoriaPurpleColor();
        SpringGreens = aAGradientColor.springGreensColor();
        MysticMauve = aAGradientColor.mysticMauveColor();
        ReflexSilver = aAGradientColor.reflexSilverColor();
        NeonGlow = aAGradientColor.neonGlowColor();
        BerrySmoothie = aAGradientColor.berrySmoothieColor();
        NewLeaf = aAGradientColor.newLeafColor();
        CottonCandy = aAGradientColor.cottonCandyColor();
        PixieDust = aAGradientColor.pixieDustColor();
        FizzyPeach = aAGradientColor.fizzyPeachColor();
        SweetDream = aAGradientColor.sweetDreamColor();
        Firebrick = aAGradientColor.firebrickColor();
        WroughtIron = aAGradientColor.wroughtIronColor();
        DeepSea = aAGradientColor.deepSeaColor();
        CoastalBreeze = aAGradientColor.coastalBreezeColor();
        EveningDelight = aAGradientColor.eveningDelightColor();
    }

    private AAGradientColor() {
    }

    private final Map berrySmoothieColor() {
        return berrySmoothieColor(AALinearGradientDirection.ToTop);
    }

    private final Map coastalBreezeColor() {
        return coastalBreezeColor(AALinearGradientDirection.ToTop);
    }

    private final Map cottonCandyColor() {
        return cottonCandyColor(AALinearGradientDirection.ToTop);
    }

    private final Map deepSeaColor() {
        return deepSeaColor(AALinearGradientDirection.ToTop);
    }

    private final Map eveningDelightColor() {
        return eveningDelightColor(AALinearGradientDirection.ToTop);
    }

    private final Map firebrickColor() {
        return firebrickColor(AALinearGradientDirection.ToTop);
    }

    private final Map fizzyPeachColor() {
        return fizzyPeachColor(AALinearGradientDirection.ToTop);
    }

    private final Map freshPapayaColor() {
        return freshPapayaColor(AALinearGradientDirection.ToTop);
    }

    private final Map lemonDrizzleColor() {
        return lemonDrizzleColor(AALinearGradientDirection.ToTop);
    }

    private final Map linearGradientMap(AALinearGradientDirection aALinearGradientDirection) {
        Map m331h;
        Map m331h2;
        Map m331h3;
        Map m331h4;
        Map m331h5;
        Map m331h6;
        Map m331h7;
        Map m331h8;
        switch (WhenMappings.$EnumSwitchMapping$0[aALinearGradientDirection.ordinal()]) {
            case 1:
                m331h = C13769l0.m331h(C13191r.m1447a("x1", 0), C13191r.m1447a("y1", 1), C13191r.m1447a("x2", 0), C13191r.m1447a("y2", 0));
                return m331h;
            case 2:
                m331h2 = C13769l0.m331h(C13191r.m1447a("x1", 0), C13191r.m1447a("y1", 0), C13191r.m1447a("x2", 0), C13191r.m1447a("y2", 1));
                return m331h2;
            case 3:
                m331h3 = C13769l0.m331h(C13191r.m1447a("x1", 1), C13191r.m1447a("y1", 0), C13191r.m1447a("x2", 0), C13191r.m1447a("y2", 0));
                return m331h3;
            case 4:
                m331h4 = C13769l0.m331h(C13191r.m1447a("x1", 0), C13191r.m1447a("y1", 0), C13191r.m1447a("x2", 1), C13191r.m1447a("y2", 0));
                return m331h4;
            case 5:
                m331h5 = C13769l0.m331h(C13191r.m1447a("x1", 1), C13191r.m1447a("y1", 1), C13191r.m1447a("x2", 0), C13191r.m1447a("y2", 0));
                return m331h5;
            case 6:
                m331h6 = C13769l0.m331h(C13191r.m1447a("x1", 0), C13191r.m1447a("y1", 1), C13191r.m1447a("x2", 1), C13191r.m1447a("y2", 0));
                return m331h6;
            case 7:
                m331h7 = C13769l0.m331h(C13191r.m1447a("x1", 1), C13191r.m1447a("y1", 0), C13191r.m1447a("x2", 0), C13191r.m1447a("y2", 1));
                return m331h7;
            case 8:
                m331h8 = C13769l0.m331h(C13191r.m1447a("x1", 0), C13191r.m1447a("y1", 0), C13191r.m1447a("x2", 1), C13191r.m1447a("y2", 1));
                return m331h8;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final Map lusciousLimeColor() {
        return lusciousLimeColor(AALinearGradientDirection.ToTop);
    }

    private final Map mysticMauveColor() {
        return mysticMauveColor(AALinearGradientDirection.ToTop);
    }

    private final Map neonGlowColor() {
        return neonGlowColor(AALinearGradientDirection.ToTop);
    }

    private final Map newLeafColor() {
        return newLeafColor(AALinearGradientDirection.ToTop);
    }

    private final Map oceanBlueColor() {
        return oceanBlueColor(AALinearGradientDirection.ToTop);
    }

    private final Map pinkSugarColor() {
        return pinkSugarColor(AALinearGradientDirection.ToTop);
    }

    private final Map pixieDustColor() {
        return pixieDustColor(AALinearGradientDirection.ToTop);
    }

    private final Map purpleLakeColor() {
        return purpleLakeColor(AALinearGradientDirection.ToTop);
    }

    private final Map reflexSilverColor() {
        return reflexSilverColor(AALinearGradientDirection.ToTop);
    }

    private final Map sanguineColor() {
        return sanguineColor(AALinearGradientDirection.ToTop);
    }

    private final Map springGreensColor() {
        return springGreensColor(AALinearGradientDirection.ToTop);
    }

    private final Map sweetDreamColor() {
        return sweetDreamColor(AALinearGradientDirection.ToTop);
    }

    private final Map ultramarineColor() {
        return ultramarineColor(AALinearGradientDirection.ToTop);
    }

    private final Map victoriaPurpleColor() {
        return victoriaPurpleColor(AALinearGradientDirection.ToTop);
    }

    private final Map wroughtIronColor() {
        return wroughtIronColor(AALinearGradientDirection.ToTop);
    }

    public final Map getBerrySmoothie() {
        return BerrySmoothie;
    }

    public final Map getCoastalBreeze() {
        return CoastalBreeze;
    }

    public final Map getCottonCandy() {
        return CottonCandy;
    }

    public final Map getDeepSea() {
        return DeepSea;
    }

    public final Map getEveningDelight() {
        return EveningDelight;
    }

    public final Map getFirebrick() {
        return Firebrick;
    }

    public final Map getFizzyPeach() {
        return FizzyPeach;
    }

    public final Map getFreshPapaya() {
        return FreshPapaya;
    }

    public final Map getLemonDrizzle() {
        return LemonDrizzle;
    }

    public final Map getLusciousLime() {
        return LusciousLime;
    }

    public final Map getMysticMauve() {
        return MysticMauve;
    }

    public final Map getNeonGlow() {
        return NeonGlow;
    }

    public final Map getNewLeaf() {
        return NewLeaf;
    }

    public final Map getOceanBlue() {
        return OceanBlue;
    }

    public final Map getPinkSugar() {
        return PinkSugar;
    }

    public final Map getPixieDust() {
        return PixieDust;
    }

    public final Map getPurpleLake() {
        return PurpleLake;
    }

    public final Map getReflexSilver() {
        return ReflexSilver;
    }

    public final Map getSanguine() {
        return Sanguine;
    }

    public final Map getSpringGreens() {
        return SpringGreens;
    }

    public final Map getSweetDream() {
        return SweetDream;
    }

    public final Map getUltramarine() {
        return Ultramarine;
    }

    public final Map getVictoriaPurple() {
        return VictoriaPurple;
    }

    public final Map getWroughtIron() {
        return WroughtIron;
    }

    public final Map linearGradient(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "startColor");
        Intrinsics.isThisObjectNull(str2, "endColor");
        return linearGradient(AALinearGradientDirection.ToTop, str, str2);
    }

    public final Map berrySmoothieColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#8E78FF", "#FC7D7B");
    }

    public final Map coastalBreezeColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#00B7FF", "#FFFFC7");
    }

    public final Map cottonCandyColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#FCA5F1", "#B5FFFF");
    }

    public final Map deepSeaColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#4F00BC", "#29ABE2");
    }

    public final Map eveningDelightColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#93278F", "#00A99D");
    }

    public final Map firebrickColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#45145A", "#FF5300");
    }

    public final Map fizzyPeachColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#F24645", "#EBC08D");
    }

    public final Map freshPapayaColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#ED1C24", "#FCEE21");
    }

    public final Map lemonDrizzleColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#FB872B", "#D9E021");
    }

    public final Map lusciousLimeColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#009245", "#FCEE21");
    }

    public final Map mysticMauveColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#B066FE", "#63E2FF");
    }

    public final Map neonGlowColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#00FFA1", "#00FFFF");
    }

    public final Map newLeafColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#00537E", "#3AA17E");
    }

    public final Map oceanBlueColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#2E3192", "#1BFFFF");
    }

    public final Map pinkSugarColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#D74177", "#FFE98A");
    }

    public final Map pixieDustColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#D585FF", "#00FFEE");
    }

    public final Map purpleLakeColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#662D8C", "#ED1E79");
    }

    public final Map reflexSilverColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#808080", "#E6E6E6");
    }

    public final Map sanguineColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#D4145A", "#FBB03B");
    }

    public final Map springGreensColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#009E00", "#FFFF96");
    }

    public final Map sweetDreamColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#3A3897", "#A3A1FF");
    }

    public final Map ultramarineColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#00A8C5", "#FFFF7E");
    }

    public final Map victoriaPurpleColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#312A6C", "#852D91");
    }

    public final Map wroughtIronColor(AALinearGradientDirection aALinearGradientDirection) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        return linearGradient(aALinearGradientDirection, "#333333", "#5A5454");
    }

    public final Map linearGradient(AALinearGradientDirection aALinearGradientDirection, String str, String str2) {
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        Intrinsics.isThisObjectNull(str, "startColor");
        Intrinsics.isThisObjectNull(str2, "endColor");
        return linearGradient(aALinearGradientDirection, new Object[]{new Object[]{0, str}, new Object[]{1, str2}});
    }

    public final Map linearGradient(AALinearGradientDirection aALinearGradientDirection, Object[] objArr) {
        Map m331h;
        Intrinsics.isThisObjectNull(aALinearGradientDirection, "direction");
        Intrinsics.isThisObjectNull(objArr, "stopsArr");
        m331h = C13769l0.m331h(C13191r.m1447a("linearGradient", linearGradientMap(aALinearGradientDirection)), C13191r.m1447a("stops", objArr));
        return m331h;
    }
}
