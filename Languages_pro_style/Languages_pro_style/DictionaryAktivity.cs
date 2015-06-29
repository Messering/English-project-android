
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;

namespace Languages_pro_style
{
	[Activity (Label = "DictionaryAktivity")]			
	public class DictionaryAktivity : Activity
	{
		protected override void OnCreate (Bundle bundle)
		{
			base.OnCreate (bundle);

			SetContentView (Resource.Layout.DictionaryScreen);

			TextView txt3 = FindViewById<TextView> (Resource.Id.textViewDictionary);
		}
	}
}

