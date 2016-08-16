public class Class80 {
	static int anInt644;
	static client aclient645;
	static CacheArch aClass94_646;

	static final void method327(int var0, int var1, final int var2) {
		if ((var0 >= 128) && (var1 >= 128) && (var0 <= 13056) && (var1 <= 13056)) {
			int var6 = Class63.method285(var0, var1, Class134.anInt906) - var2;
			var0 -= Class45.anInt445;
			var6 -= Class2.anInt14;
			var1 -= Class48.anInt479;
			final int var8 = Class124_Sub22_Sub16_Sub3.anIntArray1847[Class124_Sub6.anInt1003];
			final int var7 = Class124_Sub22_Sub16_Sub3.anIntArray1848[Class124_Sub6.anInt1003];
			final int var4 = Class124_Sub22_Sub16_Sub3.anIntArray1847[Class27.anInt301];
			final int var3 = Class124_Sub22_Sub16_Sub3.anIntArray1848[Class27.anInt301];
			int var5 = ((var3 * var0) + (var4 * var1)) >> 16;
			var1 = ((var3 * var1) - (var0 * var4)) >> 16;
			var0 = var5;
			var5 = ((var6 * var7) - (var8 * var1)) >> 16;
			var1 = ((var1 * var7) + (var6 * var8)) >> 16;
			if (var1 >= 50) {
				client.anInt2085 = (client.anInt2247 / 2) + ((var0 * client.anInt2249) / var1);
				client.anInt2152 = (client.anInt2248 / 2) + ((client.anInt2249 * var5) / var1);
			} else {
				client.anInt2085 = -1;
				client.anInt2152 = -1;
			}

		} else {
			client.anInt2085 = -1;
			client.anInt2152 = -1;
		}
	}
}
