
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
	[Activity (Label = "Learn_new_words")]			
	public class Learn_new_words : Activity
	{
		protected override void OnCreate (Bundle bundle)
		{
			base.OnCreate (bundle);

			SetContentView (Resource.Layout.Learn_new_wordsScreen);

			TextView txt1 = FindViewById<TextView> (Resource.Id.textViewLearnNW);
		}
	}
}

