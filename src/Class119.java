import java.util.Iterator;

public class Class119 implements Iterable {
	public JagMap aClass124_Sub22_847 = new JagMap();

	public void method443() {
		while (aClass124_Sub22_847.aClass124_Sub22_1303 != aClass124_Sub22_847)
			aClass124_Sub22_847.aClass124_Sub22_1303.method637();

	}

	public void method444(final JagMap var1) {
		if (var1.aClass124_Sub22_1304 != null)
			var1.method637();

		var1.aClass124_Sub22_1304 = aClass124_Sub22_847.aClass124_Sub22_1304;
		var1.aClass124_Sub22_1303 = aClass124_Sub22_847;
		var1.aClass124_Sub22_1304.aClass124_Sub22_1303 = var1;
		var1.aClass124_Sub22_1303.aClass124_Sub22_1304 = var1;
	}

	public Class119() {
		aClass124_Sub22_847.aClass124_Sub22_1303 = aClass124_Sub22_847;
		aClass124_Sub22_847.aClass124_Sub22_1304 = aClass124_Sub22_847;
	}

	@Override
	public Iterator iterator() {
		return new Class123(this);
	}
}
