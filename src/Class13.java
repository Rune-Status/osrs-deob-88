public class Class13 {
	int anInt128;
	int anInt126;
	int[] anIntArray127;
	int[] anIntArray125;

	Class13() {
		client.method502(16);
		anInt128 = client.method496() != 0 ? client.method502(4) + 1 : 1;
		if (client.method496() != 0)
			client.method502(8);

		client.method502(2);
		if (anInt128 > 1)
			anInt126 = client.method502(4);

		anIntArray127 = new int[anInt128];
		anIntArray125 = new int[anInt128];

		for (int var1 = 0; var1 < anInt128; ++var1) {
			client.method502(8);
			anIntArray127[var1] = client.method502(8);
			anIntArray125[var1] = client.method502(8);
		}

	}
}
