import java.awt.Component;

public class Class8_Sub2 extends Class8 {
	static Interface1 anInterface1_964;
	int anInt965;

	@Override
	void method44() {
		anInterface1_964.method4();
	}

	@Override
	void method42(final int var1) throws Exception {
		if (var1 > '\u8000')
			throw new IllegalArgumentException();
		else {
			anInterface1_964.method1();
		}
	}

	@Override
	int method45() {
		return anInterface1_964.method2();
	}

	@Override
	void method43() {
		anInterface1_964.method3(anInt965, anIntArray91);
	}

	Class8_Sub2(final Class82 var1, final int var2) {
		anInterface1_964 = var1.method330();
		anInt965 = var2;
	}

	@Override
	void method49() {
		anInterface1_964.method5();
	}

	@Override
	void method36(final Component var1) throws Exception {
		anInterface1_964.method6(var1, anInt94, aBool77);
	}
}
