public class Class26 {
	int anInt282;
	int anInt280;
	int anInt281;
	int anInt283;

	Class26() {
	}

	Class26(final Class26 var1) {
		anInt282 = var1.anInt282;
		anInt280 = var1.anInt280;
		anInt281 = var1.anInt281;
		anInt283 = var1.anInt283;
	}

	static final void method162(final int var0, final int var1, final int var2, final int var3, final int var4) {
		Class124_Sub24.aClass124_Sub22_Sub16_Sub2Array1311[0].method926(var0, var1);
		Class124_Sub24.aClass124_Sub22_Sub16_Sub2Array1311[1].method926(var0, (var1 + var3) - 16);
		Class124_Sub22_Sub16.method768(var0, var1 + 16, 16, var3 - 32, client.anInt2263);
		int var6 = ((var3 - 32) * var3) / var4;
		if (var6 < 8)
			var6 = 8;

		final int var5 = (var2 * (var3 - 32 - var6)) / (var4 - var3);
		Class124_Sub22_Sub16.method768(var0, var1 + 16 + var5, 16, var6, client.anInt2102);
		Class124_Sub22_Sub16.method772(var0, var5 + 16 + var1, var6, client.anInt2062);
		Class124_Sub22_Sub16.method772(1 + var0, 16 + var1 + var5, var6, client.anInt2062);
		Class124_Sub22_Sub16.method776(var0, var1 + 16 + var5, 16, client.anInt2062);
		Class124_Sub22_Sub16.method776(var0, 17 + var1 + var5, 16, client.anInt2062);
		Class124_Sub22_Sub16.method772(var0 + 15, var1 + 16 + var5, var6, client.anInt2105);
		Class124_Sub22_Sub16.method772(14 + var0, var5 + 17 + var1, var6 - 1, client.anInt2105);
		Class124_Sub22_Sub16.method776(var0, var1 + 15 + var5 + var6, 16, client.anInt2105);
		Class124_Sub22_Sub16.method776(1 + var0, var1 + 14 + var5 + var6, 15, client.anInt2105);
	}
}
