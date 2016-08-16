public class Class124_Sub12 extends Node {
	int anInt1052;
	int anInt1053;
	int[] anIntArray1054;
	int[][] anIntArrayArray1055;

	Class124_Sub12(final int var1, final byte[] var2) {
		anInt1052 = var1;
		final RSBuf var4 = new RSBuf(var2);
		anInt1053 = var4.method558();
		anIntArray1054 = new int[anInt1053];
		anIntArrayArray1055 = new int[anInt1053][];

		int var5;
		for (var5 = 0; var5 < anInt1053; ++var5)
			anIntArray1054[var5] = var4.method558();

		for (var5 = 0; var5 < anInt1053; ++var5)
			anIntArrayArray1055[var5] = new int[var4.method558()];

		for (var5 = 0; var5 < anInt1053; ++var5)
			for (int var3 = 0; var3 < anIntArrayArray1055[var5].length; ++var3)
				anIntArrayArray1055[var5][var3] = var4.method558();

	}
}
