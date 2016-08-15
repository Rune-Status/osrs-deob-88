public final class Class113 {
	int anInt821;
	Class124_Sub22 aClass124_Sub22_819 = new Class124_Sub22();
	Class108 aClass108_820 = new Class108();
	int anInt823;
	Class107 aClass107_822;

	public Class124_Sub22 method434(final long var1) {
		final Class124_Sub22 var3 = (Class124_Sub22) aClass107_822.method409(var1);
		if (var3 != null)
			aClass108_820.method416(var3);

		return var3;
	}

	public void method435(final Class124_Sub22 var1, final long var2) {
		if (anInt821 == 0) {
			Class124_Sub22 var4 = aClass108_820.method414();
			var4.method450();
			var4.method637();
			if (var4 == aClass124_Sub22_819) {
				var4 = aClass108_820.method414();
				var4.method450();
				var4.method637();
			}
		} else
			--anInt821;

		aClass107_822.method412(var1, var2);
		aClass108_820.method416(var1);
	}

	public void method436() {
		aClass108_820.method418();
		aClass107_822.method410();
		aClass124_Sub22_819 = new Class124_Sub22();
		anInt821 = anInt823;
	}

	public void method437(final long var1) {
		final Class124_Sub22 var3 = (Class124_Sub22) aClass107_822.method409(var1);
		if (var3 != null) {
			var3.method450();
			var3.method637();
			++anInt821;
		}

	}

	public Class113(final int var1) {
		anInt823 = var1;
		anInt821 = var1;

		int var2;
		for (var2 = 1; (var2 + var2) < var1; var2 += var2)
			;

		aClass107_822 = new Class107(var2);
	}
}
