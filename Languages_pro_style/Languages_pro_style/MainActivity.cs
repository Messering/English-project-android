using System;

using Mono.Data.Sqlite;
using Android.App;
using Android.Content;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;

namespace Languages_pro_style
{
	[Activity (Label = "Languages_pro_style", MainLauncher = true, Icon = "@drawable/ic_dictionary")]
	public class MainActivity : Activity
	{
		/*SqliteConnection GetConnection(string path)
		{
			SqliteConnectionStringBuilder builder = 
				new SqliteConnectionStringBuilder();
			if (!File.Exists(path))
			{
				FileInfo info = new FileInfo(path);
				if (!Directory.Exists(info.Directory.FullName))
				{
					Directory.CreateDirectory(info.Directory.FullName);
				}
				SqliteConnection.CreateFile(path);
			}
			builder.DataSource = path;
			return new SqliteConnection(builder.ToString());
		}

        */


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
			//Button button_back = FindViewById<Button> (Resource.Id.back_to_main);

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

            var docsFolder = System.Environment.GetFolderPath(System.Environment.SpecialFolder.MyDocuments);
            var pathToDatabase = System.IO.Path.Combine(docsFolder, "db_sqlnet.db");
				
		}
	}
}


