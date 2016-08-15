public class Class20 {
	int anInt187;
	int anInt188;
	int anInt189;

	static void method93(final int var0) {
		Class84.aClass3_674 = new Class3();
		Class84.aClass3_674.anInt21 = client.anIntArray2125[var0];
		Class84.aClass3_674.anInt16 = client.anIntArray2063[var0];
		Class84.aClass3_674.anInt18 = client.anIntArray2127[var0];
		Class84.aClass3_674.anInt20 = client.anIntArray2140[var0];
		Class84.aClass3_674.aString19 = client.aStringArray2129[var0];
	}

	static final void method94() {
		Class124_Sub22_Sub10.method723(client.aClass124_Sub17_2155);
		++Class35.anInt375;
		if (client.aBool2163 && client.aBool2160) {
			int var0 = Class81.anInt652;
			int var3 = Class81.anInt653;
			var0 -= client.anInt2157;
			var3 -= client.anInt2145;
			if (var0 < client.anInt2161)
				var0 = client.anInt2161;

			if ((var0 + client.aClass124_Sub17_2155.anInt1168) > (client.anInt2161
					+ client.aClass124_Sub17_2199.anInt1168))
				var0 = (client.anInt2161 + client.aClass124_Sub17_2199.anInt1168)
						- client.aClass124_Sub17_2155.anInt1168;

			if (var3 < client.anInt2162)
				var3 = client.anInt2162;

			if ((var3 + client.aClass124_Sub17_2155.anInt1169) > (client.aClass124_Sub17_2199.anInt1169
					+ client.anInt2162))
				var3 = (client.anInt2162 + client.aClass124_Sub17_2199.anInt1169)
						- client.aClass124_Sub17_2155.anInt1169;

			final int var6 = var0 - client.anInt2200;
			final int var1 = var3 - client.anInt2165;
			final int var2 = client.aClass124_Sub17_2155.anInt1227;
			if ((Class35.anInt375 > client.aClass124_Sub17_2155.anInt1228)
					&& ((var6 > var2) || (var6 < -var2) || (var1 > var2) || (var1 < -var2)))
				client.aBool2233 = true;

			final int var9 = client.aClass124_Sub17_2199.anInt1174 + (var0 - client.anInt2161);
			final int var5 = client.aClass124_Sub17_2199.anInt1175 + (var3 - client.anInt2162);
			Class124_Sub6 var4;
			if ((client.aClass124_Sub17_2155.anObjectArray1256 != null) && client.aBool2233) {
				var4 = new Class124_Sub6();
				var4.aClass124_Sub17_994 = client.aClass124_Sub17_2155;
				var4.anInt998 = var9;
				var4.anInt1004 = var5;
				var4.anObjectArray995 = client.aClass124_Sub17_2155.anObjectArray1256;
				Class124_Sub22_Sub19_Sub3_Sub2.method1048(var4);
			}

			if (Class81.anInt651 == 0) {
				if (client.aBool2233) {
					if (client.aClass124_Sub17_2155.anObjectArray1159 != null) {
						var4 = new Class124_Sub6();
						var4.aClass124_Sub17_994 = client.aClass124_Sub17_2155;
						var4.anInt998 = var9;
						var4.anInt1004 = var5;
						var4.aClass124_Sub17_1000 = client.aClass124_Sub17_2159;
						var4.anObjectArray995 = client.aClass124_Sub17_2155.anObjectArray1159;
						Class124_Sub22_Sub19_Sub3_Sub2.method1048(var4);
					}

					if (null != client.aClass124_Sub17_2159) {
						Class124_Sub17 var10 = client.aClass124_Sub17_2155;
						final int var8 = RuntimeException_Sub1.method1012(Class124_Sub22_Sub19_Sub6.method963(var10),
								485748520);
						if (var8 == 0)
							var4 = null;
						else {
							int var7 = 0;

							while (true) {
								if (var7 >= var8)
									break;

								var10 = Class10.method55(var10.anInt1259);
								if (null == var10) {
									var4 = null;
									break;
								}

								++var7;
							}
						}
					}
				} else if (((client.anInt2122 == 1) || Class53.method256(client.anInt2124 - 1))
						&& (client.anInt2124 > 2))
					Class124_Sub22_Sub12.method737(client.anInt2157 + client.anInt2200,
							client.anInt2145 + client.anInt2165);
				else if (client.anInt2124 > 0)
					Class124_Sub13.method541(client.anInt2200 + client.anInt2157, client.anInt2145 + client.anInt2165);

				client.aClass124_Sub17_2155 = null;
			}

		} else if (Class35.anInt375 > 1)
			client.aClass124_Sub17_2155 = null;
	}

	static void method95(final int var0, final String var1, final String var2) {
		Class49.method238(var0, var1, var2, (String) null);
	}

	public static void method96(final Class94 var0, final String var1, final String var2, final int var3,
			final boolean var4) {
		final int var5 = var0.method376(var1);
		final int var6 = var0.method383(var5, var2);
		Class2.method19(var0, var5, var6, var3, var4);
	}
}
