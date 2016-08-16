public final class Class113 {
	int anInt821;
	JagMap aClass124_Sub22_819 = new JagMap();
	Class108 aClass108_820 = new Class108();
	int anInt823;
	Class107 aClass107_822;

	public JagMap forId(final long var1) {
		final JagMap var3 = (JagMap) aClass107_822.method409(var1);
		if (var3 != null)
			aClass108_820.method416(var3);

		return var3;
	}

	public void map(final JagMap var1, final long var2) {
		if (anInt821 == 0) {
			JagMap var4 = aClass108_820.method414();
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

	public void map() {
		aClass108_820.method418();
		aClass107_822.method410();
		aClass124_Sub22_819 = new JagMap();
		anInt821 = anInt823;
	}

	public void map(final long var1) {
		final JagMap var3 = (JagMap) aClass107_822.method409(var1);
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
