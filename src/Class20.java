public class Class20 {
	int anInt187;
	int anInt188;
	int anInt189;

	static void method93(final int var0) {
		Class84.activeC = new Class3();
		Class84.activeC.anInt21 = client.anIntArray2125[var0];
		Class84.activeC.anInt16 = client.anIntArray2063[var0];
		Class84.activeC.anInt18 = client.anIntArray2127[var0];
		Class84.activeC.anInt20 = client.anIntArray2140[var0];
		Class84.activeC.aString19 = client.aStringArray2129[var0];
	}

	static final void method94() {
		Def10.settrue(client.currentWid);
		++Class35.anInt375;
		if (client.aBool2163 && client.aBool2160) {
			int var0 = Class81.anInt652;
			int var3 = Class81.anInt653;
			var0 -= client.anInt2157;
			var3 -= client.anInt2145;
			if (var0 < client.anInt2161)
				var0 = client.anInt2161;

			if ((var0 + client.currentWid.anInt1168) > (client.anInt2161
					+ client.aClass124_Sub17_2199.anInt1168))
				var0 = (client.anInt2161 + client.aClass124_Sub17_2199.anInt1168)
						- client.currentWid.anInt1168;

			if (var3 < client.anInt2162)
				var3 = client.anInt2162;

			if ((var3 + client.currentWid.anInt1169) > (client.aClass124_Sub17_2199.anInt1169
					+ client.anInt2162))
				var3 = (client.anInt2162 + client.aClass124_Sub17_2199.anInt1169)
						- client.currentWid.anInt1169;

			final int var6 = var0 - client.anInt2200;
			final int var1 = var3 - client.anInt2165;
			final int var2 = client.currentWid.anInt1227;
			if ((Class35.anInt375 > client.currentWid.anInt1228)
					&& ((var6 > var2) || (var6 < -var2) || (var1 > var2) || (var1 < -var2)))
				client.aBool2233 = true;

			final int var9 = client.aClass124_Sub17_2199.anInt1174 + (var0 - client.anInt2161);
			final int var5 = client.aClass124_Sub17_2199.anInt1175 + (var3 - client.anInt2162);
			CSD cs;
			if ((client.currentWid.anObjectArray1256 != null) && client.aBool2233) {
				cs = new CSD();
				cs.aClass124_Sub17_994 = client.currentWid;
				cs.anInt998 = var9;
				cs.anInt1004 = var5;
				cs.anObjectArray995 = client.currentWid.anObjectArray1256;
				Class124_Sub22_Sub19_Sub3_Sub2.fullCS(cs);
			}

			if (Class81.anInt651 == 0) {
				if (client.aBool2233) {
					if (client.currentWid.anObjectArray1159 != null) {
						cs = new CSD();
						cs.aClass124_Sub17_994 = client.currentWid;
						cs.anInt998 = var9;
						cs.anInt1004 = var5;
						cs.aClass124_Sub17_1000 = client.wid;
						cs.anObjectArray995 = client.currentWid.anObjectArray1159;
						Class124_Sub22_Sub19_Sub3_Sub2.fullCS(cs);
					}

					if (null != client.wid) {
						Widget w = client.currentWid;
						final int var8 = RuntimeException_Sub1.method1012(Class124_Sub22_Sub19_Sub6.method963(w),
								485748520);
						if (var8 == 0)
							cs = null;
						else {
							int var7 = 0;

							while (true) {
								if (var7 >= var8)
									break;

								w = Class10.getwidget(w.anInt1259);
								if (null == w) {
									cs = null;
									break;
								}

								++var7;
							}
						}
					}
				} else if (((client.anInt2122 == 1) || Class53.method256(client.anInt2124 - 1))
						&& (client.anInt2124 > 2))
					Def13.method737(client.anInt2157 + client.anInt2200,
							client.anInt2145 + client.anInt2165);
				else if (client.anInt2124 > 0)
					Class124_Sub13.packet(client.anInt2200 + client.anInt2157, client.anInt2145 + client.anInt2165);

				client.currentWid = null;
			}

		} else if (Class35.anInt375 > 1)
			client.currentWid = null;
	}

	static void method95(final int var0, final String var1, final String var2) {
		Class49.method238(var0, var1, var2, (String) null);
	}

	public static void method96(final CacheArch var0, final String var1, final String var2, final int var3,
			final boolean var4) {
		final int var5 = var0.method376(var1);
		final int var6 = var0.method383(var5, var2);
		Class2.method19(var0, var5, var6, var3, var4);
	}
}
