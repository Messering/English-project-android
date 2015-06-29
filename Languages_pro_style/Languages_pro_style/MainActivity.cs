using System;

using Android.App;
using Android.Content;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;

namespace Languages_pro_style
{
	[Activity (Label = "Languages_pro_style", MainLauncher = true, Icon = "@drawable/icon")]
	public class MainActivity : Activity
	{
		//int count = 1;

		protected override void OnCreate (Bundle bundle)
		{
			base.OnCreate (bundle);

			// Set our view from the "main" layout resource
			SetContentView (Resource.Layout.Main);

			Button buttonLNW = FindViewById<Button> (Resource.Id.button_LearNW);
			Button buttonRLW = FindViewById<Button> (Resource.Id.buttonRepeatW);
			Button buttonDictionary = FindViewById<Button> (Resource.Id.buttonDictionary);
			Button buttonRT = FindViewById<Button> (Resource.Id.buttonRT);

			buttonLNW.Click += (sender, e) => {
				var intent = new Intent (this, typeof(Learn_new_words));
				StartActivity (intent);
			};

			buttonRLW.Click += (sender, e) => {
				var intent = new Intent (this, typeof(RepeatWordsAktivity));
				StartActivity (intent);
			};

			buttonDictionary.Click += (sender, e) => {
				var intent = new Intent (this, typeof(DictionaryAktivity));
				StartActivity (intent);
			};

			buttonRT.Click += (sender, e) => {
				var intent = new Intent (this, typeof(Reader_TranslaterAktivity));
				StartActivity (intent);
			};
				
		}
	}
}


