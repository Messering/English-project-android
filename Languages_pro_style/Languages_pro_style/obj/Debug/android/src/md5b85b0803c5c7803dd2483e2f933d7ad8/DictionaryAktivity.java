package md5b85b0803c5c7803dd2483e2f933d7ad8;


public class DictionaryAktivity
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("Languages_pro_style.DictionaryAktivity, Languages_pro_style, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", DictionaryAktivity.class, __md_methods);
	}


	public DictionaryAktivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == DictionaryAktivity.class)
			mono.android.TypeManager.Activate ("Languages_pro_style.DictionaryAktivity, Languages_pro_style, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}