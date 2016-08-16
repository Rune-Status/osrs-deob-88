public class Class17 {
	int anInt152;
	int anInt150;
	int anInt151;
	int anInt154 = 2;
	int[] anIntArray157 = new int[2];
	int[] anIntArray147 = new int[2];
	int anInt153;
	int anInt148;
	int anInt155;
	int anInt156;
	int anInt149;

	final void method81(final RSBuf var1) {
		anInt152 = var1.readByteU();
		anInt150 = var1.readInt2(-22412149);
		anInt151 = var1.readInt2(533895948);
		method82(var1);
	}

	final void method82(final RSBuf var1) {
		anInt154 = var1.readByteU();
		anIntArray157 = new int[anInt154];
		anIntArray147 = new int[anInt154];

		for (int var2 = 0; var2 < anInt154; ++var2) {
			anIntArray157[var2] = var1.readShortU();
			anIntArray147[var2] = var1.readShortU();
		}

	}

	final void method83() {
		anInt153 = 0;
		anInt148 = 0;
		anInt155 = 0;
		anInt156 = 0;
		anInt149 = 0;
	}

	final int method84(final int var1) {
		if (anInt149 >= anInt153) {
			anInt156 = anIntArray147[anInt148++] << 15;
			if (anInt148 >= anInt154)
				anInt148 = anInt154 - 1;

			anInt153 = (int) ((anIntArray157[anInt148] / 65536.0D) * var1);
			if (anInt153 > anInt149)
				anInt155 = ((anIntArray147[anInt148] << 15) - anInt156) / (anInt153 - anInt149);
		}

		anInt156 += anInt155;
		++anInt149;
		return (anInt156 - anInt155) >> 15;
	}

	Class17() {
		anIntArray157[0] = 0;
		anIntArray157[1] = '\uffff';
		anIntArray147[0] = 0;
		anIntArray147[1] = '\uffff';
	}
}
